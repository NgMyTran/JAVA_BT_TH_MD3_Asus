package session17.bt;

import session17.bt.bt1.Bt1CheckedException;

import java.util.Scanner;

public class Bt8 {
//    public static boolean isPrime(int num) throws Bt1CheckedException {
//        if(num < 2){
//            throw new Bt1CheckedException("Prime number > 2");
//        }
//        for(int i = 2; i < num; i++){
//            if(num % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int n = Integer.parseInt(sc.nextLine());
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter element " + (i + 1) + " : ");
//            arr[i] = Integer.parseInt(sc.nextLine());
//        }
        try{
            checkPrime();
        }catch(RuntimeException e){
            System.out.println("Phai nhap 1 so");
        }
    }


    public static void checkPrime() {
        Scanner sc = new Scanner(System.in);
        int n;
        //Bước 1: Khai báo biến và nhập dữ liệu
        //Khai báo một biến để lưu số cần kiểm tra.
        //Sử dụng Scanner để nhập số từ người dùng.
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n < 0) {
                    System.out.println("Number >0");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter an integer");
            }
        }
        //Bước 2: Kiểm tra điều kiện số không phải số nguyên tố
        //Kiểm tra nếu số nhỏ hơn 2 (số nguyên tố là số lớn hơn 1), thì hiển thị thông báo lỗi và kết thúc chương trình.
        if(n<2){throw new RuntimeException("So <2 k phai so nguyen to");}
        //Bước 3: Kiểm tra tính số nguyên tố
        //Sử dụng vòng lặp để kiểm tra xem số có chia hết cho các số từ 2 đến căn bậc hai của số đó hay không. Nếu có sự chia hết, thì số không phải là số nguyên tố.
for(int i = 2; i < n; i++){
    if(n%i == 0){
        System.out.println("Uoc: " + i);
        throw new RuntimeException("so vua nhap uoc >= 3 nen k phai so ng.to");
    }
}
        //Bước 4: Hiển thị kết quả
        //Nếu số không bị loại trừ ở Bước 2 và Bước 3, thì in ra rằng số đó là số nguyên tố.
        System.out.println("So vua nhap la so ng.to");
    }
}
