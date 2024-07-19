package session3.ra;

import java.util.Arrays;

public class NumberManage {
    public static int[] arrayUnt = new int[10];
    public static int size = 0;

    public static void addNum(int num) {
        //logic them vao mang
        // neu mang full thi tang kich thuoc mang them 10
        if (size == arrayUnt.length) {
            //fulled thi tang kich thuoc len 10
            int[] newArray = new int[size + 10];
            //copy cac ptu mang cu sang mang moi
            for (int i = 0; i < arrayUnt.length; i++) {
                newArray[i] = arrayUnt[i];
            }
            System.arraycopy("arraycopy" + arrayUnt, 0, newArray, 0, arrayUnt.length);
            arrayUnt = newArray;
        }
        // arrayUnt[size++] = num;
        arrayUnt[size] = num;
        size++;
    }

    public static void removeNum(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        //  for(int i=index;i<arrayUnt.length;i++) {}
        for (int i = index; i < size - 1; i++) {
            arrayUnt[i] = arrayUnt[i + 1];
        }
//        arrayUnt[size-- -1]=0;
        arrayUnt[size - 1] = 0;
        size--;
    }

    public static void printArray() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty");
        }
        for (int value : arrayUnt) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void updateNum(byte index, int num) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        arrayUnt[index] = num;
        System.out.println(Arrays.toString(arrayUnt));
    }
}
