package org.example.Java_037;

/**
 * Pytanie: Co to jest abstrakcja w programowaniu obiektowym?
 * Odpowiedź:
 * Abstrakcja to kluczowy koncept programowania obiektowego, który pozwala na ukrycie
 * szczegółów implementacji i eksponowanie tylko niezbędnych funkcji obiektu. W Javie,
 * abstrakcję realizuje się za pomocą klas abstrakcyjnych i interfejsów, co umożliwia
 * definiowanie struktury klas w sposób, który ukrywa kompleksowość wewnętrzną przed
 * użytkownikiem końcowym.
 */

// Klasa abstrakcyjna pojazd
abstract class Vehicle {
    abstract void drive();
}

// Konkretna klasa Car rozszerzająca Vehicle
class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Samochód jedzie.");
    }
}

// Konkretna klasa Bicycle rozszerzająca Vehicle
class Bicycle extends Vehicle {
    @Override
    void drive() {
        System.out.println("Rower jedzie.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBicycle = new Bicycle();

        myCar.drive();
        myBicycle.drive();
    }
}
