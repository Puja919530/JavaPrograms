package Tasks;

import java.util.Scanner;

public class CountVowelConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        char[] ch = str.toCharArray();
        int count_vowels = 0;
        int count_contant = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
               count_vowels++;
            }
            else {
               // System.out.println("Constant");
               count_contant =  count_contant+1;
            }
        }
        System.out.println("Vowels-" + count_vowels);
        System.out.println("Constants-" + count_contant);

    }
}
