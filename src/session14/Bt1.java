package session14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Bt1 {
    public static void main(String[] args) {
//        Sử dụng Stream API để duyệt qua mảng và phương thức max() để tìm số lớn nhất trong mảng.
//        Sử dụng Stream API và phương thức filter() để tìm số chẵn
//        Sử dụng Stream API và phương thức filter() để lọc các số lớn hơn một giá trị xác định mà người dùng nhập vào
//        Sử dụng Stream API và phương thức reduce() để tính tổng của các số trong danh sách.
//        Sử dụng Stream API và phương thức anyMatch() để kiểm tra xem danh sách có chứa ít nhất một số chẵn hay không.
//        Sử dụng Stream API và phương thức range() để tạo danh sách các số từ x đến y.
//        Sử dụng Stream API và phương thức sorted() để sắp xếp danh sách theo thứ tự bảng chữ cái.
//        Sử dụng Stream API và phương thức map() để chuyển các chuỗi thành chữ in hoa.
//        int[] numbers = {3, 7, 1, 9, 4, 6};
//        int maxNumber = Arrays.stream(numbers).max().getAsInt();
        Random random = new Random();
        List<Integer> numberList = Stream.generate(()-> random.nextInt(50)).limit(50).collect(Collectors.toList());
        Optional<Integer> maxNumber= numberList.stream().max(Integer::compareTo);
        System.out.println("Số lớn nhất trong mảng là: " + maxNumber);

//        System.out.println("Các số chẵn trong mảng:");
//        Arrays.stream(numbers)
//                .filter(num -> num % 2 == 0)
//                .forEach(System.out::println);
        System.out.println("Các số chẵn trong mảng:");
        Stream<Integer> numbersStream = numberList.stream().filter(num->num%2==0);
        numbersStream.forEach(System.out::println);

        int[] numbers = {3, 7, 1, 9, 4, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị để lọc: ");
        int filterValue = scanner.nextInt();
        System.out.println("Các số lớn hơn " + filterValue + " trong mảng:");
        Arrays.stream(numbers)
                .filter(num -> num > filterValue)
                .forEach(System.out::println);

        int sum = Arrays.stream(numbers).reduce(0, (temp,num) -> temp+num);
        System.out.println("Tổng của các số trong mảng là: " + sum);

        boolean hasEvenNumber = Arrays.stream(numbers).anyMatch(num -> num % 2 == 0);
        if (hasEvenNumber) {
            System.out.println("Danh sách có ít nhất một số chẵn.");
        } else {
            System.out.println("Danh sách không có số chẵn.");
        }

        System.out.println("Danh sách các số từ 1 đến 10:");
        IntStream.range(1, 11).forEach(System.out::println);

        String[] names = {"John", "Alice", "Bob", "David"};
        System.out.println("Danh sách đã sắp xếp:");
        Arrays.stream(names)
                .sorted()
                .forEach(System.out::println);

        String[] words = {"apple", "banana", "orange"};
        System.out.println("Các chuỗi chữ in hoa:");
        Arrays.stream(words)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
