package ex_07_oops;

class Person1{
// Create a Class with the Person - where we have DC, PC , two types.
    String name;
    int age;
    String address;
    long phoneNo;
    boolean isMale;

    Person1(){
        System.out.println("Default Constructor");
    }

    public Person1(String name, int age, String address){
        this.name=name;
        this.age= age;
        this.address=address;
    }

    //Behaviour - eat, sleep, walk, doHome, printDetails()- print the details of the all the fields.

    public void eat(String name){
        System.out.println(name + " is eating a food");
    }

    public void sleep(){
        System.out.println("Sleep  8 hrs at night");
    }

    public void walk(int age){
        System.out.println("walking is good for health at the age of  " + age);
    }

    public void doHome(boolean isMale){
        System.out.println("Person " + isMale);
    }

    public void printDetails(String name, int age, String address, long phoneNo, boolean isMale){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(phoneNo);
        System.out.println(isMale);
    }

}
public class Lab008_Constructor {
    public static void main(String[] args) {
        Person1 p1 =new Person1();
        Person1 p2 = new Person1("Puja",30,"pune");
        p2.printDetails("Parth",24,"pune",456789,true);
        p1.doHome(p1.isMale);
        p1.sleep();
        p1.walk(43);
        p1.eat("puja");
    }
}
