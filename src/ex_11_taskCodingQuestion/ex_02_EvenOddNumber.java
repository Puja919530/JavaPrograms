package ex_11_taskCodingQuestion;

import java.util.Scanner;

public class ex_02_EvenOddNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
