package ex_03_coding_tasks;

import java.util.Scanner;

public class PrintNameAgeSalary {

//    1.Take a user input - Name, Age and Salary and print them in the end.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name: ");
        String name = sc.next();

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        System.out.println("Enter the Salary: ");
        float salary = sc.nextFloat();

        System.out.println("Name: " + name +"\n"  + "Age: " + age + "\n" + "Salary: " +salary );

    }
}
