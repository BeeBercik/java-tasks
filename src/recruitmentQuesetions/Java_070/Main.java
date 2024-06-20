package org.example.Java_070;


/**
 *
 * Pytanie: Co to jest priorytet wątku i jak jest wykorzystywany w planowaniu?
 * Odpowiedź:
 * Priorytet wątku w Javie jest parametrem, który pomaga planiście wątków (scheduler)
 * decydować, który wątek powinien zostać wykonany jako następny. Wątki w Javie mają
 * priorytety w zakresie od MIN_PRIORITY (1) do MAX_PRIORITY (10), z domyślnym priorytetem
 * NORM_PRIORITY (5). Wątki o wyższym priorytecie mają większą szansę na wykonanie
 * przed wątkami o niższym priorytecie. Jednakże, dokładne zachowanie planowania
 * może zależeć od implementacji Javy oraz od systemu operacyjnego. Priorytet wątku
 * nie gwarantuje, że wątek o wyższym priorytecie zawsze będzie wykonywany przed
 * wątkami o niższym priorytecie, ale wpływa na szansę jego wyboru przez scheduler.
 */

class Task implements Runnable {
    private String taskName;
    private int taskPriority;

    // Konstruktor do inicjalizacji nazwy zadania i priorytetu
    public Task(String taskName, int taskPriority) {
        this.taskName = taskName;
        this.taskPriority = taskPriority;
    }

    @Override
    public void run() {
        // Symulacja wykonania zadania
        System.out.println(taskName + " rozpoczyna działanie.");
        try {
            Thread.sleep(1000); // Opóźnienie symulujące wykonanie
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " kończy działanie.");
    }

    public static void main(String[] args) {
        // Tworzenie zadań z różnymi priorytetami
        Task task1 = new Task("Zadanie o niskim priorytecie", Thread.MIN_PRIORITY);
        Task task2 = new Task("Zadanie o normalnym priorytecie", Thread.NORM_PRIORITY);
        Task task3 = new Task("Zadanie o wysokim priorytecie", Thread.MAX_PRIORITY);

        // Tworzenie i uruchamianie wątków z zadaniem
        Thread t1 = new Thread(task1);
        t1.setPriority(task1.taskPriority); // Ustawienie priorytetu wątku
        Thread t2 = new Thread(task2);
        t2.setPriority(task2.taskPriority);
        Thread t3 = new Thread(task3);
        t3.setPriority(task3.taskPriority);

        // Startowanie wątków
        t3.start(); // Start wątku o wysokim priorytecie
        t2.start(); // Start wątku o normalnym priorytecie
        t1.start(); // Start wątku o niskim priorytecie
    }
}

/**
 * W tym kodzie definiujemy klasę Task, która implementuje interfejs Runnable. Każde zadanie
 * ma swoją nazwę i priorytet. W metodzie main() tworzymy trzy zadania z różnymi priorytetami
 * i uruchamiamy je w oddzielnych wątkach. Ustawiamy priorytet każdego wątku przy pomocy
 * metody setPriority(). Scheduler Javy wykorzystuje te priorytety do decydowania, który wątek
 * powinien zostać wykonany jako następny, co demonstruje wpływ priorytetu wątku na planowanie.
 */

