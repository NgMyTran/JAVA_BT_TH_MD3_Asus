package session12;

import java.util.Scanner;
import java.util.Stack;

public class Bt7 {
    public static boolean isDecreasingSequence(String input) {
        Stack<Character> stack = new Stack<>();
        boolean isDecreasing = true;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (!stack.isEmpty() && current > stack.peek()) {
                isDecreasing = false;
                break;
            }
            stack.push(current);
        }
        return isDecreasing;
    }

    public static void main(String[] args) {
//        String input1 = "cba";
//        System.out.println("Chuỗi \"" + input1 + "\" có phải là dãy giảm dần? " + isDecreasingSequence(input1));

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String userInput = sc.nextLine();
        System.out.println("Chuỗi \"" + userInput + "\" có phải là dãy giảm dần? " + isDecreasingSequence(userInput));
    }
}

