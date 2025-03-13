package ex_02_Java_Basic2;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        System.out.println("enter the score");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        System.out.println(grade);
        
    }
}
