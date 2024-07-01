package session12;

import java.util.Scanner;
import java.util.Stack;

public class Bt7 {
//    public static boolean isDecreasingSequence(String input) {
//        Stack<Character> stack = new Stack<>();
//        boolean isDecreasing = true;

//        for (int i = 0; i < input.length(); i++) {
//            char current = input.charAt(i);
//            if (!stack.isEmpty() && current > stack.peek()) {
//                isDecreasing = false;
//                break;
//            }
//            stack.push(current);
//        }
//        return isDecreasing;
//    }
//
//    public static void main(String[] args) {
////        String input1 = "cba";
////        System.out.println("Chuỗi \"" + input1 + "\" có phải là dãy giảm dần? " + isDecreasingSequence(input1));
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập chuỗi cần kiểm tra: ");
//        String userInput = sc.nextLine();
//        System.out.println("Chuỗi \"" + userInput + "\" có phải là dãy giảm dần? " + isDecreasingSequence(userInput));
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Character> stack = new Stack<>();
    System.out.print("Nhập chuỗi cần kiểm tra: ");
    String userInput = sc.nextLine().trim().toLowerCase();

    for(Character ch : userInput.toCharArray()) {stack.push(ch);}

    boolean flag = true;
    while(!stack.isEmpty()) {
        char firstChar = stack.pop();
        for(Character ch:stack){
            if(firstChar > ch){
                flag = false;
                break;
            }
        }
    }
    if(flag) {
        System.out.println("Decreasing string");
    }else System.out.println("Not decreasing string");
}
}

