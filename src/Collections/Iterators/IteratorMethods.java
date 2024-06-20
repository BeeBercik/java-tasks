package Collections.Iterators;

// iterator jest biedniejsz od np list iteratora
// nie posiada chocby metody .set() (podmianyn)
// i dziala tylko w przod

//WAZNE - metoda .next() najpierw zwaraca obecny element i przesuwa dopiero iterator na kolejny

// Zarowno w iterator jak i listiterator po np. wystwieleniu kolekcji w petli while iterator znajduje sie na koncu kolekcji bo wyswietlil ostatni element i przesunal go ze w nastepnej iteracji nie ma nic (jesli szlisc od poczatku do konca metodą .next(). Dlatego tez ponowne uzycie petli while do wyswietlenia spowoduje blad. Nalezy  wiec albo stworzyc nowy, inny iterator na tej samej kolekcji aby wykonac jakas czynnosc lub tez do tego samego obiektu przypisac nowy powolany obiekt iteratora np. iterator = list.iterator();

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Robert");
        list.add("Wera");

        Iterator<String> iterator = list.iterator(); //zwraca instancje/obiekt klasy implementujacej interfejs iterator

        while (iterator.hasNext()) {
            iterator.next(); // zeby usunac musimy tak jakby przesunac metoda next, wskazac na element/wziasc go do iteratora i dopiero usunac
            iterator.remove();
        }


        System.out.println(list);
    }
}
