package ex_13_oops_Abstraction;

abstract class Engine{
   abstract void startEngine();
    abstract void stopEngine();

    public void normal(){
        System.out.println("Normal function");
    }
}

class Wagonr extends Engine{

    void startEngine(){
        System.out.println("Starting the car!");
    }
    void stopEngine(){
        System.out.println("Stopping the car!");
    }
    void drive(){
        startEngine();
        startEngine();
    }
}

public class Lab_023_AB_Cars {
    public static void main(String[] args) {
        Wagonr car= new Wagonr();
        car.drive();
        car.normal();
    }
}
