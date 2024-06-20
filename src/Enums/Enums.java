package Enums;

// Wartosci enumeryczne w javie sa domyslnie statyczne

public class Enums {
    public enum Day {MONDAY, TUESDAY, WENSDAY};

    public static void main(String[] args) {
        Day someDay = Enums.Day.MONDAY;
        System.out.println(someDay);
    }
}
