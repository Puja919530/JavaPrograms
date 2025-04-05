package ex_05_string;

public class Lab001_Immutable_String {
    public static void main(String[] args) {

        String name = "puja";
        name.toUpperCase();//PUJA
        //string can not change because it is immutable
        System.out.println(name);
    }
}
