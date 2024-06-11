package SessionFour;

public class Th4Calculator {
//Attributes
    private double number1;
    private double number2;

//Constructors
    public Th4Calculator() {}

    public Th4Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
    return number1;
}
 public double getNumber2() {
    return number2;
}
 public void setNumber1(double number1) {
    this.number1 = number1;
}

public void setNumber2(double number2) {
    this.number2 = number2;
}
//Method
public double sum() {
    return number1 + number2;
}

public double minus() {
    return Math.abs(number1 - number2);
}

public double multiply() {
    return number1 * number2;
}
public double divide() {
    if (number2==0) System.out.println("Error");
    return (double) number1 / number2;
}
@Override
public String toString() {
    return "Th4Calculator{" + "number1=" + number1 + ", number2=" + number2 + "}";
}}