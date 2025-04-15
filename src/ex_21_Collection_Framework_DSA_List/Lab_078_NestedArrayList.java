package ex_21_Collection_Framework_DSA_List;

import java.util.ArrayList;
import java.util.List;

public class Lab_078_NestedArrayList {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);

        List vegitables = new ArrayList();
        vegitables.add("tamato");
        vegitables.add("Patato");
        vegitables.add("Onion");
        System.out.println(vegitables);

        List all_fruits = new ArrayList();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        all_fruits.add(vegitables);

        System.out.println(all_fruits);
        System.out.println(all_fruits.get(1));


    }
}
