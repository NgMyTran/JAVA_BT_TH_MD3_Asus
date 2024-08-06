package ontapBuoi6Ngay23.ra.designimpl;

import ontapBuoi6Ngay23.ra.design.IStudentDesign;
import ontapBuoi6Ngay23.ra.entity.ClassWithStudent;
import ontapBuoi6Ngay23.ra.entity.Students;
import ontapBuoi6Ngay23.ra.util.MyArray;

import static ontapBuoi6Ngay23.ra.designimpl.ClassesImpl.classList;

public class StudentImpl implements IStudentDesign {
    private static MyArray<Students> studentList = new MyArray<>();

    static {
        // khởi tạo dữ liệu mẫu
//        Classes c1 = new Classes("C0001", "JV240304");
//        Classes c2 = new Classes("C0002", "JV231129");
//        classList.add(c1);
//        classList.add(c2);

//        Students s1 = new Students("S001", "Nguyen Van A", 19, "HN", c1);
//        Students s2 = new Students("S002", "Nguyen Van B", 19, "HN", c2);
//        Students s3 = new Students("S003", "Nguyen Van C", 19, "HN", c1);
//        Students s4 = new Students("S004", "Nguyen Van D", 19, "HN", c2);
//        Students s5 = new Students("S005", "Nguyen Van E", 19, "HN", c1);
//
//        studentList.add(s1);
//        studentList.add(s2);
//        studentList.add(s3);
//        studentList.add(s4);
//        studentList.add(s5);
    }

    @Override
    public void add(Students students) {
        if (classList.size() > 0) {
            studentList.add(students);
            System.out.println("Thêm moi thành công");
        } else {
            System.err.println("Chưa có lớp");
        }
    }

    @Override
    public void update(Students students) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void display() {
        if (studentList.size() == 0) {
            System.err.println("Danh sách rỗng");
            return;
        }
        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).print();
        }
    }

    @Override
    public Students findById(String id) {
        return null;
    }

    public void getClassWithTotalStudents() {
        // tính tổng số hc sinh từng lớp
        MyArray<ClassWithStudent> classWithStudentList = new MyArray<>();
        for (int i = 0; i < studentList.size(); i++) {
            int index = indexOfByClassId(studentList.get(i).getClasses().getClassId(), classWithStudentList);
            if (index != -1) {
                // số lượng lên 1
                ClassWithStudent old = classWithStudentList.get(index);
                old.setTotalStudents(old.getTotalStudents() + 1);
            } else {
                ClassWithStudent newClaseStudent = new ClassWithStudent(studentList.get(i).getClasses(), 1);
                classWithStudentList.add(newClaseStudent);
            }
        }

        if (classWithStudentList.size() > 0) {
            for (int i = 0; i < classWithStudentList.size(); i++) {
                ClassWithStudent element = classWithStudentList.get(i);
                System.out.printf("|ClassName : %-10s | totalStudents : %-4s |\n", element.getClasses().getClassName(), element.getTotalStudents());

            }
        }
    }

    private int indexOfByClassId(String classId, MyArray<ClassWithStudent> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getClasses().getClassId().equals(classId)) {
                return i;
            }
        }
        return -1;
    }

}
