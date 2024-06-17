package Session8.BT1;

public class Circle {
    private double radius;
    public String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {return radius;}
    public String getColor() {return color;}

    public void setRadius(double radius) {this.radius = radius;}
    public void setColor(String color) {this.color = color;}

    public double getArea() {return radius * radius;}
    public double getPerimeter() {return 2 * radius;}

    @Override
    public String toString() {
        return "Circle {radius=" + radius + ", color=" + color + "}";
    }
}
