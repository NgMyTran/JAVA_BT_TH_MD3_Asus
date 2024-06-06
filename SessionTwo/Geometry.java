/*BT 9 - Ses2: tạo menu 1.Tính chu vi và diện tích hình chữ nhật .

2.Tính chu vi và diện tích hình tam giác

3.Tính chu vi và diện tích hình tròn.

4.Thoát */

package SessionTwo;
import java.util.Scanner;
public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật.");
            System.out.println("2. Tính chu vi và diện tích hình tam giác.");
            System.out.println("3. Tính chu vi và diện tích hình tròn.");
            System.out.println("4. Thoát.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài hình chữ nhật: ");
                    int length = scanner.nextInt();
                    System.out.println("Nhập chiều rộng hình chữ nhật: ");
                    int width = scanner.nextInt();
                    System.out.println("Chu vi hình chữ nhật là: " + (length + width) * 2);
                    System.out.println("Diện tích hình chữ nhật là: " + length * width);
                    break;

                case 2:
                    System.out.println("Nhập cạnh a của tam giác: ");
                    int a = scanner.nextInt();
                    System.out.println("Nhập cạnh b của tam giác: ");
                    int b = scanner.nextInt();
                    System.out.println("Nhập cạnh c của tam giác: ");
                    int c = scanner.nextInt();
                      System.out.println("Chu vi tam giác là: " + (a + b + c));
                        double p = (a + b + c) / 2;
                        System.out.println("Diện tích tam giác là: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));

            //  if (a + b > c && a + c > b && b + c > a) {
            //             System.out.println("Chu vi tam giác là: " + (a + b + c));
            //             double p = (a + b + c) / 2;
            //             System.out.println("Diện tích tam giác là: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
            //         } else {
            //             System.out.println("Đây không phải là tam giác.");
            //         }
                    break;

                case 3:
                    System.out.println("Nhập bán kính hình tròn: ");
                    int radius = scanner.nextInt();
                    System.out.println("Chu vi hình tròn là: " + 2 * Math.PI * radius);
                    System.out.println("Diện tích hình tròn là: " + Math.PI * radius * radius);
       
    }
}while (choice != 4);
}
}

