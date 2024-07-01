package session13;

import java.util.*;

public class Bt1 {
    public static void main(String[] args) {
//        Object[] arr={1, "Hello", 2.5, 'a', "Hello", 1, 'a', 2.5};

        Scanner sc = new Scanner(System.in);
        Map<Object, Integer> countMap= new HashMap<Object, Integer>();
        ArrayList<Object> arr = new ArrayList<>();
        System.out.println("Enter elements (type 'done' to finish):");

        while (true) {
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            // Chuyển đổi input sang đối tượng thích hợp
            Object element;
            if (input.matches("-?\\d+")) {
                // Nếu là số nguyên
                element = Integer.parseInt(input);
            } else if (input.matches("-?\\d+\\.\\d+")) {
                // Nếu là số thực
                element = Double.parseDouble(input);
            } else {
                // Mặc định là chuỗi
                element = input;
            }
            arr.add(element);
        }

        for(Object o:arr){
            if(countMap.containsKey(o)){
                countMap.put(o, countMap.get(o)+1);
            }else{countMap.put(o, 1);}
        }
//        for(Map.Entry<Object, Integer> entry:countMap.entrySet()){
//            System.out.println(entry.getKey() + "\" xuất hiện " + entry.getValue() + " lần.");
//        }
        Set<Object> keySet = countMap.keySet();
        for(Object key:keySet){
            System.out.println(key + "\" xuất hiện " + countMap.get(key) + " lần.");
        }
    }
}
