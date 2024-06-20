package date;

import java.util.Date;

public class ProgramTime {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try {
            for(int i = 0; i < 10; i++) {
                System.out.println(new Date().getTime());
                Thread.sleep(10);
            }
        } catch(InterruptedException exception) {
            exception.printStackTrace();
        }

        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Tyle milisekund: " + time);
    }
}
