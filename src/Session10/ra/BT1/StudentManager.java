package Session10.ra.BT1;
public class StudentManager {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.startApplication();
    }

    public void startApplication() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setName("Nguyễn Văn Nam");
        student1.setAge(19);
        student1.setAdd("HN");
//        display(student1);
        student2.setName("Trần Thùy Trang");
        student2.setAge(18);
        student2.setAdd("TH");
        student3.setName("Tống Mạnh Hùng");
        student3.setAge(18);
        student3.setAdd("ND");

        display(student1);
        display(student2);
        display(student3);
    }

    private void display(Student student) {
        System.out.println("------------------------------------------");
        System.out.println("     Thông tin Sinh Viên");
        System.out.println("Tên Sinh Viên : " + student.getName());
        System.out.println("Tuổi          : " + student.getAge());
        System.out.println("Địa chỉ       : " + student.getAdd());
    }
}

class Student {
    private String name, add;
    private int age;

    public Student() {}
    public Student(String name, int age, String add) {
        this.name = name;
        this.age = age;
        this.add = add;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() { return age;}
    public void setAge(int age) {this.age = age;}

    public String getAdd() {return add;}
    public void setAdd(String add) {this.add = add;}
}
