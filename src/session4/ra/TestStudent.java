package session4.ra;

public class TestStudent {
    //block code: khai bao cac thanh phan cua 1 class
    public String studentName = "T";// khoi tao gtri name=T
    public int age;// moi khai bao, chua khoi tao, gia tri khoi tao hien tai: 0
    public boolean gender;

    //Overloading: constructor sau de len cai trc, load chong khi ung vs dk tuong thich
    public TestStudent() {
        System.out.println("Constructor dc goi");
    }

    public TestStudent(String studentName, int age, boolean gender) {
        //nhan thuoc tinh de khoi tao obj
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
    }

    public void printName() {
        System.out.println("My Name's: " + studentName);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAgeAfterAnyYear(int yearCount) {
        return age + yearCount;
    }

    @Override
    public String toString() {
        return "TestStudent{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
