package ex_08_oops_encapsulation;

//    Create the Class of ATB ( Encapsulation) , getter & setter)
//    Create both Overloading and OverRIDING Examples

class AutomationTesingBlueprintBatch{

    String courseName;
    String batchTime;
    String trainerName;
    int batchLimt;

    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }

    public String getBatchTime() {
        return batchTime;
    }
    public void setBatchTime(String batchTime) {
        this.batchTime = batchTime;
    }

    public String getTrainerName(){
        return trainerName;
    }
    public void setTrainerName(String trainerName){
        this.trainerName=trainerName;
    }

    public void acceptBatchDetails(String courseName, String batchTime, String trainerName) {
        this.courseName=courseName;
        this.batchTime=batchTime;
        this.trainerName=trainerName;
    }

    // method overloading
    public void acceptBatchDetails(String courseName, String batchTime, String trainerName,int batchLimt) {
        this.courseName=courseName;
        this.batchTime=batchTime;
        this.trainerName=trainerName;
        this.batchLimt=batchLimt;
    }

    public void showBatchDetails(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Batch time: " +batchTime);
        System.out.println("Trainer Name: " + trainerName);
        System.out.println("Batch limit: " + batchLimt);
    }

    public void enrollStudent(){
        System.out.println("Student can enroll offline");
    }


}
class Student extends AutomationTesingBlueprintBatch {

    String studentName;
    int rollNO;
    float marks;

    //method overriding
    public void enrollStudent(){
        System.out.println("Student can enroll online");
    }

    public void enterStudentDetails(String studentName, int rollNO, float marks){
        this.studentName=studentName;
        this.rollNO=rollNO;
        this.marks=marks;
    }

    public int showStudentDetails(){
        System.out.println("Name: "+ studentName);
        System.out.println("Roll no: " +rollNO);
        System.out.println("marks: " + marks);
        return 0;
    }

}


public class Lab009_EncapsulationExaample {
    public static void main(String[] args) {
        AutomationTesingBlueprintBatch atb = new AutomationTesingBlueprintBatch();
        atb.setBatchTime("07.00am");
        System.out.println(atb.getBatchTime());

        atb.acceptBatchDetails("ATBb","07.00AM","Pramod Datta");
        atb.showBatchDetails();
        AutomationTesingBlueprintBatch s = new Student();

        s.enrollStudent();
        atb.enrollStudent();

        Student s1 = new Student();
        s1.enterStudentDetails("Puja",12,77.90f);

        Student s2 = new Student();
        s2.enterStudentDetails("aditya",10,87.90f);
        Student s3 = new Student();
        s3.enterStudentDetails("Parth",20,97.90f);
        s1.showStudentDetails();
        s2.showStudentDetails();
        s3.showStudentDetails();
    }
}
