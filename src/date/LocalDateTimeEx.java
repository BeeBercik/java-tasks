package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Obecny czas i data: " + ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        // majac obiekt z formatem daty i czasu wykonujemy na nim metode format
        // przekazujac obecna date i czas, przez co bedzie ona wyswietlona tak jak chcemy
        String formattedDateTime = dtf.format(ldt);
        System.out.println("Sformatowana data i czas: " + formattedDateTime);

        // tak samo istnieja metody czasu i daty
        System.out.println("Pobrany rok: " + ldt.getYear());
        System.out.println("Pobrana godzina: " + ldt.getHour());

        // monza modyfikowac czas i date
        System.out.printf("%nZmeniony czas i data: %n");
        ldt = ldt.plusHours(2);
        ldt = ldt.minusYears(10);
        System.out.println("rok: " + ldt.getYear());
        System.out.println("godzina: " + ldt.getHour());

        // teraz glowny obiekt zawiera zmodyfikowana date i czas
        System.out.println("Obecny czas i data: " + ldt);
    }
}
