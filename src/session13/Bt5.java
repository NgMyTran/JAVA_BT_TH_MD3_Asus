package session13;

import java.util.*;

public class Bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Integer[] randomList=new Integer[10];

        System.out.println("Input numbers");
        for(Integer e: randomList){
            e=Integer.parseInt(sc.nextLine());
            map.put(e,0);
        }
        for(Integer key: map.keySet()){
            System.out.println("Key" + key);
        }
        System.out.println("Smallest element is " + map.firstKey());
        System.out.println("Second small element is " + map.lowerKey(map.lastKey()));

//        NavigableSet<Integer> navigableMap = map.descendingKeySet();
//        while(!navigableMap.isEmpty()){
//            System.out.println(navigableMap.pollFirst());
//        }
        Comparator<Integer> reverseComparator = Comparator.reverseOrder();
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(reverseComparator);
        sortedMap.putAll(map);
        System.out.println("Sorted map");
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
}
