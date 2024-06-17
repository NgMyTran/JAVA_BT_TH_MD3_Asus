package BT4;

public class Triangle extends Shape {
    // Thuộc tính
    private double side1;
    private double side2;
    private double side3;

    // Constructor mặc định
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // Constructor có tham số
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getter cho các side
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Phương thức tính diện tích tam giác sử dụng công thức Heron
    public double getArea() {
        double s = getPerimeter() / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    // Phương thức tính chu vi tam giác
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Phương thức toString để in ra thông tin chi tiết tam giác
    @Override
    public String toString() {
        return "Triangle[side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
    }
}
