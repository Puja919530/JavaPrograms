package ex_05_string;

public class Lab002_StringCreation {
    public static void main(String[] args) {

        String str = "puja";// stored in string constant pool

        String str1 = new String("puja");
        // stored in Object Area
        //Object area is in Heap area
        System.out.println(str);
        System.out.println(str1);

    }
}
