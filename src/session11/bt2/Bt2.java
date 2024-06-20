//in ra tất cả các chuỗi có độ dài lớn hơn 3 ký tự.
package session11.bt2;

import java.util.ArrayList;
import java.util.List;

public class Bt2 {
    public static void main(String[] args) {
        String inputString = "Rikkei Academy để nông dân biết code";
        List<String> strings = new ArrayList<>();

        String[] words=inputString.split(" ");
        for (String word : words) {
            strings.add(word);
        }
        System.out.println(strings);

        System.out.println("các chuỗi có độ dài lớn hơn 3 ký tự:");
        for (String word : strings) {
            if(word.length()>=3){
                System.out.print("'"+ word + "'");
            }
        }
    }
}
