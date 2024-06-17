package Session9.TH3;

public class MainTH4 {
    public static void main(String[] args) {
        Student student1 = new Student("Tran", 23);
        Student student2 = new Student("Huyen", 23);

        Teacher teacher = new Teacher("Co Van", 45);
        Teacher teacher2 = new Teacher("co Quyet", 45);

        student1.display();
        student2.display();
        teacher.display();
        teacher2.display();
    }
}
