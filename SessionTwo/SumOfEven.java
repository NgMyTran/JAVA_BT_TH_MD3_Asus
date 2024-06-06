/*BT 5 - Ses2: Tính tổng các số chẵn trong khoảng cho trước */

package SessionTwo;

import java.util.Scanner;

public class SumOfEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số đầu: ");
        int n = scanner.nextInt();

         System.out.println("Nhập số cuối: ");
        int m = scanner.nextInt();

        int sum = 0;

        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng từ " + n + "đến " + m+ "là:"  + sum);
    }
}
