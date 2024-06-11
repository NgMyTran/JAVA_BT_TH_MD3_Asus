package SessionFour;

import java.util.Scanner;
 import java.util.ArrayList;


import SessionFour.Bt7MyClass;

public class MainBt {
       /* Bt1 - Circle */    
//     public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.print("Nhap ban kinh hinh tron:");
//     double radius = scanner.nextDouble();

//     Bt1Circle circle = new Bt1Circle(radius);
//     System.out.println("Your Circle \n"+ circle.display());
//     System.out.println("Perimeter of the Circle: "+ circle.getPerimeter());
//     System.out.println("Area of the Circle: "+ circle.getArea());
// }

/* Bt 4 - Fan */
//  public static void main(String[] args) {
//         // Tạo 2 đối tượng Fan
//         Bt4Fan fan1 = new Bt4Fan();
//         fan1.setSpeed(fan1.FAST);
//         fan1.setRadius(10);
//         fan1.setColor("yellow");
//         fan1.setOn(true);
//         // System.out.println(fan1.getSpeed());

//         Bt4Fan fan2 = new Bt4Fan();
//         fan2.setSpeed(fan2.MEDIUM);
//         fan2.setRadius(5);
//         fan2.setColor("blue");
//         fan2.setOn(false);

//         // Hiển thị các đối tượng bằng cách gọi phương thức toString
//         System.out.println(fan1);
//         System.out.println(fan2.toString());
//     }

/*Bt7 - MyClass */


    // public static void main(String[] args) {
    //     Bt7MyClass obj = new Bt7MyClass("Hello");
    //     System.out.println("Initial value of myString: " + obj.getMyString());

        
    //     obj.setMyString("Goodbye");
        
      
    //     System.out.println("New value of myString: " + obj.getMyString());
    // }

    /*Bt2 - Phg Trinh */

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter a: ");
    //     double a = scanner.nextDouble();
    //     System.out.print("Enter b: ");
    //     double b = scanner.nextDouble();
    //     System.out.print("Enter c: ");
    //     double c = scanner.nextDouble();

    //     Bt2PhgTrinh equation = new Bt2PhgTrinh(a, b, c);
    //     double delta = equation.getDiscriminant();

    //     if (delta > 0) {
    //         System.out.println("Phuong trinh co 2 nghiem: " + equation.getRoot1() + " and " + equation.getRoot2());
    //     } else if (delta == 0) {
    //         System.out.println("The equation has one root: " + equation.getRoot());
    //     } else {
    //         System.out.println("Phuong trinh khong co nghiem thuc");
    //     }
    // }

    /* Bt9 - them, sua , xoa */

    private static ArrayList<Bt9AddDelEdit> studentList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== STUDENT MANAGEMENT MENU =====");
            System.out.println("1. Hien thi danh sach sinh vien");
            System.out.println("2. Add new student");
            System.out.println("3. Edit student by ID");
            System.out.println("4. Delete student by ID");
            System.out.println("5. Thoat chuong trinh");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    displayAllStudents();
                    break;
                case 2:
                    addNewStudent(scanner);
                    break;
                case 3:
                    editStudentById(scanner);
                    break;
                case 4:
                    deleteStudentById(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Bt9AddDelEdit student : studentList) {
                student.displayData();
                System.out.println("------------------------");
            }
        }
    }

    private static void addNewStudent(Scanner scanner) {
        Bt9AddDelEdit newStudent = new Bt9AddDelEdit();
        newStudent.inputData(scanner);
        studentList.add(newStudent);
        System.out.println("Student added successfully!");
    }

    private static void editStudentById(Scanner scanner) {
        System.out.print("Enter student ID to edit: ");
        String studentId = scanner.nextLine();
        boolean found = false;
        for (Bt9AddDelEdit student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                student.inputData(scanner);
                System.out.println("Student information updated successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    private static void deleteStudentById(Scanner scanner) {
        System.out.print("Enter student ID to delete: ");
        String studentId = scanner.nextLine();
        boolean found = false;
        for (Bt9AddDelEdit student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                studentList.remove(student);
                System.out.println("Student deleted successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

}


