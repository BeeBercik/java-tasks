package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_TimeStamp {
    public static void main(String[] args) {
        Date data = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss | dd-MM-yyyy");
        String formattedCurrentData = dateFormat.format(data);
        System.out.println(formattedCurrentData);

        System.out.printf("Printf: %1$tY-%1$tm-%1td %n", data);
        System.out.printf("Osobny printf: %tY-%tm %n", data, data);

        long seconds = data.getTime();
        seconds += 1000*60*60;
        Date newDate = new Date(seconds);
        String formattedFutureData = dateFormat.format(newDate);
        System.out.println(formattedFutureData);

    }
}
