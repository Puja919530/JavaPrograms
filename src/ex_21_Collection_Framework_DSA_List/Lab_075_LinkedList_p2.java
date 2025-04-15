package ex_21_Collection_Framework_DSA_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab_075_LinkedList_p2 {
    public static void main(String[] args) {

        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList();

        List mylist2 = new LinkedList();

        mylist2.add("Puja");
        mylist2.add("Bhute");
        mylist2.add("Parth");
        mylist2.add("Aniket");
        mylist2.add("Aadi");
        mylist2.add("Aadi");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);

        System.out.println(mylist2);
        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Bhute"));
        System.out.println(mylist2.indexOf("Bhute"));

    }
}
