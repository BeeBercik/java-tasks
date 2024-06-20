package MyTasks.ograniczaniePrzedzialu;

import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 101);
        System.out.println("Liczba do zgadniecia: " + x);
        int top = 100;
        int down = 0;

        while(true) {
            int y = random.nextInt(top - down + 1) + down;
            System.out.println("Probuje liczbe " + y);

            if(x == y) {
                System.out.println("Znaleziono!");
                break;
            } else if(y > x) {
                System.out.println("Za duzo..");
                top = y - 1;
            } else {
                System.out.println("Za malo..");
                down = y + 1;
            }
        }
    }
}
