package Threads.RaceConditioning;

// Race condition - wyscig watkow. PRzyklad z inkrementacja. Watki therad1 i thread2 wykonuja sie naprzemiennie a glowny MAIN czeka az sie wykonaja, aby wyswietlic ostatczeny/koncowy wynik inkrementacji.
// Poniewaz wartosc zmiennej najpierw jest pobierana a pozniej zwiekszana i przypisywana to gdy thread1 pobierze watosc 0 i ja zwiekszy, zwroci to moze sie okazac ze thread2 ponieqz wykona sie MINIMALNIE POZNIEJ pobierze dalej wartosc 0 i ja zwiekszy. Dlatego wartosc to bedzie 1 a nie 2. W ten sposob powstaja losowe wyniki w zaleznosci od czasu wykonywania sie watkow

// Rozwiazaniem jest slowo klucz "synchronized"  ograniczajace metode do wykonania dla jednego watku w danym momencie. Jak sa uruchomione oba, to najpierw ta metode wykona therad1 a dopiero pozniej thread2, stad prawidlowy wynik.

// Synchronized torche opoznia wykonanie programy (logiczne - jeden watek czeka az poprzedni sie wykona) i przypisane do metody  ustawia monitor dostepu na obiekt tej klasy, czyli maja 2 watki utoworzne a bazie tej samej podstawki Runnable to wlasnie monitor jest ustawiany na obiekt tej podstawki, a poniewaz obiekty te bazują na niej to tylko jeden z nich jednoczesnie ma dostep do metody.

// mtoda synchronzied lub z blokiem synchroized moze byc takze w innej klasie iwtedy ustawia ona monitor na obiekcie tejze klasy. Kazdy watek ktory bedzie operowal a tej zmienej w innej klasie uzyska dostep do obiektu tej klasy i go sobie zarezerwuje tak ze inny watek dostanie do niego dostep gdy tamten skonczy dzialanie

class BaseForThread implements Runnable {
    RaceCondition race;

    public BaseForThread(RaceCondition race) {
        this.race = race;
    }

    public void run() {
        for (int i = 0; i < 200000; i++) {
            this.race.increment();
        }
    }
}

public class RaceCondition {
    int counter = 0;

    public synchronized void increment() {
        this.counter++;
    }
//      Dodajac slowo sunchronized ograniczamy dostep do metody dla jednego watku w jednym momencie
//    public synchronized void increment() {
//        this.counter++;
//    }

    public static void main(String[] args) throws InterruptedException {
        RaceCondition raceCondition = new RaceCondition();

        Thread thread1 = new Thread(new BaseForThread(raceCondition));
        Thread thread2 = new Thread(new BaseForThread(raceCondition));

        thread1.start(); // uruchamiamy aby oba naraz zaczely wykonywac metode ran a z niej inkrementacje
        thread2.start();
        thread2.join();
        thread1.join(); // aby wykonaly sie oba, pozniej MAIN wyoisze nasz sout();

//            Zly wynik bo watki dzialaja wspolbieznie i inkrementujac jeden watek pobiera i zwieksza inna wartosc zmiennej niz drugi
        System.out.println(raceCondition.counter); // bez synchronized LOSOWO - z synch. - 400000
    }
}
