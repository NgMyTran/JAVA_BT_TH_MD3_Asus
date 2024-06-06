/*BT 1 - Ses2 : Chuyển số thành chữ (tiếng việt) */
package SessionTwo;
import java.util.Scanner;

public class ConvertNum {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Nhập số muốn chuyển từ 1-5: ");
int number = scanner.nextInt();
switch (number) {
case 1:
number=1;
System.out.println("Số một");
break;
case 2:
number=2;
System.out.println("Số hai");
break;
case 3:
number=3;
System.out.println("Số ba");
break;
case 4:
number=4;
System.out.println("Số bốn");
break;
case 5:
number=5;
System.out.println("Số năm");
break;
default:
System.out.println("Số bạn nhập không hợp lệ");
break;
    }
}}
