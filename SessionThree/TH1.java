/* Đảo ngược phần tử trong mảng */

package SessionThree;

import java.util.Scanner;

public class TH1 {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập kích thước hợp lệ (<= 20)
        do {
            System.out.print("Số lượng chữ số bạn sẽ nhập (<= 20): ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Số lượng nhập không vượt quá 20. Vui lòng thử lại.");
            }
        } while (size > 20);

        // Khởi tạo mảng với kích thước (số lượng phần tử) đã chỉ định
        array = new int[size];


        // Yêu cầu người dùng nhập các phần tử của mảng
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Hiển thị các phần tử của mảng "%-20s%s"
        System.out.printf( "Các (số) phần tử trong mảng: ", "");
        for (int element : array) {
            System.out.print(element + "\t");
        }

        // Đảo ngược mảng
        for (int j = 0; j < array.length/2 ; j++) {
            int temp = array[j];
            array[j] = array[size -1-j];
            array[size - 1-j ] = temp;

        }

        // Hiển thị mảng đã đảo ngược
        System.out.printf("\n%-20s%s", "Mảng đảo ngược: ", "");
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }
}
