package session12;

import java.util.Stack;

public class Bt5 {
    public static int findMaxElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || arr[i] > stack.peek()) {
                stack.push(arr[i]);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        int arr1[] = {6, 3, 45, 7, 3, 8};
        System.out.println("Phần tử lớn nhất trong mảng là: " + findMaxElement(arr1));
        int arr2[] = {95, 238, 94, 6};
        System.out.println("Phần tử lớn nhất trong mảng là: " + findMaxElement(arr2));
    }
}


