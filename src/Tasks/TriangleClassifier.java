package Tasks;

import java.util.Scanner;

public class TriangleClassifier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side length of triangle");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        if(a==b && b==c){
            System.out.println("Equilateral Triangle");
        } else if (a==b || b==c || c==a) {
            System.out.println("Isosceles triangle");
        }
        else{
            System.out.println("Scalene Triangle");
        }
    }
}
