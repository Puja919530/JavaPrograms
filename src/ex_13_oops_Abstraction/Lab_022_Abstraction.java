package ex_13_oops_Abstraction;

abstract class Father{
    abstract void loan50k();

    void loan(){
        System.out.println("Given 25k");
    }
}
class Child extends Father{

    @Override
    void loan50k() {
        System.out.println("Child will pay the loan!");
    }
}

public class Lab_022_Abstraction {
    public static void main(String[] args) {

        //Father f1 = new Father();
        Father f2 = new Child();
        //f2.loan50k();

        Child c = new Child();
        c.loan();
        c.loan50k();


    }
}
