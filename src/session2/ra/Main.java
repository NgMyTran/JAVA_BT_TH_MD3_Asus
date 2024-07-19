package session2.ra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ///cau lenh if...else: dung thi the nay, sai thi the kia: dk tuong doi
        // if{thuc hien khoi lenh ben trong}
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        if (n % 2 == 0) System.out.println("so chia het cho 2");
        else System.out.println("k chia het cho 1");

        //if
        if (n % 3 == 0) System.out.println("so chia het cho 3");

        //else if
        if (n % 2 == 0) {
            if (n % 5 == 0) {
                System.out.println("so chia het cho 2 va 5");
            } else {
                System.out.println("chia het cho 2 n k chia het cho 5");
            }
        }

        //cau lenh switch - case
        //nhna vao bieu thuc or bien dung de ss (==) gtri cac case: dk tuyet doi


        //3 tu khoa thuong thay trong vong lap:
        //break: dung cho khoi code, thoat khoi la dung
        //return: stop ham
        //continue: thoat khoi loop hien tai va tiep tuc loop tiep theo

        //BT: xây dựng lớp nhập sữ liệu cho các kiểu nguyên thủy + LocalDate

    }

}
