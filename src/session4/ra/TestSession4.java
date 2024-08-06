package session4.ra;

import session4.ra.person.Person;

public class TestSession4 {
    public static void main(String[] args) {
        //OOP: name phong cach lap trinh, dex nang cap hon
        //Class: attribute, properties? (thuoc tinh) + methods (phg thuc) (constructor: phg thuc khoi tao)
        //Object: tung doi tuong tu cac thuoc tinh va phg thuc da tao tu class
        TestStudent st1 = new TestStudent();// tao doi tuong (goi ham tao....)
        //ts1 la 1 obj dc tao ra tu Teststudent, la 1 instance cua class Teststudent
        System.out.println(st1.toString());
        st1.printName();
        System.out.println(st1.getStudentName());
        System.out.println("Tuoi sau 5 nam: " + st1.getAgeAfterAnyYear(5));
        TestStudent st2 = new TestStudent();
        st2.studentName = "Hung";
        System.out.println(st2.toString());

        Person p1 = new Person();
        p1.name = "John";
        //p1.age
        System.out.println(p1.toString());


        //4 tinh chat (thoa man het thi deu la lap tirnh huong odi tuong-OOP):
        // • Polymorphism–Tính đa hình
        //che giau inform de ben ngoai k truy cap vao dc

        // • Inheritance– Tính kế thừa
        //super cho ham tao va cac phg thuc khac
        //Overide: kiem tra chac chan co phg thuc nay ow class da ke thua (tranh trg hop viet sai ten khi ke thua)

        // • Encapsulation– Tính đóng gói
        //getter & setter

        // • Abstraction– Tính trừu tượng

    }
}
