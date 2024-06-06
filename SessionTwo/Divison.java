/*BT 2 - Session2 :khai bien if %3 (or 5) => chỉ chia hết cho 3 (or 5)
 * if %3 && %5 => chia hết cho 3 và 5
 */

package SessionTwo;
import java.util.Scanner;
public class Divison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
int number = scanner.nextInt();
if (number % 3 == 0 && number % 5 == 0) {
    System.out.println(number + " chia hết cho 3 và 5");
} else if (number % 3 == 0) {
    System.out.println(number + " chia hết cho 3");
} else if (number % 5 == 0) {
    System.out.println(number + " chia hết cho 5");
} else {
    System.out.println(number + " không chia hết cho 3 và 5");
    
}
    }
}
