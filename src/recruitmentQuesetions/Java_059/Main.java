package org.example.Java_059;

/**
 * Pytanie: Co to jest klasa zagnieżdżona w Javie?
 * Odpowiedź: Klasa zagnieżdżona w Javie to klasa zdefiniowana wewnątrz innej klasy.
 * Może być ona statyczna lub niestatyczna i służy do lepszej organizacji kodu oraz
 * kontroli dostępu do składników klasy zewnętrznej.
 */

class Vehicle { // Klasa zewnętrzna
    private String name;

    Vehicle(String name) {
        this.name = name;
    }

    // Statyczna klasa zagnieżdżona
    static class Wheel {
        void showWheel() {
            System.out.println("Koło pojazdu");
        }
    }

    // Klasa wewnętrzna
    class Engine {
        void showEngine() {
            System.out.println("Silnik pojazdu: " + name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Użycie statycznej klasy zagnieżdżonej
        Vehicle.Wheel wheel = new Vehicle.Wheel();
        wheel.showWheel();

        // Użycie klasy wewnętrznej
        Vehicle vehicle = new Vehicle("Samochód");
        Vehicle.Engine engine = vehicle.new Engine();
        engine.showEngine();
    }
}

/**
 * W tym kodzie definiujemy klasę Vehicle z dwoma zagnieżdżonymi klasami: Wheel (statyczną)
 * i Engine (wewnętrzną). Klasa Wheel nie ma dostępu do pól klasy Vehicle, ponieważ jest statyczna,
 * podczas gdy klasa Engine ma bezpośredni dostęp do pól klasy Vehicle, w tym do prywatnego pola name.
 * Demonstruje to, jak klasy zagnieżdżone mogą być wykorzystywane do grupowania powiązanych ze sobą
 * klas i interfejsów w obrębie klasy zewnętrznej, co może przyczynić się do lepszej organizacji kodu.
 */
