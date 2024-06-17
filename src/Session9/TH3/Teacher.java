package Session9.TH3;

public class Teacher extends Person {
    public Teacher() {}
    public Teacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void display() {
        System.out.println("Teacher{ Name: " + this.getName() + ", Age: " + this.getAge() + "}");
    }
}
