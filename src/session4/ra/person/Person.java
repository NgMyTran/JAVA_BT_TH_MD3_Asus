package session4.ra.person;

public class Person {
    public String name;
    int age;// default: cung 1 package
    private boolean sex;// private: chi dung trong noi bo class
    protected String test;

    public Object getSex(String role) {
        if (role.equals("admin")) {
            return this.sex;
        } else {
            return null;
        }
    }
}
