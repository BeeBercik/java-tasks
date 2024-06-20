package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserGivenDate {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj date [dzien-msc-rok]");
        String userDate = s.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date formattedDate = dateFormat.parse(userDate);
        System.out.println(formattedDate);


//        LUB NA SZTYWNO
        String date = "2023-05-17";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date gitDate = df.parse(date);
        System.out.println(gitDate);
    }
}
