package ex_21_Collection_Framework_DSAList;

import java.util.ArrayList;
import java.util.List;

public class Lab_070_List {
    public static void main(String[] args) {

       // List fruits = new List();
        List fruits = List.of("orange","apple","banana","mango","watermelon");
        System.out.println(fruits);
//        fruits.add("chiku"); // java.lang.UnsupportedOperationException
        //fruits.remove("apple"); // Not possible

        List l = new ArrayList(); // Dynamic Diapatch
        ArrayList l2 = new ArrayList();
        l.add("hello");
        l.add(123);
        l.add(true);
        l.add("Blah Blah");

    }
}
