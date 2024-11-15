package Threads.exercises.semaphoreBinary;

import java.util.concurrent.Semaphore;

// Semafor binarny (z dost. dla 1 watku) dziala podobnie jak Lock - przed wykonaniem operacji na tym samym zasobie (lub tak jak bez zasobu - po prostu nie moga w tej samej chwili) opuszcza sie zaslone .acquire() a po operacji sie ja podnosi .release()

class Klient extends Thread {
    private int id;

    public Klient(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.id + " sprobuje podejsc do kasy");
            SemaphoreApp.semaphore.acquire();
            System.out.println(this.id + " korzysta z kasy");
            Thread.sleep(500);
            SemaphoreApp.semaphore.release();
            System.out.println(this.id + " odchodzi od kasy");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class SemaphoreApp {
    static Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            new Klient(i).start();
        }
    }
}
