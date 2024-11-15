package Collections;

// ArrayList to tak naprawde tablica. W arraylist szybsze jest dodawanie na koncu tablicy (w linke dlist tworzy nowy wezel i aktualizuje referencje). Dodanie jednak na poczatku czy srodku jest wolniejsze w arraylist gdyz musi np. przesunac reszte elementow - to samo tyczy sie usuwania elementow. Co do pobierania elementow z listy to jest szybsze w array list gdyz w linked list iteruje od pocatku do konac szukajac zadanego elementu

// metody takie jak w arraylist tzn set(), remove(), addLast(), addFirst() itd..
// LinkedList uzywamy gdy czesto cos wstawiamy, usuwamy a szybkosc odczytu nie ma takiego zaczeia

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIntroduction {
    public static void main(String[] args) {
        LinkedList linked = new LinkedList();
        linked.add("Ola"); // wolniejsze niz arraylist
        linked.add("Kala");
        linked.add(1, "Bingo"); // szybsze niz arraylist

        linked.remove("Ola"); // szybkie
        linked.removeFirstOccurrence("Bingo");
        linked.removeLastOccurrence("Kala");

        linked.add("Robert");
        linked.set(0, "Wera");
        linked.addFirst("Janek");
        linked.addLast("Maciek");
        linked.removeFirst();
        linked.removeLast();
        System.out.println(linked);

        System.out.println(linked.size());

        linked.add("Roberto");
//        ----- LIST ITERATOR -----
        ListIterator<String> iterator1 = linked.listIterator();
        while(iterator1.hasNext()) {
            String name = iterator1.next();
            System.out.println(name);
        }

        ListIterator<String> iterator2 = linked.listIterator(linked.size()); // podajemy index (w tym wypadku ostatni tj dlugosc kolekcji) od ktorego zaczynamy iterowac
        while(iterator2.hasPrevious()) {
            System.out.println(iterator2.previous());
//            Nie mozna uzyc .next() bo warunek sprawdza czy jest element przed wiec nie ma pewnosci czy jest cos po obecnym elemencie i rzuci bledem
        }
    }
}
