package ex_07_oops;
class Person{

    String firstName, lastName;
    int age;
    int salary;
    String address;
    long mobN0;

    // 1.Without Parameters and Without Return Type
    public void welcome(){
        System.out.println("Wellcome to new world");
    }

// 2.Without Parameters but With Return Type
    public int greet(){
        System.out.println("Good Morning");
        return 1;
    }


// 3.With Parameters and Without Return Type
    public void acceptDetails(String firstName, String lastName, int age, int salary, String address){
        System.out.println("Person first name " + firstName);
        System.out.println("Person last name " + lastName);
        System.out.println("Person age " + age);
        System.out.println("Person salary " + salary);
        System.out.println("Person address " + address);

    }
// 4. With Parameters and With Return Type
    public String showPersonAddress(String address, long mobN0){
        System.out.println("Current address: " + address + mobN0);
        return address;
    }
}
public class L007_Person {
    public static void main(String[] args) {

        Person p = new Person();
        p.welcome();
        p.greet();
        p.acceptDetails("puja", " bhute", 30, 60000,"pune");
        p.showPersonAddress("Pune",928478305);


    }
}
