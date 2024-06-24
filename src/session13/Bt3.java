package session13;

import java.util.*;

public class Bt3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("c", 2);
        map.put("b", 3);
        map.put("d", 1);
        map.put("a", 4);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, (e1, e2)->e1.getValue()- e2.getValue());

        System.out.println("HashMap sau khi sắp xếp theo giá trị tăng dần:");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
