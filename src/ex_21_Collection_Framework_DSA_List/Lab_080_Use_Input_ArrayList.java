package ex_21_Collection_Framework_DSA_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_080_Use_Input_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y";
        while ((continueInput.equalsIgnoreCase("y"))){
            System.out.println("enter the name");
            String name = sc.next();
            names.add(name);

            System.out.println("Enter the age");
            Integer age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("Do you want to enter another");
            continueInput = sc.nextLine();
        }

        for(Object o1:names){
            System.out.println(o1);
        }

        for(Object o2:ages){
            System.out.println(o2);
        }
        sc.close();
    }
}
