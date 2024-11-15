package Threads.exercises.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class System_r implements Runnable {
    String name;

    public System_r(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " probuje");
        LockApp.lock.lock();
        System.out.println(this.name + " rezerwuje..");
        if(LockApp.miejsca > 0) {
            LockApp.miejsca--;
        }
        System.out.println(this.name + "konczy");
        System.out.println("Liczba miejsc: " + LockApp.miejsca);
        LockApp.lock.unlock();
    }
}

public class LockApp {
    static int miejsca = 5;
    static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new System_r("Thread " + i)).start();
        }
    }
}
