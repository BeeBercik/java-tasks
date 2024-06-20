package org.example.Java_034_overriding_overloaded_method;

/**
 * Pytanie: Czy można nadpisać metodę przeciążoną?
 * Odpowiedź:
 * Tak, w Javie można nadpisać metodę przeciążoną, pod warunkiem, że metoda ta
 * spełnia wszystkie zasady nadpisywania, takie jak zgodność sygnatury i zasady dostępu.
 * Przeciążanie metody pozwala na zdefiniowanie w jednej klasie wielu metod o tej samej
 * nazwie, ale z różnymi listami parametrów. Nadpisywanie metody umożliwia redefiniowanie
 * w klasie pochodnej metody, która już istnieje w klasie bazowej.
 */

class Vehicle {
    // Metoda przeciążona
    void displayInfo() {
        System.out.println("Informacje o pojeździe");
    }

    // Druga metoda przeciążona z różnymi parametrami
    void displayInfo(String type) {
        System.out.println("Typ pojazdu: " + type);
    }
}

class Car extends Vehicle {
    // Nadpisanie jednej z metod przeciążonych
    @Override
    void displayInfo() {
        System.out.println("Informacje o samochodzie");
    }

    // Nadpisanie nie jest możliwe dla metody z innymi parametrami,
    // ponieważ jest to nowa metoda, a nie nadpisanie.
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.displayInfo(); // Wywołuje nadpisaną metodę
        car.displayInfo("Osobowy"); // Wywołuje niezmienioną metodę przeciążoną z klasy bazowej
    }
}

/**
 * W tym przykładzie klasa Car rozszerza klasę Vehicle i nadpisuje jedną z jej przeciążonych metod (displayInfo bez parametrów).
 * Metoda displayInfo z parametrem typu String pozostaje niezmieniona, ponieważ nadpisanie dotyczy tylko metody bez parametrów.
 * Demonstruje to, jak nadpisanie wpływa na wybór metody do wykonania w zależności od obiektu i wywołanej metody.
 */
