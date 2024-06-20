package Threads;

// Interfejs Runnable jest to interfejs funkcyjnt tzn. ma jedna abstr. metoda, ktora musimy zaimplementowac implementujac ten interfejs. Dlatego poniewaz konstr. Thread przyjmuje instancje klasy implementujacej interfejs Runnable (jest ona wymagana - bo jest podstawka dal stworzenia watku). Zamiast wiec tworzenia osobnej klasy nadpisujacej metode run() (bo jest abstr.) mozemy zastosowac wyrazenie lambda - kompiltor sam rozpozna ze skoro przekazany ma byc obj z interf. funkcyjnym Runnable to wyrazenie lambda (de facto funkcja) odwoluje sie do wymaganej do zaimplementowania metody run().

public class LambdaThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        thread.start();
        thread.join(); // poczekaj z watkie MAIN az skonczy sie watek thread

//        LUB mozna przypisac do zmiennej i wstawiac do watkow
        Runnable runnable = () -> {
            System.out.println("Dziala");
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
