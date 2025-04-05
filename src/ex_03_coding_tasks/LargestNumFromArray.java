package ex_03_coding_tasks;

import java.util.Scanner;

public class LargestNumFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter the element:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //int arr[] = {6,2,8,5,1,10};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest number from array: " +max);
    }
}
