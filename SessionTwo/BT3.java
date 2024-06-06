package SessionTwo;
import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        String result = "";

        if (number > 0 && number <= 12) {
            result = readNumber(number, true);
        }
        
        else if (number >= 13 && number <= 19) {
            int donvi = number % 10;
            result = readNumber(donvi, false) + "teen";
        } 
        else if (number < 100) {
            int chuc = number / 10;
            if (number % 10 == 0) {
                result = readNumber(chuc, false) + "ty";
            } else {
                int donvi = number % 10;
                result = readNumber(chuc, false) + "ty " + readNumber(donvi, true);
            }
        }
         else if (number < 1000) {
            int tram = number / 100;
            int chucdonvi = number % 100;
            result = readNumber(tram, true) + " hundred";

            if (number % 100 != 0) {
                result += " and ";
                if (chucdonvi > 0 && chucdonvi <= 12) {
                    result += readNumber(chucdonvi, true);
                } 
                
                else if (chucdonvi >= 13 && chucdonvi <= 19) {
                    int donvi = chucdonvi % 10;
                    result += readNumber(donvi, false) + "teen";
                }
                 else {
                    int chuc = chucdonvi / 10;
                    if (chucdonvi % 10 == 0) {
                        result += readNumber(chuc, false) + "ty";
                    } else {
                        int donvi = chucdonvi % 10;
                        result += readNumber(chuc, false) + "ty " + readNumber(donvi, true);
                    }
                }
            }
        } else {
            System.err.println("Number is too large, cannot read.");
        }
        
        System.out.println(result);
        scanner.close();
    }

    public static String readNumber(int num, boolean check) {
        switch (num) {
            case 1: return "one";
            case 2: return check ? "two" : "twen";
            case 3: return check ? "three" : "thir";
            case 4: return "four";
            case 5: return check ? "five" : "fif";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 20: return "twenty";
            case 30: return "thirty";
            case 40: return "forty";
            case 50: return "fifty";
            default: return "";
        }
    }
}
