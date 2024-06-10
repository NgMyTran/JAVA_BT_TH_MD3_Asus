package SessionThree;

import java.util.Scanner;

public class TH6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
         System.out.println("Enter the amount of student have to check mark: ");
         int size = input.nextInt();
            int[] arr = new int[size];

            for(int i=0; i<arr.length;i++){
                System.out.println("Enter the mark of student "+(i+1)+": ");
                arr[i] = input.nextInt();
            }
            int count = 0;
            System.out.println("List of mark: ");   
            for(int j=0; j < arr.length;j++){
                System.out.println(arr[j]);
                if(arr[j] >= 5 && arr[j] <= 10){
                    count++;
                }
            } System.out.println("The number of students passing the exam is: "+count);
    }
}
