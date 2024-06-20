package Threads;

// Watki umozliwiaja rownoczesne/wspolbiezne wykonywanie kawalkow programu. Normalnie program wykonuje sie liniowo, jednak dzieki watka kawalki kodu moga wykonywac sie rownolegle

// Aby stworzyc klase reprezentujaca wyjatke musimy rozszerzyc klase Thread, stad mamy do dyspozycji metody takie jak .getName() - pobiera ustawiona przez nas nazwe watku. Trzeba rowniez przeslonic metode run(), ktora po uruchomieniu watku (de facto obiektu klasy reprez. watek) sie wykona.

// Thread.sleep() to metoda statyczna!

class NewThread extends Thread {
    int sleepTime;

    public NewThread(String name, int sleepTime) {
        super(name); // przypisuje nazwe watku (nie do wlasciwosci klasy)
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + ": " + i);
            try {
//                Dodaje 1000milisec przerwe - .sleep() moze rzucic wyjatkie stad try-catch
                Thread.sleep(this.sleepTime);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadBasic {
    public static void main(String[] args) {
        NewThread thread1 = new NewThread("thread1", 1000);
        thread1.start(); // na obieckie .start() uruchamia watek
        System.out.println(thread1.getName()); // wyswietla nazwe watku

        NewThread thread2 = new NewThread("thread2", 600); // szybciej wykona sie ten watek
        thread2.start(); // wypisywanie przeplata sie - operacje(metody) wykonuja sie jednoczesnie

    }
}
