package session18.test.ioeFile.service;

import session18.test.ioeFile.model.Student;
import java.util.List;

public interface IStudentService extends IGenericService<Student, Integer> {
    int getNewId();
    List<Student> findByName(String name);
}
