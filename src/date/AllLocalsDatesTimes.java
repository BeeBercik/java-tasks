package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AllLocalsDatesTimes {
    public static void main(String[] args)  {
        LocalTime ltime = LocalTime.now();
        ltime = ltime.plusHours(1);
        ltime = ltime.minusMinutes(30);
        System.out.println(ltime);
        System.out.println(ltime.getHour());

        LocalDate ldate = LocalDate.now();
        ldate = ldate.plusYears(10);
        System.out.println(ldate);
        System.out.println(ldate.getYear());

        LocalDateTime ldt = LocalDateTime.now();
        ldt = ldt.plusHours(1);
        ldt = ldt.minusYears(50);
        System.out.println(ldt);
        System.out.println(ldt.getYear());
    }
}
