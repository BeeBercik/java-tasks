package org.example.Java_068;


/**
 *
 * Pytanie: Jakie są zalety wielowątkowości?
 * Odpowiedź:
 * Wielowątkowość w Javie pozwala na jednoczesne wykonywanie wielu operacji w
 * obrębie tego samego programu, co przekłada się na lepsze wykorzystanie zasobów
 * procesora i skrócenie czasu odpowiedzi aplikacji. Pozwala to na asynchroniczne
 * przetwarzanie zadań, które nie są od siebie zależne, co może znacząco
 * zwiększyć wydajność aplikacji. Wielowątkowość jest również kluczowa w
 * aplikacjach wymagających jednoczesnej obsługi wielu żądań użytkowników lub
 * zadań (np. serwery, aplikacje GUI). Umożliwia lepsze zarządzanie czasem
 * procesora poprzez równoległe wykonywanie zadań.
 */

class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName; // Inicjalizacja nazwy zadania
    }

    @Override
    public void run() {
        // Symulacja wykonania zadania
        System.out.println("Wykonanie zadania: " + taskName);
        try {
            Thread.sleep(1000); // Symulacja czasochłonnej operacji
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Przerwanie wątku w przypadku wyjątku
        }
        System.out.println("Zakończenie zadania: " + taskName);
    }
}

public class Main {
    public static void main(String[] args) {
        // Tworzenie nowych zadań do wykonania
        Task task1 = new Task("Zadanie 1");
        Task task2 = new Task("Zadanie 2");

        // Tworzenie nowych wątków z zadanymi zadaniami
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Uruchomienie wątków
        thread1.start(); // Uruchomienie wątku dla zadania 1
        thread2.start(); // Uruchomienie wątku dla zadania 2

        try {
            thread1.join(); // Oczekiwanie na zakończenie wątku 1
            thread2.join(); // Oczekiwanie na zakończenie wątku 2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Wszystkie zadania zostały zakończone.");
    }
}

/**
 * W tym kodzie definiujemy klasę Task, która implementuje interfejs Runnable,
 * co pozwala jej zadaniom być wykonywanym przez wątki. Dla każdego zadania
 * tworzony jest nowy wątek, co pozwala na ich jednoczesne wykonywanie. Dzięki
 * temu możemy obserwować, jak wielowątkowość pozwala na równoległe przetwarzanie
 * zadań, co jest jedną z jej kluczowych zalet. Symulacja czasochłonnej operacji
 * za pomocą Thread.sleep(1000) pokazuje, jak różne wątki mogą pracować niezależnie,
 * nie blokując się nawzajem.
 */
