package session11;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //Generic: Một lớp có thể tham chiếu bất kỳ kiểu đối tượng nào(tham số hóa kiểu dữ liệu)
        //Lợi ích: 1. giúp code dc táo sử dụng thay vì tạo hiều class với kiểu dữ liệu khác nhau
        //Tạo ra 1 class chung và truyền kiểu dữ liệu vào
        //Giúp kiểu dữ liệu dc đảm bảo an toàn
        // --> Lớp Generic

        //Hàm Genneric
        Integer[] arrInt = {1, 3, 5, 6, 7};
        String[] arrString = {"a", "c", "d"};
//        printArray(arrInt);

        //Generic wildcard(?): 1 loại, 1 kiểu dữ liệu k xác định
        //Chấp nhận tất cả các loại đối số
        //Ký tự đại diện<? extends type>
        sumArr(arrInt);

        //Nhược điểm của Generic
        //Gểnic đều phái thông qua lớp(k thể là thuộc tính tĩnh vì thuộc tính cấp phát tĩnh có vùng nhớ đã xác định )
        //Object-wrapper: Integer, Double,...
        //K thể overloading: nạp chồng


        //(interface) COLLECTION COLLECTIONS
        //Framework Collections: tập hợp, cung cấp các class và inteface lưu trữ, quản lý (thêm, sửa xóa) nhóm obj (thg là mảng)
        // 1 thư viện giúp thao quản lý nhanh hơn
        //Các thành phần của Java collection
        //  1.Interface: kiểu sữ kiệu trừu tượng. 1 hệ thống dữ liệu phân cấp trong lập trình hướng đối tượng
        //2. Claas: dc triển khai từ inteface cha & thể hiện kiểu dữ liệu cụ thể. VD:ArrayList, LinkedList, Vector dc kế thừa từ interface List
        //3.Algorithm: giúp giải các thuật toán trong các phương thức (COLLECTIONS)
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 45, 4));
        Collections.sort(arr);
        //1.Collections: nằm trong gói java.util, cung cấp các phg thức để làm các bài toán liên quan sort, reverse, binarySearch

        //2. Collection: root inerface, cung cấp các phg thức cơ bản cho các loại tập hợp(List, Queuce: vào trc ra trc FIFO, Set:phần tử k tùng lặp)
        // Các phương thức trong interface Collection
        //2.1.add
        Collection<Integer> arrCollection = new ArrayList<>(Arrays.asList(1, 3, 45, 4, 3));
        arrCollection.add(5);
        //2.2.remove: xóa phần tử đầu tiên thỏa mãn điều kiện
        arrCollection.remove(4);
        //2.3.size()
        System.out.println(arrCollection.size());
        //2.4.clear: xóa hết tất cả các phần tử trong mảng
        arrCollection.clear();
        System.out.println(arrCollection);


        //List interface: dc kế thừa từ interface Collection
        //Có những phg thức add, sửa, xóa --> ArrayList(cấu trúc dạng mảng), LinkedList(cấu trúc lk), Vector(chạy đa luôngf, có stack)
        List<Integer> arrLinked = new LinkedList();
        List<String> listString = new ArrayList<>();
        List<String> linkedString = new LinkedList<>();
        //Set(HashSet(luu tru theo mã băm k xác định dc thứ tự, thêm phần tử bị trùng thì chỉ hiện 1 lần), LinkedHashSet, TreeSet(phair dc sap xep moiw tim kiem nhi phan dc, phair implement Comrable hoawcj chua comparator)) k cho pheps luuw truwx trungf lapwj, chỉ có add, xóa, k có get
        Set<Integer> setInt = new HashSet<>();
        setInt.add(2);
        setInt.add(1);
        setInt.add(3);
        setInt.add(4);
        setInt.add(101);
        setInt.add(110);
        setInt.add(11);
        System.out.println(setInt);


    }


    public static void printArrayInt(Integer[] arrInt) {
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }
    }

    public static void printArrayStr(String[] arrString) {
        for (int i = 0; i < arrString.length; i++) {
            System.out.println(arrString[i]);
        }
    }

//    public static <T> void printArray(T[] arr) {
//        for (T ele : arr) System.out.println("ele");
//    }

    public static <T extends Number> void sumArr(T[] arr) {
        double sum = 0.0;
        for (T ele : arr) {
            sum += ele.doubleValue();
        }
        System.out.println(sum);
    }
}
