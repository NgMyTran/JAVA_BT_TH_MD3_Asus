package session16.bt2;

import java.util.Arrays;
import java.util.Random;

public class Bt9Efficiency {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static int[] generateRandomArray(int size, int bound) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(bound);
        }
        return arr;
    }

    public static void main(String[] args) {
        int size = 1000; // Adjust the size as needed
        int bound = 10000; // Maximum value for random integers

        int[] originalArray = generateRandomArray(size, bound);
        int[] arrayForBubbleSort = Arrays.copyOf(originalArray, originalArray.length);
        int[] arrayForSelectionSort = Arrays.copyOf(originalArray, originalArray.length);
        int[] arrayForInsertionSort = Arrays.copyOf(originalArray, originalArray.length);

        long startTime = System.nanoTime();
        bubbleSort(arrayForBubbleSort);
        long endTime = System.nanoTime();
        long bubbleSortTime = endTime - startTime;

        startTime = System.nanoTime();
        selectionSort(arrayForSelectionSort);
        endTime = System.nanoTime();
        long selectionSortTime = endTime - startTime;

        startTime = System.nanoTime();
        insertionSort(arrayForInsertionSort);
        endTime = System.nanoTime();
        long insertionSortTime = endTime - startTime;

        System.out.println("Bubble Sort time: " + bubbleSortTime + " nanoseconds");
        System.out.println("Selection Sort time: " + selectionSortTime + " nanoseconds");
        System.out.println("Insertion Sort time: " + insertionSortTime + " nanoseconds");
    }
}
