package session11.bt5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập số lượng phần tử của danh sách: ");
//        int size = Integer.parseInt(sc.nextLine());
//
//        List<Integer> evenNumbers = new ArrayList<Integer>();
//        for (int i = 0; i < size; i++) {
//            evenNumbers.add(sc.nextInt());
//        }
//        for (int i = 0; i < evenNumbers.size(); i++) {
//            if(evenNumbers.get(i) %2==0){
//                evenNumbers.remove(i);
//            }
//        }
//        System.out.println(evenNumbers);
        System.out.print("Nhập số lượng phần tử của danh sách: ");
        int size = Integer.parseInt(sc.nextLine());

        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            numbers.add(sc.nextInt());
        }

        List<Integer> oddNumbers=new ArrayList<>();
        for(int num:numbers){
            if(num%2!=0){
                oddNumbers.add(num);
            }
        }
        System.out.println("Danh sách ban đầu:");
        System.out.println(numbers);

        System.out.println("Danh sách sau khi loại bỏ các số chẵn:");
        System.out.println(oddNumbers);

    }
}
