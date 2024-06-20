package org.example.questions1;

/**
 * 002_what_is_jdk.java
 *
 * Pytanie: Co to jest JDK w Javie?
 * Odpowiedź:
 * JDK, czyli Java Development Kit, to pełny zestaw narzędzi dla programistów
 * Java, umożliwiający rozwój oprogramowania w języku Java. Zawiera JRE (Java Runtime
 * Environment), kompilator javac, narzędzia do pakowania i podpisania aplikacji Java,
 * narzędzie do generowania dokumentacji javadoc oraz inne narzędzia niezbędne do
 * tworzenia i debugowania aplikacji Java. JDK jest fundamentem, na którym budowane są
 * aplikacje Java, od prostych programów po zaawansowane systemy korporacyjne.
 */

public class Java_002_what_is_jdk {
    public static void main(String[] args) {
        // Wyświetlenie wersji JDK, z której korzystamy
        System.out.println("Aktualna wersja JDK: " + System.getProperty("java.version"));

        // Informacja o ścieżce instalacji JDK
        System.out.println("Ścieżka instalacji JDK: " + System.getProperty("java.home"));
    }
}
