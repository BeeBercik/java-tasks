package Threads.exercises.waitNotify;

class Delivery extends Thread {
    @Override
    public void run() {
        synchronized (WNApp.pizza) {
            try {
                System.out.println("Probuje odebrac pizze");
                if (!Cook.ready_pizza) WNApp.pizza.wait();
                System.out.println("Odbieram i dostarczam pizze! :)");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Cook extends Thread {
    static boolean ready_pizza = false;

    @Override
    public void run() {
        synchronized (WNApp.pizza) {
            try {
                System.out.println("Cooking");
                Thread.sleep(500);
                System.out.println("Pizza ready");
                Cook.ready_pizza = true;
                WNApp.pizza.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class WNApp {
    static Object pizza = new Object();

    public static void main(String[] args) {
        Cook cook = new Cook();
        Delivery delivery = new Delivery();

        cook.start();
        delivery.start();
    }
}