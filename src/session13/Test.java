package session13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            String key= entry.getKey();
            Integer value= entry.getValue();
            System.out.println("key: "+key+" _value: "+value);
//            System.out.println("Key: " + entry.getKey() );
//            System.out.println("Value: " + entry.getValue() );
        }

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hi", "xin chao");
        dictionary.put("thanks", "cam on");
        dictionary.put("bye", "tam biet");
        System.out.println(dictionary);

        dictionary.put("hi", "chao");
        System.out.println(dictionary);

        dictionary.remove("hi");
        System.out.println(dictionary);

        System.out.println(dictionary.get("bye"));

        System.out.println(dictionary.containsKey("hi"));
        System.out.println(dictionary.containsValue("tam biet"));


        Set<String> keys = dictionary.keySet();
        System.out.println(keys);
        Collection<String> values = dictionary.values();
        System.out.println(values);

        for(Map.Entry<String, String> entry : dictionary.entrySet()){
            String key= entry.getKey();
            String value= entry.getValue();
            System.out.println("key: "+key+" _value: "+value);
        }
    }
}
