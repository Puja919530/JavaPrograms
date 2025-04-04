package ex_10_oops_polymorphism;

class Home{
    public int task(int a, int b ){
        return  a+b;
    }
    public void task(int a, int b,int c){
        int d = a+b+c;
        System.out.println(d);
    }
    //return type does not  matter parameter should be different
    public int task(float a, float b){
        return 0;
    }
}

public class Lab00017_MethodOverloading1 {
    public static void main(String[] args) {
        Home h = new Home();
        System.out.println(h.task(23,5));
        System.out.println(h.task(23.3f,5.5f));
        h.task(2,4,5);
    }
}
