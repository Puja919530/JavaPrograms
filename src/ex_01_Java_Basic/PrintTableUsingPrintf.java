package ex_01_Java_Basic;

public class PrintTableUsingPrintf {
    public static void main(String[] args) {

        byte n = 9;
        System.out.println("Multiplication table of:" + n);
        System.out.printf(" %d * 1 = %d \n ", n, (n*1));
        System.out.printf("%d * 2 = %d \n", n, (n*2));
        System.out.printf(" %d * 3 = %d \n", n, (n*3));
        System.out.printf(" %d * 4 = %d \n", n, (n*4));
        System.out.printf(" %d * 5 = %d \n", n, (n*5));
        System.out.printf(" %d * 6 = %d \n", n, (n*6));
        System.out.printf(" %d * 7 = %d \n", n, (n*7));
        System.out.printf(" %d * 8 = %d \n", n, (n*8));
        System.out.printf(" %d * 9 = %d \n", n, (n*9));
        System.out.printf(" %d * 10 = %d \n", n, (n*10));
    }
}
