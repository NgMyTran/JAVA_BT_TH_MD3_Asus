package session14.test.phuong_thuc_thuc_dinh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        IColorable.howToColor();
        IColorable iColor = new Color();
        Shape shape = () -> {
        };
        Comparator<Integer> comparator = (o1, o2) -> o1 - o2;

        //STREAM
        //Mang (array)
        Integer[] arr = {1, 2, 3, 4, 5, 6, 8, 3, 2, 1};
        Stream<Integer> stream1 = Arrays.stream(arr);
        List<Integer> list = Arrays.asList(arr);
        Stream<Integer> stream2 = list.stream();

        // thao tác trung gian : là các thao tác trả về 1 stream mới
        Stream<Integer> stream3 = stream1.distinct();// bo phan tu bi trung lap
        System.out.println(stream3);

        // tổng các phần tử ko trung lặp
        //  R apply(T t, U u);
        Integer sum = stream3.reduce(0, (temp, num) -> temp + num);
        System.out.println(sum);

        // các thao tác trung gian thường gặp : filter, map, limit, sorted ,distinct
        // các thao tác đầu cuối : foreach , reduce, toList, collect, min, max, findFirst, sum, ...

        // các Functional interface dựng sẵn dùng trong stream : thuộc gói java.util.function
        // Consumer
//        stream2.forEach(System.out::println);
//        stream2.forEach((t)->{
//            System.out.print(", "+t);
//        });
        // Predicate
        // lọc các số chia cho 2
        stream2.filter((num) -> num % 2 == 0).forEach((num) -> System.out.println(num));
        // Supplier
        List<Integer> random = Stream.generate(() -> new Random().nextInt(25)).limit(50).collect(Collectors.toList());

        // Function
        // chuyển đổi mảng các sô nguyên thành mảng các bình phương của chúng
        List<Integer> pow = stream3.map((num) -> num * num).collect(Collectors.toList());
        System.out.println(pow);

        Square square = new Square();

    }
}
