package session11.bt4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bt4 {
    public static void sortNumbers(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j)<list.get(minIndex)) {
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                Collections.swap(list, i, minIndex);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của danh sách: ");
        int size = scanner.nextInt();

        List<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Nhập " + size + " số nguyên:");
        for(int i=0; i<size; i++){
            int num=Integer.parseInt(scanner.next());
            numbers.add(num);
        }

        sortNumbers((ArrayList<Integer>) numbers);
        System.out.println("Danh sách sau khi đã sắp xếp: ");
        System.out.println(numbers);
    }
}
