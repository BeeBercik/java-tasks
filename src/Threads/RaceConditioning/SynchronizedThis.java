package Threads.RaceConditioning;

// threadziki to sa dwa rozne watki. Mimo ze tworzone na bazie tej samej klasy rozszerzajace Thread to sa to dwa rozne obiekty. Po stworzeniu ich, to sa dwie rozne implementacji metody run.

// Uzywajac Runnable watki sa tworzone z tej samej podstawki (klasy impl. Runnable) - dzialaja na jednej instancji obiektu klasy Runable, i w  takim wypadku maja wspolna metode run()

// WAZNE!!
// Gdy uzywamy slowa klucz 'synchronized' w metoodzie lub bloku synchronized(this) {} - ktore sa rownoznaczne i ustawiaja monitor na konkretny obiekt tej klasy - to zaden watek z roznych chocby podstawek Runnable nie moze wykonac ZADNEJ metody synchronizowanej na tym obiekcie, gdy juz jakis inny rozpoczal jedna metode zsynchronizowana. Czemu? Bo w ten sposob zarezerwowal monitor tego obiektu a inne metody sa wlasnie nim zabezpieczone!
// Tak samo dzial gdybysmy ustawili monitor na jakas zmienna a nei this np final String cos = "a";

class Podstawka implements Runnable {
    public void test() {
        synchronized (this) {
            while(true) {}
        }
    }

    public void run() {
        this.test();
    }
}

class Threadzik extends Thread {
    public void test() {
        synchronized (this) {
            while(true) {}
        }
    }

    public void run() {
        this.test();
    }
}

public class SynchronizedThis {
    public static void main(String[] args) throws InterruptedException {
        Threadzik threadzik1 = new Threadzik();
        Threadzik threadzik2 = new Threadzik();

        threadzik1.start();
        threadzik2.start();

        Thread.sleep(1000);
        System.out.println(threadzik1.getState());
        System.out.println(threadzik2.getState());

//        NA BAZIE TEGO SAMEGO OBIEKTU IMPLEM. RUNNABLE
        Podstawka podstawka = new Podstawka(); // watki stoworzone na bazie go sameog obiektu maja ta sama run()
        Thread thread4 = new Thread(podstawka);
        Thread thread5 = new Thread(podstawka);

        thread4.start();
        thread5.start();

        Thread.sleep(1000);
        System.out.println(thread4.getState());
        System.out.println(thread5.getState());
    }
}
