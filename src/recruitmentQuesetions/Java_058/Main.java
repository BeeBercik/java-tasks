package org.example.Java_058;


/**
 * Pytanie: Jaki jest cel klasy Runtime w Javie?
 * Odpowiedź: Klasa Runtime dostarcza interfejs do środowiska wykonawczego
 * aplikacji, umożliwiając między innymi uruchamianie procesów zewnętrznych,
 * zbieranie informacji o zużyciu pamięci oraz zarządzanie procesem aplikacji.
 * Dzięki niej, programiści mogą komunikować się z otoczeniem, w którym działa ich
 * aplikacja.
 */

class EnvironmentManager {
    public static void main(String[] args) {
        // Uzyskanie instancji Runtime
        Runtime runtime = Runtime.getRuntime();

        try {
            // Uruchomienie zewnętrznego procesu (np. notatnika)
            Process process = runtime.exec("notepad.exe");
            System.out.println("Notatnik został uruchomiony.");
        } catch (Exception e) {
            System.out.println("Wystąpił błąd podczas uruchamiania notatnika: " + e.getMessage());
        }

        // Wyświetlenie informacji o pamięci
        long totalMemory = runtime.totalMemory(); // Całkowita pamięć dostępna dla JVM
        long freeMemory = runtime.freeMemory(); // Pamięć wolna w JVM
        System.out.println("Całkowita pamięć: " + totalMemory);
        System.out.println("Wolna pamięć: " + freeMemory);
    }
}

/**
 * W tym kodzie, klasa EnvironmentManager demonstruje użycie klasy Runtime do
 * uruchomienia zewnętrznego procesu (notatnika) oraz do uzyskania informacji o
 * pamięci dostępnej dla maszyny wirtualnej Javy (JVM). Jest to przykład, jak
 * programiści mogą wykorzystać klasę Runtime do interakcji z otoczeniem
 * wykonawczym aplikacji.
 */
