package session12;

import java.util.Deque;
import java.util.LinkedList;

public class Bt3 {
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll(" ", "");
        Deque<Character> stack = new LinkedList<>();
        Deque<Character> queue = new LinkedList<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
            queue.offer(c);
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "Able was I ere I saw Elba";
        System.out.println("Is \"" + input1 + "\" a palindrome? " + isPalindrome(input1));

        String input2 = "hello";
        System.out.println("Is \"" + input2 + "\" a palindrome? " + isPalindrome(input2));
    }
}



