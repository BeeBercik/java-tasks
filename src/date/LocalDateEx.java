package date;

import java.time.LocalDate;

public class LocalDateEx {
    public static void main(String[] args) {
        LocalDate ldate = LocalDate.now();
        System.out.println("Obecna data: " + ldate);
        System.out.println("Obecny rok: " + ldate.getYear());
        System.out.println("Obecny miesiac: " + ldate.getMonthValue());
        System.out.println("Obecny dzien: " + ldate.getDayOfMonth());

        ldate = ldate.plusYears(10);
        ldate = ldate.minusMonths(2);
        System.out.printf("%nData po zmianach: %n");
        System.out.println("Obecny rok: " + ldate.getYear());
        System.out.println("Obecny miesiac: " + ldate.getMonthValue());
    }
}
