package session14.th1;

import java.util.ArrayList;
import java.util.List;

public class MainTh1 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 6.0));

        for(Shape s:shapes){
            System.out.println("area = "+s.area());
        }
    }
}
