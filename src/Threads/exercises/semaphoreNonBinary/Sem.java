package Threads.exercises.semaphoreNonBinary;

import java.util.concurrent.Semaphore;

// 3 auta (watki) jednoczesnie cos robia (parkuja)

class Car implements Runnable {
    private int id;

    public Car(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.id + " podjezdza pod parking.");
            Sem.semaphore.acquire();
            System.out.println(this.id + " parkuje..");
            Thread.sleep(1000);
            System.out.println(this.id + " odjezdza.");
            Sem.semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class Sem {
    static public Semaphore semaphore = new Semaphore(3);

    public static void main(String[] args) {
        for(int i = 0;i < 5; i++) {
            new Thread(new Car(i)).start();
        }
    }
}
