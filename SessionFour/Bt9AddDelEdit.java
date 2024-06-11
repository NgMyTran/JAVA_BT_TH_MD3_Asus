/* Menu hiển thị danh sách học sinh,thêm, sửa, xóa, thoát mã HS, tên HS, tuổi, giới tính */

package SessionFour;

import java.util.Scanner;

public class Bt9AddDelEdit {
    private String studentId;
    private String studentName;
    private int age;
    

    // Constructor không tham số
    public Bt9AddDelEdit() {}

    // Constructor có tham số
    public Bt9AddDelEdit(String studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    // Phương thức nhập dữ liệu
    public void inputData(Scanner scanner) {
        System.out.print("Enter student ID: ");
        this.studentId = scanner.nextLine();

        System.out.print("Enter student name: ");
        this.studentName = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); 

       
    }

    // Phương thức hiển thị dữ liệu
    public void displayData() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Age: " + this.age);
      
    }
}
