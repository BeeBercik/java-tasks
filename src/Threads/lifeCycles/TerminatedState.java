package Threads.lifeCycles;

// TERMINATED - watek wykonal sie/zakonczyl

class TerminatedThread extends Thread {
    @Override
    public void run() {
        System.out.println("Program wykonuje sie.");
    }
}

public class TerminatedState {
    public static void main(String[] args) throws InterruptedException {
        TerminatedThread thread = new TerminatedThread();
        thread.start();

        Thread.sleep(1000); // odczekanie na skonczenie sie watku
        System.out.println(thread.getState()); // TERMINATED
    }
}
