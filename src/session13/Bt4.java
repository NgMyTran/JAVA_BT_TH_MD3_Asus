package session13;

import java.util.HashMap;
import java.util.Map;

public class Bt4 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("C", 3);
        hashMap.put("B", 2);

        Map<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("D", 4);
        hashMap2.put("F", 6);
        hashMap2.put("E", 5);
        hashMap2.putAll(hashMap);

        String keyToCheck="B";
        boolean isExist=hashMap2.containsKey(keyToCheck);
        System.out.println(isExist);
    }
}
