package Threads;

// Watki mozna tworzyc rowniez implementujac interfejs Runnable. Lepiej w ten sposob, bo dziedziczyc/rozszerzac mozna jedna klase a implementowac mozna wiele interfejsow (Oprocz runnable). NIE posiada metod z klasy Thread jak np. getName(), .sleep()

// Tworzy sie w ten sposob klase, ktora jest swego rodzaju podstawka pod stworzenie watku - wymaga sie tak samo implementacje metody run(). Obiekt tejze klasy jest przekazywany do obiektu Thread - w ten sposob powstaje watek na bazie naszej klasy/jej instancji. Na stworoznym nowo watku ruchamia sie go i wykonuje sie metoda run() naszej klasy runnable.

// Mozna proces zautomatyzowac aby nie tworzyc najpierw instancji Runnable, pozniej watku przekazywania do konstr itd w glownej metodzie. Zamiast tego w naszej klasie Runnable mozemy stworzyc wlasciwosc - watek. Jesli nie bedzie stworzoy watek to zrobiona przez nas metoda start() na klasie Runnable bedzie tworzyla nowy watek i go uruchamiala

// Thread.sleep() usypia biezacy watek, czyli uzyta w jakies metodzie uruchomionej przez dany watek wlasnie jego zatrzymuje. Gdy sleep'a damy w mainie to bedzie zatrzymany glowny watek MAIN zanim np. wypisze cos

class RunnableExample implements Runnable {
    int sleepTime;
    String threadName;

    public RunnableExample(int sleepTime, String threadName) {
        this.sleepTime = sleepTime;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.threadName + ": " + i);

            try {
//                Tym razem odwolanie do metody statycznej klasy therad .sleep(), bo z niej nie dziedziczymy
                Thread.sleep(this.sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class RunnableCreateThread extends RunnableExample implements Runnable {
    private Thread thread;

    public RunnableCreateThread(int sleepTime, String threadName) {
        super(sleepTime, threadName); // tworzac instancje dalej przkazujemy czas i nazwe
    }

//    Nasza wlasna metoda start() na instancji klasy Runnable
    public void start() {
        if(this.thread == null) // jesli do wlasciwosci nie ma przypisanego watku to go stworz i przypisz
            this.thread = new Thread(this, this.threadName);

        this.thread.start();
    }
}

public class RunnableBasic {
    public static void main(String[] args) {
        RunnableExample runObj = new RunnableExample(1000, "thread1"); // obj 'podstawka' pod watek
//        przekazujemy baze pod stworz. watku i jego NAZWE, ktora jest dostepna na obj klasy Thread - nie na naszej runnable (tam musimy stworzyc wlasciwosc, konstr itd aby uzyc jej w metodach klasy runnable)
        Thread thread1 = new Thread(runObj, "thread1");
        thread1.start();
        System.out.println(thread1.getName()); // getName() dostepna z klasy Thread

//        Stworzenie watku metoda w klasie runnable
            RunnableCreateThread rct = new RunnableCreateThread(500, "thread2");
            rct.start(); // nasza metoda start w Runnable
    }
}
