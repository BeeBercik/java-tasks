package date;

import java.time.LocalTime;

public class LocalTimeEx {
    public static void main(String[] args) {
        LocalTime ltime = LocalTime.now();
        System.out.println("Obecny czas: " + ltime);
        System.out.println("Godzina: " + ltime.getHour());
        System.out.println("Minuta: " + ltime.getMinute());

        ltime = ltime.plusHours(2);
        ltime = ltime.minusMinutes(10);
        System.out.printf("%nCzas po zmianie: %n");
        System.out.println("Godzina: " + ltime.getHour());
        System.out.println("Minuta: " + ltime.getMinute());
    }
}
