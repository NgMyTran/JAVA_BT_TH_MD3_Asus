package SessionFour;

import java.util.Scanner;

// import javafx.scene.shape.Rectangle;

public class MainTH {
    /* Rectangle */    
//     public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.print("Enter the width:");
//     double width = scanner.nextDouble();

//     System.out.print("Enter the height:");
//     double height = scanner.nextDouble();

//     Th1Rectangle rectangle = new Th1Rectangle(width, height);
//     System.out.println("Your Rectangle \n"+ rectangle.display());
//     System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
//     System.out.println("Area of the Rectangle: "+ rectangle.getArea());
// }

/* Student */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the studentId:");
    String studentId = scanner.nextLine();

    System.out.print("Enter the studentName:");
    String studentName = scanner.nextLine();

    System.out.print("Enter the studentSex:");
    String sex = scanner.nextLine();

    Th2Student student = new Th2Student(studentId, studentName,sex);
    System.out.println("Your Student \n"+ student.display());
}
}
