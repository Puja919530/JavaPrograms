package ex_05_string;

public class Lab005_StringFunctions {
    public static void main(String[] args) {

        String name = "Sonal";
        //1. length()
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        //System.out.println(name.charAt(10)); //Throw exception ArrayIndexOutOfBoundException

        // 2. concat()
        System.out.println(name.concat("patel"));

        // 3. contains()
        System.out.println(name.contains("om"));

        //4.equals()
//        String s = "nal";
        System.out.println(name.equals("Sonal"));

        //5.equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));

        //6.IndexOf()
        System.out.println(name.indexOf('a'));

        //7.replace()
        System.out.println(name.replace('n', 'N'));

        //8.Split
        String email = "puja@123@.com";
        String[] split = email.split("@");

        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //9.subString
        System.out.println(name.substring(1,3));

        //10.toLowerCase()
        System.out.println(name.toLowerCase());

        //11. toUpperCase()
        System.out.println(name.toUpperCase());

        //12.trim()
        String s1 = "  Puja Bhute   ";
        System.out.println(s1.trim());

        //13. startWith
        System.out.println(name.startsWith("S"));

        //14. endWith
        System.out.println(name.endsWith("a"));

        //15. compareTo
        System.out.println(name.compareTo("Sonal"));


    }
}
