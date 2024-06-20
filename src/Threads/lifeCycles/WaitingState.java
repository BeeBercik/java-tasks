package Threads.lifeCycles;

// Nasza aplikacja zawsze uruchamiana jest przez glowny watek MAIN. MAIN uruchamia nasza metode main w kazdej klasie, o dczego zaczyna sie kompilacja naszczego programu.
// Domyslnie nasz glowny watek MAIN pracuje wspolbieznie do innych watkow ale mozemy to zmienic np. uzywajac metody .join() na jakims watku, ktora sprawia, ze glowny watek MAIN czeka na ZAKONCZENIE SIE watku, na ktorym uzyto tejze metody. Wtedy wlasnie MAIN ma status WAITING

class MyThread extends Thread {
    Thread mainThread;

    public MyThread(Thread mainThread) {
        this.mainThread = mainThread;
    }

    private void test() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("\nMAIN thread: " + this.mainThread.getState());
//                Tutaj zworci RUNNABLE, gdyz watek thread wykonuje ten kod, czyli dziala.
                System.out.println("My status inside test method - " + Thread.currentThread().getState());
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        this.test();
    }
}

public class WaitingState {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread(); // pobiera watke, ktory obecnie jest wykonywany (w tym wypadku jeto to glowny MAIN)

        MyThread thread = new MyThread(mainThread);
        thread.start(); // watek thread wykonuje kod w metodzie run()
        thread.join(); // moze rzucic wyjatek Interrupted, tak jak sleep()

        System.out.println("\nWykonuje MAIN thread"); // wykona sie po zakonczeniu watku thread
    }
}
