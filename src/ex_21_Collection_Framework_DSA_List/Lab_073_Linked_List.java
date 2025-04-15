package ex_21_Collection_Framework_DSA_List;

import java.util.LinkedList;
import java.util.List;

public class Lab_073_Linked_List {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c"); //Duplicate allow in linked list

        System.out.println(list);

        for(int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
