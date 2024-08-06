package session14;

import java.util.Random;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //phg thucws thg
    public Person mapper(String name) {
        Random random = new Random();
        int age = random.nextInt(100);
        Person p = new Person(name, age);
        return p;
    }

    //phg thuc tinh
    public Person mapperStatic(String name) {
        Random random = new Random();
        int age = random.nextInt(100);
        Person p = new Person(name, age);
        return p;
    }

}
