package org.example.Java_039;

/**
 * Pytanie: Czy można oznaczyć metodę jako abstrakcyjną bez oznaczania klasy jako abstrakcyjnej?
 * Odpowiedź: Nie, nie można oznaczyć metody jako abstrakcyjnej bez oznaczania klasy jako abstrakcyjnej.
 * Klasy abstrakcyjne są używane do definiowania szablonów dla klas pochodnych, a metody abstrakcyjne muszą zostać zaimplementowane przez klasy dziedziczące. Próba oznaczenia metody jako abstrakcyjnej w klasie nieabstrakcyjnej
 * spowoduje błąd kompilacji.
 */

// Przykład klasy abstrakcyjnej z metodą abstrakcyjną
abstract class Vehicle {
    // Metoda abstrakcyjna, która musi być zaimplementowana przez klasy dziedziczące
    abstract void start();
}

// Klasa dziedzicząca po klasie abstrakcyjnej i implementująca jej metodę abstrakcyjną
class Car extends Vehicle {
    // Implementacja metody abstrakcyjnej
    @Override
    void start() {
        System.out.println("Samochód uruchamia silnik.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Wywołanie zaimplementowanej metody
    }
}

/**
 * W tym przykładzie zdefiniowana jest abstrakcyjna klasa Vehicle z abstrakcyjną metodą start().
 * Klasa Car dziedziczy po klasie Vehicle i dostarcza własną implementację metody start().
 * Dzięki temu, pokazujemy jak klasy abstrakcyjne i metody abstrakcyjne umożliwiają definiowanie
 * i wymuszanie kontraktów dla klas pochodnych.
 */
