package org.example.Java_025_static_variables_bad_practice;

/**
 * Pytanie: Dlaczego tworzenie zmiennych statycznych w Javie nie jest zawsze dobrą praktyką?
 * Odpowiedź:
 * Używanie zmiennych statycznych może prowadzić do niepożądanych efektów ubocznych,
 * zwłaszcza w aplikacjach wielowątkowych lub gdy stan powinien być izolowany między
 * instancjami klasy. Zmienne statyczne są współdzielone między wszystkimi instancjami
 * klasy, co oznacza, że zmiana wartości zmiennej statycznej w jednej instancji wpłynie
 * na wszystkie inne instancje. To może prowadzić do trudnych do zdiagnozowania błędów
 * i problemów z bezpieczeństwem wrażliwych danych.
 */

class AppSettings {
    static String language = "English"; // Zmienna statyczna, która powinna być instancyjna

    public void displaySettings() {
        System.out.println("Aktualny język aplikacji: " + language);
    }

    public void changeLanguage(String newLanguage) {
        language = newLanguage; // Zmiana języka wpływa na wszystkie instancje klasy
    }
}

public class SettingsDemo {
    public static void main(String[] args) {
        AppSettings user1Settings = new AppSettings();
        AppSettings user2Settings = new AppSettings();

        user1Settings.changeLanguage("Polski");

        user1Settings.displaySettings(); // Wyświetli "Polski"
        user2Settings.displaySettings(); // Nieoczekiwanie również wyświetli "Polski"

        // Oczekiwano, że każda instancja klasy AppSettings będzie mogła mieć własny język
    }
}

/**
 * Ten kod demonstruje problem z użyciem zmiennej statycznej do przechowywania
 * ustawień językowych w klasie AppSettings. Zmiana języka przez jedną instancję
 * klasy wpływa na wszystkie inne instancje, co może być niepożądane w sytuacji,
 * gdy każdy użytkownik aplikacji powinien mieć możliwość niezależnej zmiany języka.
 * Pokazuje to, dlaczego w niektórych przypadkach lepiej jest unikać zmiennych statycznych
 * na rzecz zmiennych instancyjnych, aby zapewnić właściwą izolację stanu między
 * instancjami klasy.
 */
