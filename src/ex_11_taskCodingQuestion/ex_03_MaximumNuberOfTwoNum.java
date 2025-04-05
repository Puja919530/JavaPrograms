package ex_11_taskCodingQuestion;

import java.util.Scanner;

public class ex_03_MaximumNuberOfTwoNum {
    public static void main(String[] args) {
        //3) Find the Maximum of Two Numbers.
        System.out.println("Enter the two number");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int max = 0;
        if(n1>n2){
            max = n1;
            System.out.println(n1 + " is greater");
        }
        else{
            System.out.println(n2 + " is greater");
        }
    }
}
