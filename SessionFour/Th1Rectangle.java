package SessionFour;

public class Th1Rectangle {
double width, height;

    public Th1Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
}
public double getArea() {
    return this.width * this.height;
    
}

public double getPerimeter() {
    return (this.width + this.height) * 2;
}
@Override
public String toString() {
    return "Rectangle{" + "width=" + width + ", height=" + height + "}";
}
}
