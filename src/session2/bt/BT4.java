package session2.bt;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem Math");
        double math = sc.nextDouble();
        System.out.println("Nhap diem english");
        double english = sc.nextDouble();
        System.out.println("Nhap diem literature");
        double literature = sc.nextDouble();
        System.out.println("Nhap diem chemistry");
        double chemistry = sc.nextDouble();
        double average = (math + english + literature + chemistry) / 4;
        if (average < 5) {
            System.out.println(average + " Yeu");
        } else if (average < 6.5) {
            System.out.println(average + " TB");
        } else if (average < 8) {
            System.out.println(average + " Kha");
        } else System.out.println(average + " Gioi");
    }
}
