package org.example.Java_040;

/**
 * Pytanie: Czy możemy tworzyć instancje klasy abstrakcyjnej w Javie?
 * Odpowiedź: Bezpośrednio nie, klasy abstrakcyjne w Javie nie mogą być zainstancjonowane za pomocą operatora new.
 * Są one zaprojektowane do dziedziczenia przez inne klasy, które implementują ich abstrakcyjne metody. Jednak możemy
 * tworzyć instancje klasy abstrakcyjnej poprzez definicję anonimowej klasy wewnętrznej, która dostarcza implementacje
 * dla wszystkich abstrakcyjnych metod klasy abstrakcyjnej.
 */

// Przykład klasy abstrakcyjnej z metodą abstrakcyjną
abstract class Animal {
    abstract void sound();
}

public class Main {
    public static void main(String[] args) {
        // Tworzenie instancji klasy abstrakcyjnej za pomocą anonimowej klasy wewnętrznej
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Pies robi woof!");
            }
        };


        dog.sound(); // Wywołanie zaimplementowanej metody abstrakcyjnej
    }
}

/**
 * W tym przykładzie definiujemy abstrakcyjną klasę Animal z abstrakcyjną metodą sound().
 * Następnie tworzymy instancję klasy Animal za pomocą anonimowej klasy wewnętrznej, która
 * implementuje metodę sound(). To pokazuje, jak można pracować z klasami abstrakcyjnymi,
 * mimo że bezpośrednie tworzenie ich instancji jest niemożliwe.
 */
