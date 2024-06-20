package Threads.lifeCycles;

// Aby sprawdzic status watku, nalezy na nim wykonac metode .getState()

public class NewState {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });

//        thread.start(); // przed uruchomieniem status NEW
        System.out.println(thread.getState()); // NEW
    }
}
