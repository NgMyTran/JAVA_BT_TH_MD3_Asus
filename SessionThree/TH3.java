/* Tìm giá trị lớn nhất trong mảng */

package SessionThree;

import java.util.Scanner;

public class TH3 {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập kích thước hợp lệ (<= 20)
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        // Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        // In ra danh sách mảng đã nhập
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println(); // Để in một dòng mới sau danh sách tài sản

        // Duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }

        // In ra giá trị lớn nhất và vị trí của nó
        System.out.println("The largest property value in the list is " + max + ", at position " + index);
    }
}
