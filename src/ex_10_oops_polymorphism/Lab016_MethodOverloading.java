package ex_10_oops_polymorphism;

class  Calculator{
    int attribute;

    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
}

public class Lab016_MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(12,4);
        System.out.println(c.add(1.2,34.4));
        System.out.println(c.add(45,9));
    }
}
