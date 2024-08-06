package ontapBuoi6Ngay23.ra.design;

import ontapBuoi6Ngay23.ra.entity.Students;

public interface IStudentDesign extends IGenericCrud<Students, String> {
    void getClassWithTotalStudents();
}
