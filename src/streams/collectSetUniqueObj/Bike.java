package streams.collectSetUniqueObj;

import java.util.Objects;

// COmparator i Comparable uzywamy w kontekscie sortowania obiektow naszych klas np w metodach Collections.sort(), lub Arrays.sort()
// Z kolei metody hashCode() i equals() przydatne w celu identyfikowania obiektow, porownywania ich. Uzywamy ich np. w kontekscie kolekcji takich jak HashMap, HashSet (sprawdzajac czy obiekty sa takie same, czy nie - unikalnosc)

// W 2gim pliku wynik ze strumienia metoda collect zbieramy i przekazujemy/zbieramy do kolekcji set (unikal. el.). Aby mechanizm Set'a wiedzial po czym porownywac NASZE OBIEKTY, aby byly unikalne musimy im zaimplementowac metode hashCode() i equals() - skrot alt+insert i wybieramy zmienna po jakiej ma byc sprawdzana unikalnosc.

public class Bike {
    String make;
    String color;
    int wheels;

    public Bike(String make, String color, int wheels) {
        this.make = make;
        this.color = color;
        this.wheels = wheels;
    }

    @Override
    public boolean equals(Object o) {
//        jesli obiekt tej klasy = inny obiekt => sa takie same TRUE
        if (this == o) return true;
//        drugi obiekt to null lub klasa obecnego obiektu oraz innego sa rozne => sa to inne obj FALSE
        if (o == null || this.getClass() != o.getClass()) return false;
//        w przeciwnym razie drugi obj rzutuj na ta klase (czyli jego domyslna, sprawdzilismy wczesniej. Przyjmujemy kazdy obiekt dlatego argument metody ma typ Object - stad rzutowanie) aby porownac wlasciwosci
        Bike bike = (Bike) o;
//        .equals() porownuje tylko obiekty np 5.equals(5) [musza byc typ INTEGER - nie int] lub "haha".equals("haha")
//        metoda Obj.equals jest ogolna bo porownuje obiekty jako dwa argumenty
        return Objects.equals(this.make, bike.make);
    }

    @Override
    public int hashCode() {
//        generuje wartosc liczbowa reprezentujaca obiekt
        return Objects.hash(make);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
