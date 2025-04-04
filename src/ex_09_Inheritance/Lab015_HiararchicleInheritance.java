package ex_09_Inheritance;
class Person2{
    String name;
    int id;
    public void details(String name, int id){
        this.name=name;
        this.id=id;
        System.out.println("name: " + name);
        System.out.println("Id: " + id);
    }
}
class Emp extends Person2{
    public void officeTime(){
        System.out.println("8hrs");
    }
}
class QA extends Person2{
    public void testPlanning(){
        System.out.println("Test planning done by " +name);
    }
}

public class Lab015_HiararchicleInheritance {
    public static void main(String[] args) {
        Person2 p2 = new Person2();
        //p2.details("Aadi",102);
        QA qa = new QA();
        qa.details("puja",101);
        qa.testPlanning();
    }
}
