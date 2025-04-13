package ex_20_Generics;

public class Lab_065_Generics {
    public static void main(String[] args) {
        temp_sum(23,5);


        System.out.println(temp_sum("2","g"));
        System.out.println(temp_sum(23.4,56.7));
    }
    static int temp_sum(int a, int b){
        return a+b;
    }
    static double temp_sum(double a, double b){
        return a+b;
    }
    static String temp_sum(String a, String b){
        return a+b;
    }
}
