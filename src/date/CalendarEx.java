package date;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar kalendarz = Calendar.getInstance();
        kalendarz.setTime(date);
        // wyswietlenie bierzacego kalendarza
        Date cal = kalendarz.getTime();
        System.out.println(cal);

        kalendarz.add(Calendar.YEAR, 10);
        kalendarz.add(Calendar.DAY_OF_WEEK, 3);
        kalendarz.add(Calendar.HOUR, 10);
        kalendarz.add(Calendar.MINUTE, 25);
        kalendarz.add(Calendar.SECOND, 6);

        Date newDate = kalendarz.getTime();
        System.out.println(newDate.toString());
    }
}
