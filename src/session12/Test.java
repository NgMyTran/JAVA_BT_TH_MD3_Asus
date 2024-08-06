package session12;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //Stack: lớp kế thừa vector, tuân thủ cấu trúc ngăn xếp (last in first out)
        //các phg thức làm việc 9h của Stack (đệ quy, hàm nào gọi sau thì xử lý trc)
        //khởi tạo
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(0);
        //laays ra
        while (!stack.isEmpty()) {
//        while (!stack.empty()) {//isEmpty laf phg thuc cua Colllection
            Integer pop = stack.pop();// pop laays rooif xoas
            System.out.println(pop);
        }
        //isEmpty laf phg thuc cua Colllection


        //Queue: là interface, hàng đợi (dinh nghia: first in first out)
        Queue<Integer> queue = new ArrayDeque<>();
        //poll(laays vaf xoas), peek(lay k xoa), remove(laays va xoas), elemenet(Layas n k xoas), offer(them), add(them)
//        queue.add(1);
        queue.offer(2);// them k qun taam den kich thuoc

        queue.poll();// k bat ngoai le neu mang rong
//        queue.remove();//co ngoai le neu xoa het phan tu trong mang

//        queue.element();//vut ra ngoai le
        queue.peek();// k co ngoai le

        //hàng đợi 2 đầu: FIFO và LILO (liên kết vòng): tìm hiểu thêm
//        LinkedList<Integer> vong = new LinkedList<>();
//        vong.addFirst();
//        vong.getFirst();
//        vong.addLast();
//        vong.removeLast();


        //Comparable & comparatpr: interface so sánh dữ liệu (ss số, chữ, giá trị, đối tượng-dựa trên hesan)
        //2 cách để ss
//        cho class implements Comparable
        //VD: public class Person implements Comparable
        Book[] books = new Book[]{
                new Book("b2", "Book Two", "Content of Book Two", 150, 29.99, new Date(121, 4, 23)),
                new Book("b1", "Book One", "Content of Book One", 120, 19.99, new Date(120, 8, 15)),
                new Book("b5", "Book Five", "Content of Book Five", 200, 49.99, new Date(119, 11, 30)),
                new Book("b3", "Book Three", "Content of Book Three", 180, 39.99, new Date(121, 0, 10)),
                new Book("b4", "Book Four", "Content of Book Four", 160, 24.99, new Date(120, 7, 21))
        };
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));

        //Comparator: interface có phg thức trừu tượng compare(A a, B b)
        //điêmr khác biệt:
        //Arrsy.sort(array) / Arrsy.sort(array, Comparetor)
        //2 cách:
        // C1:tạo 1 class implements Comparator và dùng new để tạo obj ở main
        //C2: lớp nặc danh
        Comparator<Book> com = new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
//                return Double.compare(o1.getPrice(), o2.getPrice());
                return o1.getCreatedAt().compareTo(o2.getCreatedAt());
            }
        };

//        C3: funtional interface
        Arrays.sort(books, (o1, o2) -> o1.getTotalPage() - o2.getTotalPage());
        Arrays.sort(books, (o1, o2) -> o1.getId().compareTo(o2.getId()));


    }
}
