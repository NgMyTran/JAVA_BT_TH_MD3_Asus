package session16.bt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bt9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = sc.nextInt();
            list.add(num);
        }
        Collections.sort(list);

        System.out.print("Enter min value: ");
        int min = sc.nextInt();
        System.out.print("Enter max value: ");
        int max = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= min) {
                for (int j = i; j < list.size(); j++) {
                    if (list.get(j) < max) {
                        result.add(list.get(j));
                    } else {
                        break;
                    }
                }
                break;
            }
        }

        if (result.isEmpty()) {
            System.out.println("No numbers found in the specified range.");
        } else {
            System.out.println("Found " + result.size() + " number(s) within the range [" + min + ", " + max + "]:");
            for (int num : result) {
                System.out.println(num);
            }
        }
    }
}
