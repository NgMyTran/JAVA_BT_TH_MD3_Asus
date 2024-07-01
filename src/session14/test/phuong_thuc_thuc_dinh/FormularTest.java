package session14.test.phuong_thuc_thuc_dinh;

public class FormularTest {
    public static void main(String[] args) {
        Formula formula= new FormulaImpl();

        double value1= formula.sqrt(25);
        System.out.println("value1="+value1);

        double value2= formula.calculate(25);
        System.out.println("value2="+value2);
    }
}
