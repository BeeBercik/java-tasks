package org.example.Java_028_interface_in_java;

/**
 *
 * Pytanie: Co to jest interfejs w Javie?
 * Odpowiedź:
 * Interfejs w Javie to konstrukcja językowa służąca do definiowania szablonu klas.
 * Pozwala on na określenie metod bez ich implementacji. Klasy implementujące interfejs
 * muszą dostarczyć implementację dla wszystkich zadeklarowanych w nim metod. Interfejsy
 * są używane do osiągnięcia abstrakcji i wielokrotnego dziedziczenia zachowań.
 */

// Definicja interfejsu Vehicle
interface Vehicle {
    void start();
    void stop();
}

// Klasa Car implementująca interfejs Vehicle
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Samochód rozpoczyna jazdę.");
    }

    @Override
    public void stop() {
        System.out.println("Samochód zatrzymuje się.");
    }
}

// Klasa Bicycle implementująca interfejs Vehicle
class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Rower rusza.");
    }

    @Override
    public void stop() {
        System.out.println("Rower zatrzymuje się.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        car.start();
        car.stop();

        bicycle.start();
        bicycle.stop();
    }
}

/**
 * W tym kodzie definiujemy interfejs Vehicle z dwoma metodami: start() i stop().
 * Następnie tworzymy dwie klasy: Car i Bicycle, które implementują interfejs Vehicle,
 * dostarczając konkretną implementację dla jego metod. Demonstruje to, jak interfejsy
 * mogą być używane do definiowania wspólnego zachowania dla różnych klas, promując
 * reużywalność kodu i abstrakcję. Klasy Car i Bicycle mogą być traktowane jako pojazdy,
 * co pozwala na ich używanie w sposób polimorficzny.
 */
