package Session8.BT5;
public class MainBT5 {
    public static void main(String[] args) {
        // Tính diện tích hình tròn
        double R1 = 3.5;
        double R2 = 6.0;
        double area1 = StaticMethod.calCircleArea(R1);
        double area2 = StaticMethod.calCircleArea(R2);
        System.out.println("Diện tích hình tròn bán kính " + R1 + " là: " + area1);
        System.out.println("Diện tích hình tròn bán kính " + R2 + " là: " + area2);

        // Tính diện tích hình chữ nhật
        double width1 = 2.5, height1 = 6.0;
        double area5 = StaticMethod.calRectangleArea(width1, height1);
        System.out.println("Diện tích hình chữ nhật có kích thước " + width1 + " x " + height1 + " là: " + area5);

        double width2 = 4.0, height2 = 7.0;
        double area6 = StaticMethod.calRectangleArea(width2, height2);
        System.out.println("Diện tích hình chữ nhật có kích thước " + width2 + " x " + height2 + " là: " + area6);

        // Tính diện tích hình tam giác
        double a = 3.0, b = 4.0, c = 5.0;
        double area3 = StaticMethod.calTriangleArea(a, b, c);
        System.out.println("Diện tích tam giác có các cạnh " + a + ", " + b + ", " + c + " là: " + area3);

        double a2 = 4.5, b2 = 7.0, c2 = 6.0;
        double area4 = StaticMethod.calTriangleArea(a2, b2, c2);
        System.out.println("Diện tích tam giác có các cạnh " + a2 + ", " + b2 + ", " + c2 + " là: " + area4);
    }
}
