package Threads.lifeCycles;

public class RunnableState {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
//                System.out.println(i);
            }
        });

        thread.start();
        System.out.println(thread.getState()); // RUNNABLE
    }
}
