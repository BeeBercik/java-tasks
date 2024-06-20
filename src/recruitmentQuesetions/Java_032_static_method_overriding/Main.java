package org.example.Java_032_static_method_overriding;

/**
 * Pytanie: Dlaczego Java nie pozwala na przesłanianie metod statycznych?
 * Odpowiedź: Java nie pozwala na przesłanianie metod statycznych, ponieważ są one
 * związane z klasą, a nie z instancją. Metody statyczne nie uczestniczą w polimorfizmie,
 * co oznacza, że wywołanie metody statycznej zawsze odnosi się do metody zdefiniowanej
 * w klasie, w której została wywołana, niezależnie od tego, jakie klasy pochodne mogą
 * być obecne.
 */

class Vehicle {
    // Statyczna metoda w klasie bazowej
    static void display() {
        System.out.println("Wyświetlanie informacji o pojeździe z klasy bazowej");
    }
}

class Car extends Vehicle {
    // Próba przesłonięcia metody statycznej
    static void display() {
        System.out.println("Wyświetlanie informacji o samochodzie z klasy pochodnej");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle.display(); // Wywołuje metodę z klasy Vehicle
        Car.display(); // Wywołuje metodę z klasy Car

        // Pomimo że Car dziedziczy po Vehicle, wywołania metod statycznych odnoszą się
        // bezpośrednio do klas, w których są zdefiniowane, a nie do hierarchii dziedziczenia.
    }
}

