package Collections;

// Prosty test czy faktycznie jest roznica w wydajnosci zastosowania ArrayList a LinkedList
// sprawdzam na bazie dodawania na koncu listy - ArrayList w teorii szybsze bo po prostu dodaje a LinkedList musi stworzyc nowy wezel i zaktualizowac referencje do niego
// Efekt - faktycznie jest roznica przy bardzo duzych zbiorach

import java.util.ArrayList;
import java.util.LinkedList;

public class ListSpeedTest {
    public static void main(String[] args) {
//         ARRAY LIST
        ArrayList<String> names1 = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            names1.add("Werka");
        }
//        System.out.println(names1);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList sec: " + (end - start));

//        LINKED LIST
        LinkedList names2 = new LinkedList();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            names2.add("Werka");
        }
//        System.out.println(names2);
        long end2 = System.currentTimeMillis();
        System.out.println("LinkedList sec: " + (end2 - start2));



    }
}
