package session11.bt9VIP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Object> Students = new ArrayList<>();

        System.out.print("Nhập số lượng sinh viên: ");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        StudentManagement studentManagement = new StudentManagement();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            System.out.println("Mã số sinh viên: ");
            int studentId = Integer.parseInt(scanner.nextLine());
            System.out.print("Họ và tên: ");
            String studentName = scanner.nextLine();
            System.out.print("Điểm trung bình: ");
            double averageScore= Double.parseDouble(scanner.nextLine());
            Student student = new Student(studentId, studentName, averageScore);
            studentManagement.addStudent(student);
        }
        System.out.println("Danh sách sinh viên sau khi nhập: ");
        studentManagement.showAll();

        double averageScore = studentManagement.getAverageScore();
        System.out.println("Điểm trung bình của tất cả sinh viên: " + averageScore);

        studentManagement.sortByScore();
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm: ");
        studentManagement.showAll();
    }
}
