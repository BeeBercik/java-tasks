package org.example.Java_042;

/*
Jaka jest Różnica między klasą abstrakcyjną a interfejsem w Javie:
Klasy abstrakcyjne i interfejsy w Javie są mechanizmami, które umożliwiają osiągnięcie abstrakcji,
ale różnią się pod kilkoma względami:
Klasy abstrakcyjne mogą zawierać metody abstrakcyjne (bez implementacji) oraz metody z implementacją.
Klasa, która dziedziczy klasę abstrakcyjną, musi zaimplementować wszystkie jej metody abstrakcyjne,
chyba że sama jest oznaczona jako abstrakcyjna.

Interfejsy w Javie są używane do definiowania kontraktu dla klas. Do Javy 8, interfejsy mogły
zawierać tylko metody abstrakcyjne (bez implementacji). Od Javy 8, interfejsy mogą zawierać
metody domyślne (z implementacją) i metody statyczne.

Kluczowe różnice:
Dziedziczenie: Klasa może dziedziczyć tylko jedną klasę abstrakcyjną, ale może implementować wiele interfejsów.
Metody: Klasy abstrakcyjne mogą zawierać zarówno metody abstrakcyjne, jak i metody z ciałem.
Interfejsy mogą zawierać metody abstrakcyjne, metody domyślne i metody statyczne.
Konstruktory: Klasy abstrakcyjne mogą mieć konstruktory, interfejsy nie mogą.
Zmienne: Klasy abstrakcyjne mogą zawierać stan (pola danych), które mogą być dziedziczone.
Interfejsy mogą zawierać tylko stałe (public static final).
*/


// Przykład klasy abstrakcyjnej
abstract class LivingBeing {
    abstract void breathe(); // Metoda abstrakcyjna

    void live() {
        System.out.println("Żyje.");
    }
}

// Przykład interfejsu
interface Movable {
    void move(); // Metoda abstrakcyjna od Javy 8

    default void stop() {
        System.out.println("Zatrzymuje się.");
    }
}

// Klasa implementująca interfejs Movable
class Animal extends LivingBeing implements Movable {
    @Override
    void breathe() {
        System.out.println("Oddycha.");
    }

    @Override
    public void move() {
        System.out.println("Porusza się.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.breathe();
        animal.move();
        animal.stop(); // Wywołanie metody domyślnej z interfejsu
        animal.live();
    }
}

/**
 * W tym kodzie definiujemy abstrakcyjną klasę LivingBeing z metodą abstrakcyjną breathe()
 * oraz zaimplementowaną metodą live(). Następnie definiujemy interfejs Movable z metodą
 * abstrakcyjną move() i domyślną metodą stop(). Klasa Animal dziedziczy klasę LivingBeing
 * i implementuje interfejs Movable, musi zaimplementować wszystkie metody abstrakcyjne.
 * Demonstruje to, jak klasy abstrakcyjne i interfejsy są używane w Javie do osiągnięcia abstrakcji.
 */
