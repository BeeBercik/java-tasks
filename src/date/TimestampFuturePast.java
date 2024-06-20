package date;

import java.util.Date;

public class TimestampFuturePast {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        long timestamp = date.getTime(); // ilosc milisekund od 1970r
        long hour = 60*1000*60; // godzina w milisekundach
        timestamp += hour;
        Date newDate = new Date(timestamp);
        System.out.println(newDate.toString());
    }
}
