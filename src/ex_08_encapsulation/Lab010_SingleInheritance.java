package ex_08_encapsulation;

class AutomationTestingBluePrintBatch1{
    public void batchTime(){
        System.out.println("class time at 7am");
    }
}

class Student1 extends AutomationTestingBluePrintBatch1{
    public void attendClass(){
        System.out.println("attend live class");
    }
}

public class Lab010_SingleInheritance {
    public static void main(String[] args) {
        AutomationTestingBluePrintBatch1 atb1 = new AutomationTestingBluePrintBatch1();
        Student1 stu = new Student1();
        stu.batchTime();
        stu.attendClass();


    }
}
