package session16.bt2;

import java.util.Comparator;
import java.util.Scanner;

public class Bt5SelectionSort {
    public static void selectionSort(int[] arr, Comparator<Integer> comparator) {
        boolean isNext = true;
        for (int i = 0; i < arr.length - 1 && isNext; i++) {
            System.out.println("Vòng lặp i : " + i);
            isNext = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                System.out.println("\tvòng lặp j :" + j);
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    // đổi vị trí 2 phần tử
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isNext = true; // nếu như có sự đổi chỗ 2 phâ ử thì mảng vẫn cần được sắp xếp
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Comparator<Integer> comparator = Integer::compareTo;
        selectionSort(arr, comparator);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
