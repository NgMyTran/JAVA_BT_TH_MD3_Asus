package session17.bt;

import session17.bt.bt1.Bt1CheckedException;

import java.util.*;

public class Bt2 {
    public static boolean isArrEmpty(int[] arr) throws Bt1CheckedException {
        if(arr == null || arr.length == 0){
            throw new Bt1CheckedException("Empty array don't have max");
        }
        return arr.length == 0;
    }

    public static int findBiggest(int[]arr) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }
        int max=queue.poll();
        while(!queue.isEmpty()) {
            int temp= queue.poll();
            if(temp>max) {
                queue.offer(temp);
                max=temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++) {
//            System.out.println("Enter element "+(i+1)+ " : ");
//            arr[i] = sc.nextInt();
//        }
//        try {
//            if (!isArrEmpty(arr)) {
//                System.out.println("The biggest element is: " + findBiggest(arr));
//            }
//        } catch (Bt1CheckedException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(findBiggest(arr));
        int n;
        try{
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n < 0) {
                    System.out.println("Number >0");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter an integer");
            }
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu arr[i]: ");
            arr[i] = Integer.parseInt(sc.nextLine());

        }
        if (arr.length == 0) {
            throw new RuntimeException("Empty array");
        }

        OptionalInt max = Arrays.stream(arr).max();

        max.ifPresent(value -> System.out.println("max: "+value));
    }catch(RuntimeException e){
        System.out.println(e.getMessage());
    }
    }
}
