package session16.bt2;

import java.util.Scanner;

public class Bt4BubbleSortCount {

    public static int bubbleSortWithSwapCount(int[] arr) {
        int n = arr.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++; // Increment swap count
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return swapCount;
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

        int swapCount = bubbleSortWithSwapCount(arr);

        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("Number of swaps: " + swapCount);
    }

}
