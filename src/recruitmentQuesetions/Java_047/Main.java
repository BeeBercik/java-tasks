package org.example.Java_047;
/**
 * Pytanie: Co to jest zmienna finalna bez wartości początkowej (blank final variable) w Javie?
 * Odpowiedź: Zmienna finalna bez wartości początkowej to zmienna finalna, która nie jest inicjalizowana
 * w momencie deklaracji. Musi zostać zainicjalizowana w konstruktorze klasy. Pozwala to na przypisanie jej
 * różnych wartości w różnych instancjach obiektów, przy jednoczesnym zachowaniu jej niezmienności po inicjalizacji.
 */

class Building { // Przykładowa klasa reprezentująca budynek z unikalnym numerem identyfikacyjnym
    final int buildingID; // Zmienna finalna bez wartości początkowej

    public Building(int id) {
        this.buildingID = id; // Inicjalizacja zmiennej finalnej w konstruktorze
    }

    public void displayID() {
        System.out.println("ID budynku: " + buildingID); // Metoda wyświetlająca ID budynku
    }
}

public class Main {
    public static void main(String[] args) {
        Building building1 = new Building(101); // Tworzenie nowego obiektu klasy Building z ID 101
        Building building2 = new Building(102); // Tworzenie nowego obiektu klasy Building z ID 102

        building1.displayID(); // Wyświetlenie ID pierwszego budynku
        building2.displayID(); // Wyświetlenie ID drugiego budynku
    }
}

/**
 * W tym kodzie definiujemy klasę Building, która posiada zmienną finalną bez wartości początkowej `buildingID`.
 * Zmienna ta jest inicjalizowana w konstruktorze klasy, co pozwala na przypisanie unikalnego ID dla każdego
 * obiektu klasy Building. Pokazuje to zastosowanie zmiennej finalnej bez wartości początkowej w Javie, umożliwiając
 * przypisanie różnych, niezmienialnych wartości dla różnych instancji.
 */
