package org.example.questions1;

/**
 * Java_004_what_is_main_method.java
 *
 * Pytanie: Co to jest metoda main w Javie?
 * Odpowiedź:
 * Metoda main() w Javie jest punktem startowym każdej aplikacji Java. Jest to
 * metoda, którą wykonuje JVM (Java Virtual Machine) jako pierwszą po uruchomieniu
 * programu. Metoda main musi być publiczna, statyczna, zwracać void i przyjmować
 * tablicę Stringów jako argument (String[] args), co pozwala na przekazywanie
 * argumentów z linii poleceń do aplikacji. Struktura metody main jest kluczowa
 * dla uruchomienia dowolnego programu Java.
 */

public class Java_005_what_is_main_method {
    // Definicja metody main
    public static void main(String[] args) {
        // Wyświetlenie wiadomości powitalnej
        System.out.println("Witaj w programie Java!");

        // Demonstracja otrzymania argumentów z linii poleceń
        if (args.length > 0) {
            System.out.println("Otrzymane argumenty z linii poleceń:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("Brak argumentów z linii poleceń.");
        }
    }
}


