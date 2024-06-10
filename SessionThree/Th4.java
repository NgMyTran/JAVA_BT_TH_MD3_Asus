/*Doi nhiet do C=>F, F=>C */

package SessionThree;
import java.util.Scanner;
public class Th4 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double celsius;
    double fahrenheit;
    int choice;
    do {
        System.out.println("1. Đổi từ độ C sang độ F.");
        System.out.println("2. Đổi từ độ F sang độ C.");
        System.out.println("3. Thoát.");
        System.out.println("Chọn chức năng: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhập độ C: ");
                celsius = scanner.nextDouble();

                fahrenheit = celsius * 1.8 + 32;

                System.out.println("Độ F: " + fahrenheit);
                break;


            case 2:
                System.out.println("Nhập độ F: ");
                fahrenheit = scanner.nextDouble();

                celsius = (fahrenheit - 32) / 1.8;

                System.out.println("Độ C: " + celsius);
                break;

                
            case 3:
                System.out.println("Thoát.");
                break;
            default:
                System.out.println("Chức năng không hợp lệ.");
                break;
        }
    } while (choice != 3);
   } 
}
