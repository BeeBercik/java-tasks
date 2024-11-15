package Threads.RaceConditioning;

// Przyklad gdzie sa 2 watki z ronych podstawek Runnable i uruchamiaja metode w innej klasie z synchronzied, czyli monitorem ustawionym na obiekt tejze klasy. Dlatego gdy 1 watek (chocby inny) dobierze sie do metody to nawet calkiem inny nie ma do niej dostapu dopoki tamten nie zwolni monitora obiektu

class Some {
    public synchronized void sayHi() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }

    public synchronized void sayBye() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "BYE");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

public class DifferentRunnableRace {
    public static void main(String[] args) throws InterruptedException {
        Some some = new Some();

        Runnable runnable = () -> {
            some.sayHi();
        };
        Thread thread1 = new Thread(runnable, "thread1");
        thread1.start();

// WATEK NA PODSTAWIE INNEJ IMPLEMENTACJI KLASY RUNNABLE
        class MyRunnable implements  Runnable {
            @Override
            public void run() {
//                some.sayHi();
                some.sayBye(); // tez sie nie wykona ob mointor zajety przez thread1
            }
        }

        Thread thread2 = new Thread(new MyRunnable(), "thread2");
        thread2.start();

    }
}



