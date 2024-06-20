package date;

import java.util.Date;

public class PrintfString {
    public static void main(String[] args) {
        // wyswietlanie daty za pomoca printf
        Date date = new Date();
        System.out.printf("%1$tY %1$tm %1$td", new Date()); // %1 bo odwolujemy sie do 1szego argumentu wiele razy
        // data jako tekst
        String dateTxt = String.format("%n%1$td %1$tm %1$tY" , new Date());
        System.out.println(dateTxt);
    }
}
