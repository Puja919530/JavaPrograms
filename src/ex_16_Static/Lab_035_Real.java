package ex_16_Static;

class ATB{

    private String name; // non static
    private String phone;
    static String courseName = "ATB11x";
    static String mentorName = "Pramod";

    static {
        System.out.println("Load the the class, I will execute");
    }
    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static String getCourseName() {
        return courseName;
    }

    public static void setCourseName(String courseName) {
        ATB.courseName = courseName;
    }
    public static String getMentorName(){
        return mentorName;
    }
    public static void setMentorName(String mentorName){
        ATB.mentorName=mentorName;
    }
    static void doAssignment(){
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }

    void howTheyAssignment(){
        System.out.println("It is different!");
    }
}

public class Lab_035_Real {
    public static void main(String[] args) {
        System.out.println(ATB.courseName);
        System.out.println(ATB.mentorName);
        ATB.doAssignment();
        ATB.joinZoomForClass();

        ATB amit = new ATB();
        amit.setName("amit");
        amit.setPhone("9284783094");
        System.out.println(amit.getName());

        ATB lucky = new ATB();
        lucky.setName("lucky");
        lucky.setPhone("988765456");
        System.out.println(amit.getPhone());
    }
}
