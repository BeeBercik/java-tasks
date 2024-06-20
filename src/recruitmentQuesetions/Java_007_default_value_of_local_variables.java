package recruitmentQuesetions;

/**
 *
 * Pytanie: W Javie, jeśli nie określimy wartości dla zmiennych lokalnych, to jaka
 * będzie domyślna wartość tych zmiennych lokalnych?
 * Odpowiedź:
 * W Javie, zmienne lokalne nie mają wartości domyślnej. Przed użyciem, zmienne lokalne
 * muszą być zainicjalizowane jawnie w kodzie. Próba użycia zmiennej lokalnej bez
 * inicjalizacji skutkuje błędem kompilacji, ponieważ kompilator Java nie jest w stanie
 * zagwarantować bezpiecznego użycia takiej zmiennej. To różni zmienne lokalne od
 * zmiennych instancyjnych klas, które mają domyślne wartości (np. null dla obiektów,
 * 0 dla typów liczbowych, false dla typu boolean).
 */

public class Java_007_default_value_of_local_variables {
    public static void main(String[] args) {
        int localVariable;

        // Próba wyświetlenia zmiennej lokalnej bez inicjalizacji skutkuje błędem
//         System.out.println("Wartość zmiennej lokalnej: " + localVariable);

        // Poprawne użycie zmiennej lokalnej wymaga jej wcześniejszej inicjalizacji
        localVariable = 10;
        System.out.println("Wartość zmiennej lokalnej po inicjalizacji: " + localVariable);
    }
}
