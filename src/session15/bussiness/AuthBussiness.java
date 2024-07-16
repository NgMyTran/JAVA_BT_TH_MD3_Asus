package session15.bussiness;

import org.mindrot.jbcrypt.BCrypt;
import session15.entity.RoleName;
import session15.entity.User;
import session15.exception.UsernameAndPasswordException;
import session15.util.IOFile;

import java.util.List;

public class AuthBussiness implements IAuthDesign {
    private static List<User> users;

    static {
        users = IOFile.readFromFile(IOFile.USER_PATH);
    }

    @Override
    public User signIn(String username, String password) {
        return users.stream().filter(u -> u.getEmail().equals(username) && BCrypt.checkpw(password, u.getPassword()))
                .findFirst().orElseThrow(() -> new UsernameAndPasswordException("username or password incorrect!"));
    }

    @Override
    public void signUp(User user) {
        user.setBlocked(false);
        user.setRoleName(RoleName.USER);
        user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(5)));
        users.add(user);
        IOFile.writeToFile(IOFile.USER_PATH, users);
    }
}
