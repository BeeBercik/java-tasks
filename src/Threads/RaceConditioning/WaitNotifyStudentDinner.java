package Threads.RaceConditioning;

// Dwa rozne watki tzn z roznych implementacji metody run() przez labde.
// Student sie uczy przez 2h (petla 2x sie wykonuje) az w koncu glodnieje i przerywa
// Rodzice go wolaja na obiad boten ma prerwe wtedy on je i wraca sie uczyc juz pojedzony

// Metody .wait() i .notify() wykonujemy na monitorze

class Home {
    Boolean time = false;

    public void learn() {
        synchronized (time) {
            try {
                for (int i = 0; i < 2; i++) {
                    System.out.println("Ucze sie..");
                    Thread.sleep(1000);
                }
                time.wait();

                System.out.println("Teraz sie bede uczyl pojedzony :)");
            } catch (InterruptedException e) {
                System.out.println("Blad przez .sleep()");
            }
        }
    }

    public void dinner() {
        synchronized (time) {
            System.out.println("Na obiad!");
            time.notify();
        }
    }
}

public class WaitNotifyStudentDinner {
    public static void main(String[] args) {
        Home home = new Home();

        Thread student = new Thread(() -> {
            home.learn();
        });

        Thread parent = new Thread(() -> {
            home.dinner();
        });

        student.start();
        parent.start();
    }
}



