package Threads.lifeCycles;

// Stan blocekd pojawia sie wtedy, gdy watek nie ma dostepu do danej metody, gdyz jest juz ona wykoynwana przez inny watek.

// Slowo kluczowe synchronized w metodzie oznacza, ze tylko jeden watek moze w danym czasie pracowac nad kodem w tej metodie, uruchomiac ja. NIE NADAJE STATUSOWI 2 WATKU "BLOCKED"! - ten po prostu pracuje(czeka) na zasob majas stan RUNABBLE. Aby calkowicie zablokowac dzialanie watku korzysta sie z bloky synchronized [PONIZEJ]

/// Blok synchronized ogranicza kod wewnatrz do wykonywania przez jeden watek. Przyjmuje 1 parametr - statyczny, finalny zwykly obiekt. Gdy jakis watke pracuje nad dana metoda i przeszedl przez blok synchronized tzn ze obiekt jest 'w uzyciu' i nie ma do niego dostepu. Troche pokrecone xd

class SomeThread implements Runnable {
    private synchronized void test() {
        while(true) {
//            nieskonczona petla
        }
    }

    @Override
    public void run() {
        this.test();
    }
}

class BlokingThread implements Runnable {
    private static final Object lock = new Object(); // obiekt lock to mechanizm blokujacy - jest on globalny, wiec zaden watek nie bedzie mial dostepu do tej metody gdy bedzie juz zajeta - NAWET INNEGO OBIEKTU!!

    public void test() {
//        synchronized - blok ograniczajacy dostep do 1 watku - uzywac obj. lock
//        dziala to w ten spososb, ze obiekt wchodzi do metody test, nastepie probuje wejsc w blok synchronized i jezeli inny watek wczesniej nie wszedl do tej metody i "nie pracuje" na tym obiektem 'lock', tzn ze jest on nieuzywany i watek moze wejsc do bloku synchronized
//        synchronized (lock) { // lock to obiekt, na którym odbywa się synchronizacja - static wiec globalny
          synchronized (this) { // wszystkie/oba watki stworzone na tej samej instancji klasy Runnable beda mialy ograniczony dostep do tej metody
            while (true) {
//            nieskonczona petla
            }
        }
    }

    public void run() {
        this.test();
    }
}

public class BlockedState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new SomeThread());
//        lub dluzszy sposob bez przypisania
        SomeThread basicForThread = new SomeThread();
        Thread thread2 = new Thread(basicForThread);

        thread1.start();
        thread2.start();

        System.out.println("-Stan od razu po uruchomieniu-");
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());

        Thread.sleep(2000);
        System.out.println("-Stan po 0.1s-");
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
//        TUTAJ WYJATKOWO: bedzie stan RUNNABLE przy obu, gdyz 2 wyjatek "chodzi" i czeka az sie z wolni zasob (watek1 skonczy wykonywac metode)


//        PRZYKLAD Z BLOCKED
//        Dzieki bazowaniu obu watkow na jednym obiekcie/jednej instancji i zastosowaniu THIS w bloku synchronized tylko jeden z tych watkow bedzie mogl na raz miec dostep
        BlokingThread bt = new BlokingThread();
        Thread thread3 = new Thread(bt);
        Thread thread4 = new Thread(bt);
//
//        Thread thread3 = new Thread(new BlokingThread());
//        Thread thread4 = new Thread(new BlokingThread());

        thread3.start();
        thread4.start();
        System.out.println("PRZYKLAD Z BLOCKED\n-Stan po uruchomieniu-");
        System.out.println(thread3.getState());
        System.out.println(thread4.getState());

        System.out.println("PRZYKLAD Z BLOCKED\n-Stan po 2s-");
        Thread.sleep(2000);
        System.out.println(thread3.getState());
        System.out.println(thread4.getState());
    }
}
