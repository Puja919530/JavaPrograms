package ex_15_Instant_Initializtion_Block;

class A1{
    A1(){
        System.out.println("DC");
    }

    {
        System.out.println("Hi, I am IIB");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file

    }

    {
        System.out.println("Hi, I am IIB 2");
    }

    {
        System.out.println("Hi, I am IIB 3");
    }


}

public class Lab_031_IIB {
    public static void main(String[] args) {
        new A1();
    }
}
