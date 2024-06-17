package Session8.BT1;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius,String color, double height) {
        super(radius,color);
        this.height = height;
    }
    public double getHeight() {return height;}
    public double getVolune() {
        return getArea()*height;
    }

    public void setHeight(double height) {this.height = height;}

    @Override
    public String toString() {
        return "Cylinder{base " + super.toString() + ", height=" + height + "}";
    }
}
