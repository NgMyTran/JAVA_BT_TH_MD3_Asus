package SessionFour;

public class Bt1Circle {
    double radius;

    public Bt1Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        // return Math.PI * Math.pow(this.radius, 2);
        return 3.14* this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }

    public String display() {
        return "Circle{" + "radius=" + radius + "}";
    }
}
