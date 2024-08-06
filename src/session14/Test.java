package session14;

import session14.th1.Table;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Table t = new Table();

        //tạo ra 100 số ngẫu nhiên không trùng lặp từ 0->1000
        List<Integer> random = Stream.generate(() -> new Random().nextInt(1001)).limit(100).distinct().collect(Collectors.toList());
        //sắp xếp theo chiều giảm dần
        random.sort(Comparator.reverseOrder());

        //lọc ra các số nguyên tố và in ra
        List<Integer> primes = new ArrayList<>();
        for (Integer number : random) {
            if (isPrime(number)) {
                primes.add(number); // Thêm số nguyên tố vào List
            }
        }
        System.out.println("Các số nguyên tố:");
        for (Integer prime : primes) {
            System.out.print(prime + ", "); // In ra từng số nguyên tố
        }
        //in ra bình phương của các số nguyên tố tìm được
        primes.stream().map(n -> n * n).forEach(System.out::println);

        //đếm xem có bao nhiêu số nguyên tố trong dnah sách 100 số
        long primeCount = primes.size();
        System.out.println("Số lượng số nguyên tố: " + primeCount);

        String[] name = {"Anh", "Trang", "Hoa", "Mai"};
        //chuyển mảng trên thành ccas đối tượng Person, tuổi ngẫu nhiên từ 0-100;
        Person p = new Person();
//        List<Person> persons = Arrays.stream(name).map(x -> new Person(x)).collect(Collectors.toList());
        List<Person> persons = Arrays.stream(name).map(Person::new).collect(Collectors.toList());

    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
