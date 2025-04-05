package ex_11_taskCodingQuestion;

import java.util.Scanner;

public class ex_05_EligibleForVote {
    public static void main(String[] args) {
        //5) Check if a Person is Eligible to Vote (Age Check)
        System.out.println("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for vote!");
        }
        else {
            System.out.println("Not eligible for vote ");
        }
    }
}
