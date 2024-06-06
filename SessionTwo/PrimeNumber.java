 /*BT 7 - Ses2: hiển thị 20 số nguyên tố đầu tiên */

package SessionTwo;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int n = input.nextInt();
        System.out.println("Enter the ending number:");
        int k = input.nextInt();
        int count = 0;

//         int i=2;
// while (count<20) {
//     if(isPrime(i)){
//         System.out.println(i);
//         count++;
//     }
//     i++;
// }
        for (int i = n; i <= k; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
                if (count == 20) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/*Cách 2 */
// package SessionTwo;
// import java.util.Scanner;
// public class PrimeNumber {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the starting number:");
//         int n = input.nextInt();
//         System.out.println("Enter the ending number:");
//         int l = input.nextInt();
//         int count = 0;

//         for (int i = n; i <= l; i++) {
//             if (i < 2) {
//                 continue;
//             }
//             boolean isPrime = true;
//             for (int j = 2; j <= Math.sqrt(i); j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if (isPrime) {
//                 System.out.println(i);
//                 count++;
//                 if (count == 20) {
//                     break;
//                 }
//             }
//         }
//     }
// }