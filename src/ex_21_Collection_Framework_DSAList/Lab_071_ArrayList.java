package ex_21_Collection_Framework_DSAList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Lab_071_ArrayList {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add("PUJA");
        arrayList.add(null);
        arrayList.add("Bhute");
        arrayList.add("Bhute"); //Duplicate data are allowed
        arrayList.add(123); // Different data type is allowed.
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l1 = new ArrayList();  // Dynamic Dispatch
        l1.add("123");
        l1.add("456");
        System.out.println(l1);
        System.out.println(l1.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());

    }
}
