package ex_04_coding_task;

import java.util.Scanner;

public class PatternProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();

        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
