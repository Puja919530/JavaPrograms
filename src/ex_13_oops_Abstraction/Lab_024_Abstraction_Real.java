package ex_13_oops_Abstraction;

abstract class Employee{
    private String name;
    private String address;
    private int number;

    Employee(){
        System.out.println("Default Constructor");
    }
    Employee(String name, String address, int number){
        System.out.println("Constructing Employee");

        this.name=name;
        this.address=address;
        this.number=number;
    }

    abstract  double working();

    void mailCheck(){
        System.out.println("Mail check to " + this.name + " " + this.address);
    }
}

class QA extends Employee{
    @Override
     double working() {
        System.out.println("QA is working");
        return 0;
    }
}

public class Lab_024_Abstraction_Real {
    public static void main(String[] args) {
        Employee emp = new QA();
    }
}
