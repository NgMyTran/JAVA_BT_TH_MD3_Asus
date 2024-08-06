package session16.bt2;

import java.util.Scanner;

public class Bt8StringInsert {
    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;

            //tang tu a-->z
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = Integer.parseInt(scanner.nextLine());

        String[] arr = new String[n];

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        insertionSort(arr);

        System.out.println("Sorted strings:");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
