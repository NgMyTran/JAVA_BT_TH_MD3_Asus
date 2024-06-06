/* In các số nguyên tố từ 1 đến 100 */

package SessionTwo;

public class ExBooleanIf {
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " là số nguyên tố");
            }
        }
    }
}

