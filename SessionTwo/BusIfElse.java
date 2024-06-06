
/*Tính tiền vé xe 7000 : [<6 thì free]; [>=6 && <18 thì giam 50%] ; [>=18 && <=60 thì 100%] ; [>60 thì free]  */

package SessionTwo;

import java.util.Scanner;

public class BusIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

float price;
        System.out.println("Nhập tuổi của khach hang: ");
        int age = scanner.nextInt();

        if (age < 6) {
price = 0;
            System.out.println("Khach hang duoi 6 tuoi, mien phi");
           
        } else if (age >= 6 && age < 18) {
        price = 7000/2;
            System.out.println("Khach hang tu 6 den 18 tuoi, giam 50%, " + price);
        } else if (age >= 18 && age <= 60) {
         price = 7000;
            System.out.println("Khach hang tu 18 den 60 tuoi, 100% " + price);
        } else {
            System.out.println("Khach hang tren 60 tuoi, mien phi");
            
        }
    }
 
}
