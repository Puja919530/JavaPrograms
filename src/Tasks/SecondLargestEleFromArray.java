package Tasks;

import java.util.Scanner;

public class SecondLargestEleFromArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the element");
        int arr[] = new int[5];
        for(int i=0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int firstLargest = arr[0];
        int secondLargest = arr[1];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
        }
        System.out.println("First Largest number: " + firstLargest);
        System.out.println("second Largest number: " + secondLargest);

    }
}
