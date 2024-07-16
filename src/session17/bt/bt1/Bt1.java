package session17.bt.bt1;

import session17.exception.CheckedException;

import java.util.Scanner;

public class Bt1 {

//    public static boolean isIntegerInRange(int num) {
//        return (num >= 'a' && num <= 'z');
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        try {
//            System.out.println("Number 1: ");
//            int num1 = Integer.parseInt(sc.nextLine());
//            System.out.println("Number 2: ");
//            int num2 = Integer.parseInt(sc.nextLine());
//
//            if (isIntegerInRange(num1) || isIntegerInRange(num2)) {
//                throw new Bt1CheckedException("One or both numbers are not integers or are outside the range 'a' to 'z'.");
//            }
//
//            int sum = num1 + num2;
//            System.out.println("Sum: " + sum);
//
//        } catch (NumberFormatException e) {
//            System.out.println("Error: You must enter valid integers.");
//        } catch (Bt1CheckedException e) {
//            System.out.println("Error: " + e.getMessage());
//        } finally {
//            sc.close();
//        }
//    }
public static void main(String[] args) throws CheckedException {
    Scanner sc = new Scanner(System.in);
    int num1=0;
    int num2=0;
    boolean isCheck=true;
    while(isCheck){
        try{
            System.out.println("Num1: ");
            num1=Integer.parseInt(sc.nextLine());
            isCheck=false;

        }catch(NumberFormatException e){
            System.out.println(e.getMessage());;
        }
    }

    boolean isCheck2=true;
    while(isCheck2){
        try{
            System.out.println("Num2: ");
            num2=Integer.parseInt(sc.nextLine());
            isCheck2=false;

        }catch(Exception e){
            System.out.println(e.getMessage());;
        }
    }
    int sum=num1+num2;
    System.out.println("Sum: "+sum);
}
}


