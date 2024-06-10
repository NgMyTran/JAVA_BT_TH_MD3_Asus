package SessionThree;

import java.util.Scanner;

public class Bt9MaxInt {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Phan tu cua mang: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max2 = max;
                max = array[j];
            } else if (array[j] > max2 && array[j] < max) {
                max2 = array[j];
            }
        }
        System.out.println("Max 2 trong mang: " + max2);
    }
}
