package session13;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
//        Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("one", 1);
//        hashMap.put("two", 2);
//        hashMap.put("three", 3);
//        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
//            String key= entry.getKey();
//            Integer value= entry.getValue();
//            System.out.println("key: "+key+" _value: "+value);
////            System.out.println("Key: " + entry.getKey() );
////            System.out.println("Value: " + entry.getValue() );
//        }
//
//        Map<String, String> dictionary = new HashMap<>();
//        dictionary.put("hi", "xin chao");
//        dictionary.put("thanks", "cam on");
//        dictionary.put("bye", "tam biet");
//        System.out.println(dictionary);
//
//        dictionary.put("hi", "chao");
//        System.out.println(dictionary);
//
//        dictionary.remove("hi");
//        System.out.println(dictionary);
//
//        System.out.println(dictionary.get("bye"));
//
//        System.out.println(dictionary.containsKey("hi"));
//        System.out.println(dictionary.containsValue("tam biet"));
//
//
//        Set<String> keys = dictionary.keySet();
//        System.out.println(keys);
//        Collection<String> values = dictionary.values();
//        System.out.println(values);
//
//        for(Map.Entry<String, String> entry : dictionary.entrySet()){
//            String key= entry.getKey();
//            String value= entry.getValue();
//            System.out.println("key: "+key+" _value: "+value);
//        }

//
//        //HasMap
//        Map<String, String> students = new HashMap<>();
//        //theem vaof: vừa thêm phần tử vừa chỉnh sửa dựa trên key
//        students.put("S01", "Mai");
//        students.put("S02", "Sen");
//        students.put("S03", "Anh");
//        students.put("S03", "Hoa");
//        System.out.println(students);
////xóa theo key
//        students.remove("S01");
//        System.out.println(students);
//        //phg thuc khac
//        //duyet map theo entry
//        for (Map.Entry<String, String> entry : students.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//        //duyet map theo key
//        for (String key : students.keySet()) {
//            System.out.println(key + " " + students.get(key));
//        }
//        //duyet map theo value
//        for (String value : students.values()) {
//            System.out.println(value);
//        }
////       values: 1 danh sách các value


        //treeMap its cos suwj bien dong du lieu
        TreeMap<Student, String> stringMap = new TreeMap<>((o1, o2) -> o1.getId() - o2.getId());
//        Student s1=new Student()
        //Khi danh sach dc sap xep thi hox tro thuat toan tim kiem nhi phan
    }
}
