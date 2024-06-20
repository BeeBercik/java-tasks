package org.example.Java_045;


/**
 * Pytanie: Dlaczego klasa Integer jest finalna w Javie?
 * Odpowiedź: Klasa Integer oraz inne klasy opakowujące są oznaczone jako finalne w Javie,
 * aby zapewnić niezmienność i bezpieczeństwo. Oznacza to, że te klasy nie mogą być rozszerzane,
 * co zapobiega możliwości zmiany ich zachowania przez dziedziczenie. Jest to szczególnie ważne
 * dla typów reprezentujących fundamentalne wartości, jak liczby, które powinny pozostać stałe
 * i przewidywalne w działaniu programu.
 */

class Vehicle {
    private final String type; // Przykład użycia zmiennej finalnej

    public Vehicle(String type) {
        this.type = type; // Inicjalizacja zmiennej finalnej w konstruktorze
    }

    public void displayType() {
        System.out.println("Typ pojazdu: " + type);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Samochód");
        vehicle.displayType(); // Wyświetlenie typu pojazdu
    }
}

/**
 * W tym przykładzie definiujemy klasę Vehicle z finalnym polem type, które reprezentuje typ pojazdu.
 * Pole finalne zapewnia, że raz przypisana wartość do zmiennej type nie może być zmieniona, co
 * odzwierciedla niezmienność klasy Integer. Klasa Vehicle nie jest oznaczona jako finalna w tym
 * przykładzie, ale służy jako ilustracja, jak niezmienność jest ważnym aspektem w projektowaniu
 * klas w Javie, szczególnie tych reprezentujących fundamentalne koncepty i wartości.
 */
