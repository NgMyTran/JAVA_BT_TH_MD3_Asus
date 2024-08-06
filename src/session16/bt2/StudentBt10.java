package session16.bt2;

import java.util.Arrays;

class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa); // Compare by GPA
    }

    @Override
    public String toString() {
        return name + " (" + gpa + ")";
    }
}

public class StudentBt10 {
    public static void bubbleSort(Student[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(Student[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Student temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void insertionSort(Student[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static long measureSortingTime(Student[] arr, SortingAlgorithm algorithm) {
        Student[] arrayCopy = Arrays.copyOf(arr, arr.length);
        long startTime = System.nanoTime();
        algorithm.sort(arrayCopy);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    @FunctionalInterface
    interface SortingAlgorithm {
        void sort(Student[] arr);
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("An", 3.6),
                new Student("Bao", 3.9),
                new Student("Chung", 3.2)
        };

        long bubbleSortTime = measureSortingTime(students, StudentBt10::bubbleSort);
        System.out.println("Bubble Sort time: " + bubbleSortTime + " nanoseconds");
        System.out.println("Sorted by Bubble Sort:");
        System.out.println(Arrays.toString(students));

        long selectionSortTime = measureSortingTime(students, StudentBt10::selectionSort);
        System.out.println("Selection Sort time: " + selectionSortTime + " nanoseconds");
        System.out.println("Sorted by Selection Sort:");
        System.out.println(Arrays.toString(students));

        long insertionSortTime = measureSortingTime(students, StudentBt10::insertionSort);
        System.out.println("Insertion Sort time: " + insertionSortTime + " nanoseconds");
        System.out.println("Sorted by Insertion Sort:");
        System.out.println(Arrays.toString(students));
    }
}

