package Session8.BT1;

public class MainBT1 {
    public static void main(String[] args) {
        Circle circle= new Circle(3.5, "Blue");
        System.out.println(circle);

        Cylinder cylinder= new Cylinder(1.5, "green", 2.0);
        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.getVolune());


    }
}
