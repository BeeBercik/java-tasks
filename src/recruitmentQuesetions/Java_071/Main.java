package org.example.Java_071;
/**
 * Pytanie: Czy możemy uruchomić wątek dwa razy w Javie?
 * Odpowiedź:
 * W Javie nie można uruchomić wątku więcej niż jeden raz. Próba ponownego
 * uruchomienia wątku, który już zakończył działanie lub jest w trakcie działania,
 * spowoduje wyjątek java.lang.IllegalThreadStateException. Każdy wątek może być
 * uruchomiony tylko raz. Po zakończeniu pracy wątku, nie można go ponownie uruchomić.
 * Jeśli istnieje potrzeba wykonania tego samego zadania ponownie, należy utworzyć
 * nowy egzemplarz wątku i uruchomić go.
 */

class SingleUsePrinter implements Runnable {
    // Metoda run() zawiera logikę, którą wątek ma wykonać
    @Override
    public void run() {
        System.out.println("Drukowanie dokumentu...");
    }

    public static void main(String[] args) {
        // Tworzenie instancji klasy SingleUsePrinter
        SingleUsePrinter printer = new SingleUsePrinter();

        // Tworzenie wątku
        Thread thread = new Thread(printer);

        // Pierwsze uruchomienie wątku
        thread.start();

        // Czekamy aż wątek zakończy działanie
        try {
            thread.join(); // Oczekiwanie na zakończenie wątku
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Próba ponownego uruchomienia wątku
        try {
            thread.start(); // Spowoduje wyjątek IllegalThreadStateException
        } catch (IllegalThreadStateException e) {
            System.out.println("Nie można uruchomić wątku ponownie: " + e.getMessage());
        }
    }
}

/**
 * W tym kodzie definiujemy klasę SingleUsePrinter implementującą interfejs Runnable,
 * z metodą run(), która symuluje drukowanie dokumentu. W metodzie main() tworzymy instancję
 * tej klasy i przekazujemy ją do konstruktora Thread, aby utworzyć nowy wątek. Po pierwszym
 * uruchomieniu i zakończeniu pracy wątku, próbujemy uruchomić ten sam wątek ponownie, co
 * prowadzi do wyjątku IllegalThreadStateException, demonstrując, że w Javie wątek nie może
 * być uruchomiony więcej niż jeden raz.
 */
