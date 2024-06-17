package Session9.TH3;

public class Student extends Person {
    public Student() {}
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void display() {
        System.out.println("Student{ Name: " + this.getName() + ", Age: " + this.getAge() + "}");
    }
}
