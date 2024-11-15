package org.example.Java_069;


/**
 * Pytanie: Co to jest wątek w Javie?
 * Odpowiedź:
 * Wątek w Javie jest najmniejszą jednostką przetwarzania, która może być wykonana
 * równolegle z innymi wątkami w ramach tego samego procesu, aplikacji. Umożliwiają one
 * wykonanie wielu zadań jednocześnie w ramach jednego programu, poprawiając
 * wydajność i efektywność aplikacji. Język Java umożliwia tworzenie wątków poprzez
 * implementację interfejsu Runnable lub rozszerzenie klasy Thread. Użycie wątków
 * pozwala na lepsze zarządzanie zasobami i umożliwia realizację zadań niezależnie
 * lub w tle aplikacji, bez zakłócania głównego przepływu programu.
 */

class TaskRunner implements Runnable {
    // Definicja metody run(), która zawiera logikę wykonywaną przez wątek
    @Override
    public void run() {
        // Symulacja długotrwałego zadania
        for (int i = 0; i < 5; i++) {
            System.out.println("Wykonywanie zadania w wątku: " + i);

            // Symulacja opóźnienia
            try {
                Thread.sleep(1000); // Opóźnienie o 1 sekundę
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Tworzenie instancji klasy TaskRunner, która implementuje interfejs Runnable
        TaskRunner taskRunner = new TaskRunner();

        // Tworzenie wątku z zadaniem do wykonania
        Thread thread = new Thread(taskRunner);

        // Uruchomienie wątku
        thread.start();

        // Wyświetlenie komunikatu w głównym wątku
        System.out.println("Wątek główny kontynuuje swoje wykonanie.");
    }
}

/**
 * W tym kodzie definiujemy klasę TaskRunner, która implementuje interfejs Runnable,
 * zawierającą metodę run(). Metoda ta symuluje wykonanie długotrwałego zadania.
 * Następnie w klasie Java_010_what_is_a_thread_in_java tworzymy instancję klasy TaskRunner,
 * owijamy ją w obiekt Thread i uruchamiamy wątek za pomocą metody start(). Dzięki temu
 * zadanie zdefiniowane w metodzie run() klasy TaskRunner wykonuje się równolegle do głównego
 * wątku programu, demonstrując podstawowe użycie wątków w Javie.
 */
