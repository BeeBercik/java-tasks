package org.example.Java_048;

/**
 * Pytanie: Jaki jest cel stosowania pakietów (package) w Javie?
 * Odpowiedź: Celem pakietów w Javie jest organizacja klas i interfejsów w przestrzenie nazw,
 * co ułatwia zarządzanie kodem, unikanie konfliktów nazw oraz kontrolę dostępu do
 * elementów programu. Pakiety pozwalają na grupowanie powiązanych klas i interfejsów,
 * co ułatwia ich ponowne użycie i utrzymanie.
 */

class Toy { // Klasa Toy reprezentująca zabawkę z unikalnym identyfikatorem i nazwą
    private int toyId;
    private String toyName;

    // Konstruktor klasy Toy inicjalizujący ID i nazwę zabawki
    public Toy(int toyId, String toyName) {
        this.toyId = toyId;
        this.toyName = toyName;
    }

    // Metoda wyświetlająca informacje o zabawce
    public void displayInfo() {
        System.out.println("Toy ID: " + toyId + ", Toy Name: " + toyName);
    }
}

public class Main {
    public static void main(String[] args) {
        Toy toy = new Toy(1, "Lego Set"); // Tworzenie nowego obiektu klasy Toy

        toy.displayInfo(); // Wywołanie metody wyświetlającej informacje o zabawce
    }
}

/**
 * W tym kodzie definiujemy klasę Toy, która reprezentuje zabawkę. Klasa ta jest częścią pakietu
 * `org.example.questions1`, co pomaga w organizacji kodu, zwłaszcza gdy pracujemy nad dużymi projektami.
 * Użycie pakietów umożliwia lepszą organizację kodu i ułatwia jego zarządzanie, ponowne użycie oraz utrzymanie.
 */
