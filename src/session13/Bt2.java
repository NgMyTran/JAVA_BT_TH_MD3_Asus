package session13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Object, Integer> map = new HashMap<>();
        ArrayList<Object> list = new ArrayList<>();
        System.out.println("Enter elements (type 'done' to finish):");
        while(true){
            String line = sc.nextLine().trim();
            if(line.equalsIgnoreCase("done")){
                break;
            }
            Object element;
            if(line.matches("-?\\d+")){
                element = Integer.valueOf(line);
            }else if(line.matches("-?\\d+(\\.\\d+)?")){
                element = Double.valueOf(line);
            }else {element = line;
            }
            list.add(element);
        }

        for(Object o:list){
            if(map.containsKey(o)){
                map.put(o, map.get(o)+1);
            }else{map.put(o, 1);}
        }

        ArrayList<Object> uniqueElements = new ArrayList<>();
//        for(Map.Entry<Object, Integer> entry:map.entrySet()){
//            if(entry.getValue() == 1){
//                uniqueElements.add(entry.getKey());
//            }
//        }
//        for(Object o:map) {
//            if (map.get(o) == 1) {
//                uniqueElements.add(o);
//            }
//        }

        System.out.println("Các phần tử duy nhất có trong mảng và chỉ xuất hiện 1 lần:");
        for (Object obj : uniqueElements) {
            System.out.print(obj + " ");
        }
    }
}
