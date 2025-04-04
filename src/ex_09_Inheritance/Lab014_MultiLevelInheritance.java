package ex_09_Inheritance;

class Person1 {
    String name;
    String address;

    public void working1(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println(name + " is working in " + address);
    }
}

class Employee1 extends Person1 {
    int empId;
    int sal;

    public int empRecords1(String name, int empId, int sal) {
        this.name = name;
        this.empId = empId;
        this.sal = sal;
        System.out.println("Name: " + name);
        System.out.println("Id: " + empId);
        System.out.println("Salary: " + sal);
        return 0;
    }

    @Override
    public void working1(String name, String address) {
        //super.working(name, address);
        System.out.println("Employee working for 8 hrs");
    }
}

class Developer extends Employee1 {
    public void coding(){
        System.out.println("Coding done.");
    }
}

public class Lab014_MultiLevelInheritance {
    public static void main(String[] args) {

        Developer d = new Developer();
        d.working1("Puja","Pune");
        d.empRecords1("puja", 101, 46000);
        d.coding();
    }
}
