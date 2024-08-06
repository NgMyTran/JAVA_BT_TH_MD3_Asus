package session16.bt2;

import java.util.Arrays;
import java.util.Scanner;

public class Bt2Binary {
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of numbers in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.print("Enter the number to find: ");
        int key = sc.nextInt();

        int index = binarySearch(arr, key);
        if (index != -1) {
            System.out.println("The number " + key + " is found at index: " + index);
        } else {
            System.err.println("Not found");
        }
    }
}
