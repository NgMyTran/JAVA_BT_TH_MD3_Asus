package session16;

import java.util.Arrays;

import session16.search.BinarySearch;
import session16.search.LinearSearch;

public class Test {
//    public int linearSearch(int[] arr, int key) {
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==key)
//                return i;
//        }
//        return -1;
//    }
public static void main(String[] args) {
    int [] arr= {1,4,9,5,7,8,3,2,1};
    LinearSearch linearSearch= new LinearSearch();
    int index= linearSearch.LinearSearch(arr,1);
    System.out.println("index: " + index);

    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    BinarySearch binarySearch= new BinarySearch();
    int index2= binarySearch.BinarySearch(arr, 8);
    System.out.println("index2: " + index2);
}
}
