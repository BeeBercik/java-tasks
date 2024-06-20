package org.example.Java_046;

/**
 * Pytanie: Jak można zabronić dziedziczenia w Javie?
 * Odpowiedź: Dziedziczenie można zabronić w Javie, oznaczając klasę słowem kluczowym `final`.
 * Oznacza to, że żadna inna klasa nie może dziedziczyć po klasie oznaczonej jako final.
 * Jest to przydatne, gdy chcemy zapewnić, że zachowanie klasy pozostaje niezmienione
 * przez klasy dziedziczące.
 */

final class Vehicle { // Klasa oznaczona jako final, nie można po niej dziedziczyć
    private String type;

    public Vehicle(String type) {
        this.type = type; // Inicjalizacja pola typu w konstruktorze
    }

    public void displayType() {
        System.out.println("Typ pojazdu: " + type); // Metoda wyświetlająca typ pojazdu
    }
}

// Próba dziedziczenia po klasie finalnej Vehicle skończyłaby się błędem kompilacji
// class Car extends Vehicle { // To spowodowałoby błąd kompilacji
// }

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Samochód");
        vehicle.displayType(); // Wyświetlenie typu pojazdu
    }
}

/**
 * W tym przykładzie klasa Vehicle jest oznaczona jako final, co oznacza, że żadna inna klasa
 * nie może po niej dziedziczyć. Pokazuje to mechanizm Javy do zapobiegania dziedziczeniu,
 * co może być użyteczne w różnych scenariuszach projektowych, szczególnie gdy chcemy
 * zachować niezmienność i zapewnić, że zachowanie klasy nie zostanie zmodyfikowane
 * przez rozszerzenie.
 */
