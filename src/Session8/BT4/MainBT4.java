package Session8.BT4;

import java.util.Scanner;

public class MainBT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập các độ dài ba cạnh từ người dùng
        System.out.println("Nhập độ dài ba cạnh của tam giác:");
        System.out.print("Cạnh 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Cạnh 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Cạnh 3: ");
        double side3 = scanner.nextDouble();

        // Nhập màu sắc của tam giác từ người dùng
        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.print("Nhập màu sắc của tam giác: ");
        String color = scanner.nextLine();

        // Tạo đối tượng Triangle với các thông số đã nhập
        Triangle triangle = new Triangle(side1, side2, side3);

        // Đặt màu sắc cho tam giác
        // (Trong trường hợp này, màu sắc không được lưu trong đối tượng Triangle, chỉ là một phần của yêu cầu đề bài)
        System.out.println("Màu sắc của tam giác là: " + color);

        // In ra diện tích và chu vi của tam giác
        System.out.println("Diện tích của tam giác là: " + triangle.getArea());
        System.out.println("Chu vi của tam giác là: " + triangle.getPerimeter());

        // In ra thông tin chi tiết của tam giác
        System.out.println("Thông tin chi tiết của tam giác:");
        System.out.println(triangle);

        scanner.close();
    }
}