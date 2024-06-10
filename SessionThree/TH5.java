/* Tìm giá trị lớn nhất trong mảng */

package SessionThree;

import java.util.Scanner;

public class TH5 {
public static void main(String[] args) {
    int[] arr = {6,9,3,5,0};
    int index = minValue(arr);
    //system.out.println("The smallest element in the array is: " + arr[index]);
}

public static int minValue(int[] array) {
    int index = 0;
    for (int i = 1; i < array.length; i++) {
        if (array[i] < array[index]) {
            index = i;
        }
    }
    return index;
}
}


