package session16.bt2;

import java.util.Scanner;

public class Bt7InsertSort {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int indexInsert = i;
            for (int k = i - 1; k >= 0 && currentValue < arr[k]; k--) {
                arr[k + 1] = arr[k];
                indexInsert = k;
            }
            arr[indexInsert] = currentValue;
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

        insertSort(arr);

        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
