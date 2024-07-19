package session3.ra;

import java.util.Random;
import java.util.Scanner;

public class Test {
//    public static void main(String[] args) {
//        //ARRAY TRONG JAVA
//        //Thanh phan: chi so (index) & phan tu (elemen)
//        //Cac dac diem:
//        //-la mot bien (sieu bien)
//        // -luu cac phan tu cung kieu du lieu
//        //-co kich thuoc co dinh luc khai bao & khoi tao
//        //-cac phan tu trong mang dc luu tru lien ke nhau
//
//        //cach khai bao
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arrayInt = new int[10]; // cac phan tu ban dau ==0;
//        // int [] arrayInt=new int[]{1,2,3,4,5,6,7,8,9,10};
//        System.out.println(Arrays.toString(arrayInt));
//
//        //2 loai array: 1 chieu va nhieu chieu
//        //mang 1 chieu la mang chua cac phan tu theo 1 chi muc
//        //truy suat phan tu dau tien
//        System.out.println("phan tu dau tien" + arr[0]);
//        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
//        int[] pt2 = arr2D[1];//lay ra mang thu 2 trong mang arr2D
//        int so5 = arr2D[1][1];
//        int so3 = arr2D[0][2];
//    }

    //thuc hien cac logic them sua xoa voi mang
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            System.out.println(
                    "-------Menu------\n"
                            + "1. Display\n"
                            + "2. Add \n"
                            + "3. Delete \n"
                            + "4. Update \n"
                            + "5. Exit\n"
            );
            Scanner sc = new Scanner(System.in);
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    NumberManage.printArray();
//                System.out.println(Arrays.toString(NumberManage.arrayUnt));
                    break;
                case 2:
                    int randomInt = new Random().nextInt(100);
                    NumberManage.addNum(randomInt);
                    break;
                case 3:
                    System.out.println("Nhap index can xoa");
                    byte index = Byte.parseByte(sc.nextLine());
                    NumberManage.removeNum(index);
                    break;
                case 4:
                    System.out.println("Nhap index can update");
                    byte index2 = Byte.parseByte(sc.nextLine());
                    System.out.println("Muon sua thanh so...");
                    int num = Integer.parseInt(sc.nextLine());
                    NumberManage.updateNum(index2, num);
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
