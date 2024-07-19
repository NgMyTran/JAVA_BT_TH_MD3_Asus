package session2.bt;

import java.util.Scanner;

public class Bt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice = sc.nextByte();
        System.out.println("Ban muon lam gi?");
        System.out.println("1.Kiểm tra tính chẵn lẻ của 1 số.");
        System.out.println("2.Kiểm tra số nguyên tố.");
        System.out.println("3.Kiểm tra một số có chia hết cho 3 không.");
        System.out.println("4.Thoát");
        switch (choice) {
            case '1':
                System.out.println("Nhap so can kiem tra");
                byte n = sc.nextByte();
                if (n % 2 == 0) {
                    System.out.println("So chan");
                } else System.out.println("So le");
                break;
            case '2':
                System.out.println("Nhap so can kiem tra");
                int n2 = sc.nextByte();
                boolean isPrime = true;
                if (n2 <= 1) {
                    isPrime = false;
                } else {
                    int i = 2;
                    for (; i <= Math.sqrt(n2); ) {
                        if (n2 % i == 0) {
                            i++;
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime) {
                    System.out.println("So ngto");
                } else {
                    System.out.println("Khong phai so ngto");
                }
                break;
            case '3':
                System.out.println("Nhap so can kiem tra");
                byte num = sc.nextByte();
                if (num % 3 == 0) {
                    System.out.println("so chi het cho 3");
                } else {
                    System.out.println("k chia het cho 3");
                }
                break;
            case '4':
                break;
            default:
                System.out.println();
        }
    }
}
