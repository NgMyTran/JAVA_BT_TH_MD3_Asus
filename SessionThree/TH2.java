/*Tìm vị trí tên student đứng chỉ số mấy trong mảng */

package SessionThree;

import java.util.Scanner;

public class TH2 {
    public static void main(String[] args) {
    String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter a name's student: ");
     Scanner scanner = new Scanner(System.in);
        String input_name = scanner.nextLine();
    boolean isExist = false;

for (int i = 0; i < students.length; i++) {
    if (students[i].equals(input_name)) {
        System.out.println("Position of the students in the list " + input_name + " is: " + i);
        isExist = true;
        break;
    }
}
if (!isExist) {
    System.out.println("Not found" + input_name + " in the list.");
}
}}
