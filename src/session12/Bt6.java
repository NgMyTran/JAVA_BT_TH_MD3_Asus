package session12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bt6 {
    public static int findSmallest(int[]arr) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }

        int min=queue.poll();
        while(!queue.isEmpty()) {
            int temp= queue.poll();
            if(temp<min) {
                queue.offer(temp);
                min=temp;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter element "+(i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(findSmallest(arr));
    }
}
