package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

// ArrayList to tak naprawde tablica. W arraylist szybsze jest dodawanie na koncu tablicy (w linke dlist tworzy nowy wezel i aktualizuje referencje). Dodanie jednak na poczatku czy srodku jest wolniejsze w arraylist gdyz musi np. przesunac reszte elementow - to samo tyczy sie usuwania elementow. Co do pobierania elementow z listy to jest szybsze w array list gdyz w linked list iteruje od pocatku do konac szukajac zadanego elementu

// metody takie jak w arraylist tzn set(), remove(), addLast(), addFirst() itd..
// ArrayList uzywamy, gdy chcemy miec szybki dostep do elementow, odczyt szybki

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

//        nums.clear(); // czysci kolekcje
        nums.remove(1);
        nums.set(0, 10);
        nums.addFirst(50);
        nums.addLast(100);
        nums.removeFirst();
        nums.removeLast();

        ArrayList<Integer> additionalNums = new ArrayList<>();
        additionalNums.add(0);
        additionalNums.add(-10);

        nums.addAll(additionalNums); // dodaje cala kolekcje
        System.out.println("Czy pusta - " + nums.isEmpty());
        nums.remove(nums.size() - 1); // usunie ostatni element tj. -10 BO PODAJEMY INDEX
        System.out.println("Zawiera 0 - " + nums.contains(0));
        System.out.println("Numsy zawieraja elementy addNumsow - " + nums.containsAll(additionalNums));

        for(Integer num : nums) {
            System.out.println(num);
        }

        ArrayList<Integer> c1 = new ArrayList<>();
        ArrayList<Integer> c2 = new ArrayList<>();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c2.add(1);
        c2.add(2);
        System.out.println("c1 zawiera elementy c2: " + c1.containsAll(c2));

        c1.removeAll(c2);
//        c2.removeAll(c1);
        for(Integer num : c1) {
            System.out.println("El c1: " + num);
        }

//        ARRAY LIST DO ZWYKLEJ TABLICY
        Integer[] numTab = new Integer[nums.size()];
        numTab = nums.toArray(numTab); // toArray() zwraca obj weic przekazujemy nasza tab aby wykrolo jakiego typu elementy i do niej je skopiowalo
        for(Integer num : numTab) {
            System.out.println(num);
        }
    }

}
