//TH1: BMI

package SessionTwo.TH;

import java.util.Scanner;

public class Th1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        float height, weight, bmi;
        System.out.println("Height (on metter): ");
        height=scanner.nextFloat();
        System.out.println("Weight (on kilogram):");
        weight=scanner.nextFloat();
        bmi=height/weight;

        if(bmi<18.5){
System.out.println( "Underweight");
        }
        else if(bmi<25.0){
System.out.println( "Normal");
        }
        else if(bmi<30.0){
System.out.println( "Overweight");
}       
        else {
System.out.println( "Obese");
}
    }
}
