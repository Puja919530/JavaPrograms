package ex_08_oops_encapsulation;
class AutomationTestingBluePrintBatch2{
    public void batchTime1(){
        System.out.println("class time at 7am");
    }
}

class Student2 extends AutomationTestingBluePrintBatch2{
    public void attendClass1(){
        System.out.println("attend live class");
    }
}

class NewStudent1 extends Student2{
    public void attendClass1(){
        System.out.println("attend online class or can watch recorded session");
    }
    public void downloadNotes1(){
        System.out.println("Notes downloading...");
    }
}


public class Lab011_MultiLevelInheritance {
    public static void main(String[] args) {
        NewStudent1 ns = new NewStudent1();
        ns.batchTime1();
        ns.attendClass1();
        ns.downloadNotes1();

    }
}
