package session15.bussiness;

import session15.entity.User;

public interface IAuthDesign {
    User signIn(String userName, String password);

    void signUp(User user);
}
