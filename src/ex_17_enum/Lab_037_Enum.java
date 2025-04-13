package ex_17_enum;

class A {
    String[] days = {"Mon", "Tue", "Wed", "Thurs", "Fri", "Sat", "Sun"};
}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
}
enum Project_Urls{
    google, restassured, katalon, vwo
}

public class Lab_037_Enum {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.days[4]);

        System.out.println(Day.FRIDAY);
        System.out.println(Project_Urls.katalon);

    }
}
