package org.example.Java_35;

/**
 * Pytanie: Co to jest polimorfizm w czasie wykonania w Javie?
 * Odpowiedź:
 * Polimorfizm w czasie wykonania to mechanizm w Javie, w którym wywołanie metody na obiekcie
 * jest rozstrzygane w czasie wykonania programu, a nie w czasie kompilacji. Umożliwia to
 * wykonanie nadpisanej metody w klasie pochodnej, zależnie od rzeczywistego typu obiektu,
 * a nie typu referencji.
 */

// Klasa bazowa
class Vehicle {
    void display() {
        System.out.println("To jest pojazd.");
    }
}

// Klasa pochodna od Vehicle
class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("To jest samochód.");
    }
}

// Inna klasa pochodna od Vehicle
class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("To jest rower.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myVehicle.display(); // Wyświetli: To jest pojazd.
        myCar.display();     // Wyświetli: To jest samochód.
        myBike.display();    // Wyświetli: To jest rower.

        // Tutaj, pomimo że typ referencji jest Vehicle, wykonane zostają metody
        // specyficzne dla rzeczywistych typów obiektów (Car, Bike), co jest
        // przykładem polimorfizmu w czasie wykonania.
    }
}
