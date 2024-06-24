package session12;

import java.util.Scanner;
import java.util.Stack;

public class Bt2 {
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
//        String input1 = "{[()]}";
//        System.out.println(input1 + " is balanced: " + isBalanced(input1));
//
//        String input2 = "{[(])}";
//        System.out.println(input2 + " is balanced: " + isBalanced(input2));
//
//        String input3 = "{{[[(())]]}}";
//        System.out.println(input3 + " is balanced: " + isBalanced(input3));
//
//        String input4 = "{";
//        System.out.println(input4 + " is balanced: " + isBalanced(input4));
//
//        String input5 = "([]{}())";
//        System.out.println(input5 + " is balanced: " + isBalanced(input5));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();

        if (isBalanced(input)) {
            System.out.println("The string \"" + input + "\" is balanced.");
        }else {
            System.out.println("The string \"" + input + "\" is not balanced.");
        }
    }
}
