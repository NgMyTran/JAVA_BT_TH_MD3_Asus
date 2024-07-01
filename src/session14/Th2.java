package session14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Th2 {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numList.add(sc.nextInt());
        }

    }
}
