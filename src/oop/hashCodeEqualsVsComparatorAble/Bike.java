package oop.hashCodeEqualsVsComparatorAble;

import java.util.Objects;

// Comparator i Comparable uzywamy w kontekscie sortowania obiektow naszych klas np w metodach Collections.sort(), lub Arrays.sort()
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
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return Objects.equals(make, bike.make);
    }

    @Override
    public int hashCode() {
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
