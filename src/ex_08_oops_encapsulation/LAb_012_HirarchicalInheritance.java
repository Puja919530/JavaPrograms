package ex_08_oops_encapsulation;
class ATB{
    public void newBatchTime(){
        System.out.println("Class time at 06Am");
    }
}
class Students extends  ATB {

    public int submitTask() {
        System.out.println("Task submitted!");
        return 0;
    }
 }
 class NewStudents extends ATB{
    public void fillAttendance(){
        System.out.println("Attendance filled");
    }
 }

public class LAb_012_HirarchicalInheritance {
    public static void main(String[] args) {
        ATB a = new ATB();
        NewStudents ns1 = new NewStudents();
        ns1.newBatchTime();
        ns1.fillAttendance();

    }
}
