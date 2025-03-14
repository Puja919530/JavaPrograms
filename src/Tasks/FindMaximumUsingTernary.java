package Tasks;

import java.util.Scanner;

public class FindMaximumUsingTernary {

    // que.  Take a user input 2 numbers from the arguments and
    // calculate the maximum in between with ternary operator.

    public static void main(String[] args) {

//        int a = Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
          Scanner sc = new Scanner(System.in);
          System.out.println("enter two numbers");
          int a = sc.nextInt();
          int b = sc.nextInt();

          String max = (a>b) ? "a is greater" : "b is greater";
          System.out.println(max);

//        if(a>b){
//            System.out.println("a is greater");
//        }
//        else{
//            System.out.println("b is greater");
//        }
    }
}
