package Collections.Iterators;

// W iteratorze metody .next() i .previous() nie tylko pobieraja element ale to one przesuwaja iterator na odpowiednia pozycje tzn np .next() pobiera obecny element i jednoczesnie przesuwa iterator na kolejny aby w nastepnym wykonaniu petli znajdowal sie na wlasciwym - efekt: zastosowanie w jednej iteracji obu metod .next() i .previous() skutkuje zapetleniem w miejscu na jednym elemencie bo przesuwa w przod i cofa jednoczesnie.

// Zwykly iterator posiada metody takie jak .next(), .hasNest(), .remove() - pozwala poruszac sie na kolekcji tylko w przod. Natomiast ListIterator jest bardziej zaawansowany. Posiada dodatkowe metody takie jak .hasPrevious(), .previous()
//WAZNE - metoda .next() najpierw zwaraca obecny element i przesuwa dopiero iterator na kolejny NATOMIAST .previous() najpierw przesuwa a pozniej dopiero zwraca
//WAZNE2 .add() dodaje element wmiejscu gdzie jest obecnie wskaznik a po dodaniu przesuwa skaznik w przod o jedna pozycje.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorMethods {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Robert");
        list.add("Wera");
        list.add("Michal");
        list.add("Lukasz");



//        ListIterator<String> iterator = list.listIterator(2); // chce Wera Robert wiec musze dac na 3 el bo previous najpierw przesunie a pozniej zwraca (w next pierw zwraca pozniej przesuwa)
//        while(iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
//        }

        ListIterator<String> strIterator = list.listIterator();
        while(strIterator.hasNext()) {
            String el = strIterator.next();
            if(el.equalsIgnoreCase("wera")) {
                strIterator.set("kochanie");
            }

            if(el.equalsIgnoreCase("robert")) {
                strIterator.add("mati");
            }
        }

        System.out.println("Zmieniona lista");
        for(String person : list) {
            System.out.println(person);
        }


//        Aby wyswietlic jeszcze raz kolekcje/liste iteratorem to trzeba albo stworzyc nowy iterator albo ten sam najpierw cofnac do pierwszej pozycji i ponownie wysweietlic po kolei
        while(strIterator.hasPrevious()) {
            strIterator.previous();
        }

//        teraz zadziala
        while(strIterator.hasNext()) {
            System.out.println(strIterator.next());
        }


        System.out.println("--------");

        ArrayList<String> houses = new ArrayList<>();
        houses.add("small"); // .add() dodaje element wmiejscu gdzie jest obecnie wskaznik a po dodaniu przesuwa skaznik w przod o jedna pozycje.
        houses.add("medium");
        houses.add("big");


        ListIterator<String> li = houses.listIterator();
//        dodanie na poczatku - cofniecie wskaznika
        while(li.hasPrevious()) {
            li.previous();
        }
        li.add("firstHouse"); // dodaje ale wskaznik wedruje w przod wiec aby wyswietlic calosc z tym elementem trzeba cofnac wskaznik o jeszcze jedna pozycje
        li.previous();
//        li = houses.listIterator(); lub nadpisac iterator nowym - wskaznik na poczatku listy
        while(li.hasNext()) {
            System.out.println(li.next());
        }
    }
}
