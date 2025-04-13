package ex_12_oops_super;

class Vehicle {

    public int maxSpeed = 180;

    Vehicle() {
        System.out.println("Default constructor");
    }

    Vehicle(int a) {
        System.out.println("Parameterized constructor");
    }

    // Method Overloading - Same, same name function with different arguments.
    void message() {
        System.out.println("No return, No argument");
    }

    void message(int a) {
        System.out.println("with parameter");
    }

    void display() {
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicle {

    private int maxSpeed = 281;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Car(){
        super();  // DC
    }
    Car(int a){
        super(10); //PC
    }

    @Override
    void display() {
        System.out.println(this.maxSpeed);

        //Parent
        super.message();
        super.message(10);
        super.display();
        System.out.println("Override");
    }
}

public class Lab_020_SuperKeyword {
    public static void main(String[] args) {
        Car c1 = new Car();
        //c1.display();
    }
}

