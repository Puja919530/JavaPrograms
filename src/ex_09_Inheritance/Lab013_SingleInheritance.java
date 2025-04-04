package ex_09_Inheritance;

class Person{
    String name;
    String address;

    public void working(String name, String address){
        this.name=name;
        this.address=address;
        System.out.println(name + " is working in " + address);
    }
}
class Employee extends Person{

    int empId;
    int sal;

    public int empRecords(String name, int empId,int sal){
        this.name=name;
        this.empId=empId;
        this.sal=sal;
        System.out.println("Name: " + name);
        System.out.println("Id: " +empId);
        System.out.println("Salary: " + sal);
        return 0;
    }
    @Override
    public void working(String name, String address) {
        //super.working(name, address);
        System.out.println("Employee working for 8 hrs");
    }
}

public class Lab013_SingleInheritance {
    public static void main(String[] args) {
        Person p = new Person();
       // p.working("puja","pune");
        p = new Employee();
       // p.working("Pooja","Mumbai");
        Employee e = new Employee();
        e.working("Puja", "Mumbai");
        e.empRecords("puja",101,45000);
    }
}
