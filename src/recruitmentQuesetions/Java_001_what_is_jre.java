package org.example.questions1;

/**
 * Pytanie: Co to jest JRE w Javie?
 * Odpowiedź:
 * JRE, czyli Java Runtime Environment, to środowisko uruchomieniowe
 * niezbędne do wykonania aplikacji napisanej w języku Java. Składa się z JVM
 * (Java Virtual Machine), biblioteki klas Java oraz innych komponentów, które
 * wspomagają uruchamianie aplikacji Java. JRE jest częścią większego oprogramowania
 * JDK (Java Development Kit), ale jest skierowane głównie do użytkowników końcowych,
 * którzy potrzebują tylko uruchamiać aplikacje Java, a nie je tworzyć.
 */

public class Java_001_what_is_jre {
    public static void main(String[] args) {
        // Wyświetlenie wersji JRE, która jest obecnie używana
        System.out.println("Aktualna wersja JRE: " + System.getProperty("java.runtime.version"));

        // Informacja o dostawcy JRE
        System.out.println("Dostawca JRE: " + System.getProperty("java.vendor"));

        // Informacja o URL dostawcy JRE
        System.out.println("URL dostawcy JRE: " + System.getProperty("java.vendor.url"));
    }
}


