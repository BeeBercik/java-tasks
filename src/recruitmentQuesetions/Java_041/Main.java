package org.example.Java_041;

/**
 * Pytanie: Czy można oznaczyć metodę jako abstrakcyjną oraz finalną?
 * Odpowiedź: Nie, w Javie nie można oznaczyć metody jako jednocześnie abstrakcyjnej i finalnej.
 * Metoda abstrakcyjna wymaga implementacji w klasie pochodnej, a metoda finalna nie może być nadpisana,
 * więc ich współistnienie w definicji metody jest sprzeczne i nie dozwolone przez język Java.
 */

// Przykład klasy z metodą abstrakcyjną
abstract class Vehicle {
    abstract void run(); // Poprawne użycie metody abstrakcyjnej
    // final void stop(); // Niepoprawne: nie można zdefiniować metody jako abstrakcyjnej i finalnej
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Samochód jedzie.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.run(); // Wywołanie zaimplementowanej metody abstrakcyjnej
    }
}

/**
 * W tym przykładzie definiujemy abstrakcyjną klasę Vehicle z abstrakcyjną metodą run(),
 * która jest następnie implementowana w klasie pochodnej Car. Próba oznaczenia metody run() jako final
 * w klasie Vehicle skutkowałaby błędem kompilacji, ponieważ Java nie pozwala na oznaczanie metod
 * jako jednocześnie abstrakcyjnych i finalnych.
 */
