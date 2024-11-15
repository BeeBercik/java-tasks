package Collections;

// Posiada unikalne, posortowane od najmn. do najw obiekty (w formie odwroconego drzewa)
// posiada metody takie jak .lower(), ceiling() ktore zwracaja wartosc nblizsza spelniajaca warunek

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        for(int i = 0; i < 30; i++) {
//            do 101 bo zaokragla w dol i g dy bedzie np. 0,99879 * 100 = 99,879 to zaokragli do 99
            int index = (int) Math.floor(Math.random() * 101);
            tree.add(index);
        }

//        zwraca iterator ktory przechodzi od konca
        Iterator<Integer> descIterator = tree.descendingIterator();
        while(descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }
    }
}
