package Threads.lifeCycles;

// Usypiamy uruchomiony przez nas watek i w metodzie main w 'glownym' MAIN sprawdzamy jego status wtedy

class WaitingThread implements Runnable {

    private void test() {
        try {
            Thread.sleep(3000); // usypia biezacy watek (thread) - opreacje na chwile sie nie wykonuja
//            System.out.println(Thread.currentThread().getState()); // wykona sie dopiero po 3s, wiec nie pokaze w tym miejscu TIMED_WAITING
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        this.test();
    }
}

public class TimedWaitingState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new WaitingThread());
        thread.start();

        Thread.sleep(1000); // stopujemy watek glowny - czekamy 1s zanim wypiszemy stan, aby wszystko zaskoczylo
        System.out.println(thread.getState());

        Thread.sleep(3000);

    }
}
