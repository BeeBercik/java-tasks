package org.example.Java_061;

/**
 * Pytanie: Czy interfejs może być zdefiniowany w klasie?
 * Odpowiedź: Tak, interfejs może być zdefiniowany w klasie jako interfejs wewnętrzny.
 * Pozwala to na lepszą organizację kodu i grupowanie powiązanych funkcji wewnątrz klasy.
 */

class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    // Interfejs wewnętrzny
    interface Engine {
        void start();
        void stop();
    }

    // Klasa wewnętrzna implementująca interfejs Engine
    class ElectricEngine implements Engine {
        public void start() {
            System.out.println(name + " rozpoczyna jazdę za pomocą silnika elektrycznego.");
        }

        public void stop() {
            System.out.println(name + " zatrzymuje się, wyłączając silnik elektryczny.");
        }
    }

    // Metoda tworząca instancję klasy wewnętrznej ElectricEngine
    public Engine getEngine() {
        return new ElectricEngine();
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle tesla = new Vehicle("Tesla Model S");
        Vehicle.Engine engine = tesla.getEngine();
        engine.start();
        engine.stop();
    }
}

/**
 * W tym przykładzie, klasa `Vehicle` zawiera wewnętrzny interfejs `Engine` oraz klasę wewnętrzną `ElectricEngine`,
 * która implementuje interfejs `Engine`. Demonstruje to, jak interfejsy wewnętrzne mogą być używane do organizacji kodu
 * i zapewnienia modularności. Dzięki temu, klasy mogą posiadać zdefiniowane w sobie interfejsy, które szczegółowo określają
 * zachowanie lub umowy implementacji dla klas wewnętrznych lub zewnętrznych.
 */
