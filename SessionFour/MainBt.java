package SessionFour;

import java.util.Scanner;

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
 public static void main(String[] args) {
        // Tạo 2 đối tượng Fan
        Bt4Fan fan1 = new Bt4Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Bt4Fan fan2 = new Bt4Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Hiển thị các đối tượng bằng cách gọi phương thức toString
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
