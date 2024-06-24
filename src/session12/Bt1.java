package session12;

import java.util.Scanner;
import java.util.Stack;

public class Bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of words: ");
        int n = Integer.parseInt(sc.nextLine());

        Stack<String> stackStr = new Stack<>();
        System.out.println("Enter " + n + " words separated by spaces: ");
        String input = sc.nextLine();

//        String[]words=input.split("");
//        for(String word:words){
//            stackStr.push(word);
//        }
        System.out.print("Words in reverse order:");
        while (!stackStr.isEmpty()) {
            System.out.print(stackStr.pop());
        }
    }
}
