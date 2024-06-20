package org.example.Java_044;

/**
 *
 * Pytanie: Jak możemy stworzyć metodę final w Javie?
 * Odpowiedź: Metoda oznaczona jako final w Javie jest metodą, której nie można
 * przesłonić w żadnej z klas pochodnych. Aby zdefiniować metodę jako final,
 * używamy słowa kluczowego final przed typem zwracanym metody w jej deklaracji.
 * Jest to użyteczne, gdy chcemy zachować stałe zachowanie metody, niezależnie od
 * dziedziczenia i modyfikacji w klasach pochodnych.
 */

class Vehicle {
    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    // Metoda final, nie może być przesłonięta w klasach pochodnych
    public final void displayType() {
        System.out.println("Typ pojazdu: " + type);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Samochód");
        vehicle.displayType(); // Wywołanie metody final
    }
}

/**
 * W tym przykładzie definiujemy klasę Vehicle z metodą displayType oznaczoną jako final.
 * Oznacza to, że żadna klasa dziedzicząca po klasie Vehicle nie może przesłonić metody displayType.
 * W metodzie main tworzymy instancję klasy Vehicle i wywołujemy metodę displayType,
 * co skutkuje wyświetleniem typu pojazdu. Użycie metody final zapewnia, że zachowanie
 * tej metody pozostanie niezmienne niezależnie od ewentualnych klas dziedziczących.
 */
