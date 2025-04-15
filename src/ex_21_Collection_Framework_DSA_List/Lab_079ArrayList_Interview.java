package ex_21_Collection_Framework_DSA_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab_079ArrayList_Interview {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        //Collection- interface
        //Collection- class (it contains complete method)
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
