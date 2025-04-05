package ex_11_taskCodingQuestion;

import java.util.Scanner;

//1) Check if a Number is Positive or Negative.
public class ex_01_NumIsPositiveOrNegative {

    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Number is positive");
        } else if (n < 0) {
            System.out.println("Number is negative");
        }

    }
}
