package ex_21_Collection_Framework_DSA_List;

import java.util.LinkedList;
import java.util.List;

public class Lab_074_LinkedList {
    public static void main(String[] args) {

        List<String> animal = new LinkedList<String>();
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Lion");
        animal.add("Elephant");
        System.out.println("LinkedList: " + animal);

        //Accessing element
       // System.out.println("First element: " + animal.getFirst());
       // System.out.println("Last element: " + animal.getLast());

        //Removing elements
     //   animal.removeFirst();
     //   animal.removeLast();

      //  System.out.println("Linked list after remove" + animal);
        System.out.println("Size of Linked List: " + animal.size());
    }
}
