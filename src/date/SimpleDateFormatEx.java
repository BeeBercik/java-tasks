package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {
    public static void main(String[] args) {
        Date date = new Date();
        // obiekt zawierajcy format daty jaki chcemy wyswietlic
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        // formatujemy i wyswietlamy
        System.out.println(dateFormat.format(date));
    }
}
