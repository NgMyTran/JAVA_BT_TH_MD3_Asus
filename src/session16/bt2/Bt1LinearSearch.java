package session16.bt2;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bt1LinearSearch {
    public static int linearSearchList(List<Integer> list, int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key)
                return i;
        }
        return -1;
    }

    public static int findExist(List<Integer> list, int key) {
        return linearSearchList(list, key);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = Stream.generate(() -> rand.nextInt(50)).limit(10).collect(Collectors.toList());

        System.out.println("Generated list: " + list);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find: ");
        int key = sc.nextInt();

        int index = findExist(list, key);
        if (index != -1) {
            System.out.println("The number " + key + " is found at index: " + index);
        } else {
            System.out.println("The number " + key + " is not found in the list.");
        }
    }
}
