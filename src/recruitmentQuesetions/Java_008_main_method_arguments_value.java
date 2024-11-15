package recruitmentQuesetions;

/**
 *
 *
 * Pytanie: Powiedzmy, że uruchamiamy klasę Java bez przekazywania jakichkolwiek
 * argumentów. Jaka będzie wartość tablicy Stringów argumentów w metodzie Main?
 * Odpowiedź:
 * Gdy uruchamiamy klasę Java bez przekazywania jakichkolwiek argumentów, tablica
 * Stringów argumentów w metodzie main() nie będzie null. Zamiast tego, będzie to
 * pusta tablica (String[] args), co oznacza, że jej długość wyniesie 0. Java
 * automatycznie inicjalizuje tablicę argumentów jako pustą tablicę, pozwalając
 * programowi bezpiecznie sprawdzić długość tablicy bez ryzyka wystąpienia
 * NullPointerException.
 */

public class Java_008_main_method_arguments_value {
    public static void main(String[] args) {
        // Sprawdzenie i wyświetlenie długości tablicy argumentów
        System.out.println("Liczba przekazanych argumentów: " + args.length);

        // Sprawdzenie, czy tablica argumentów jest pusta
        if (args.length == 0) {
            System.out.println("Nie przekazano żadnych argumentów.");
        }
    }
}


