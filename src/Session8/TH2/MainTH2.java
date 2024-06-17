package Session8.TH2;

public class MainTH2 {
    public static void main(String[] args) {
        Car car1=new Car("Toyota", "black");
        Car car2=new Car("Ford", "white");

        System.out.println("car1's brand: " + car1.getBrand());
        car1.setColor("yelow");
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        Motorcycle motor1=new Motorcycle("Honda", "red");
        Motorcycle motor2=new Motorcycle("Vinfast", "blue");
        System.out.println(motor1.toString());
        System.out.println(motor2.toString());
    }
}
