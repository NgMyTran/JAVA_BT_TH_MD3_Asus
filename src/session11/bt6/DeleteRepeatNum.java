package session11.bt6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteRepeatNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Nhập số lượng phần tử của danh sách: ");
        int size=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            numbers.add(sc.nextInt());
        }

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for(Integer num : numbers) {
            if(!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }
        System.out.println("Danh sách ban đầu:");
        System.out.println(numbers);
        System.out.println("Danh sách các phần tử không trùng lặp:");
        System.out.println(uniqueNumbers);
    }
}
