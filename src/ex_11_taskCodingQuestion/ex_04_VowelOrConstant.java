package ex_11_taskCodingQuestion;

import java.util.Scanner;

public class ex_04_VowelOrConstant {
    public static void main(String[] args) {

// 4) Check if a Character is a Vowel or Consonant.
//        System.out.println("Enter the character");
//        Scanner sc = new Scanner(System.in);
        char ch = 'p';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Constant");
        }

    }
}
