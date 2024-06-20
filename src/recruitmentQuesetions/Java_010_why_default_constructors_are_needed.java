package recruitmentQuesetions;

/**
 *
 * Pytanie: Dlaczego potrzebujemy domyślnego konstruktora w klasach Java?
 * Odpowiedź:
 * Domyślny konstruktor w klasach Java jest automatycznie generowany przez
 * kompilator, jeśli nie zdefiniowano żadnego innego konstruktora. Jest on
 * niezbędny, aby umożliwić tworzenie instancji klasy bez podawania żadnych
 * argumentów. Domyślny konstruktor inicjalizuje obiekt wartościami domyślnymi,
 * np. null dla obiektów, 0 dla typów liczbowych i false dla typu boolean.
 * Ułatwia to tworzenie obiektów, gdy nie potrzebujemy specyfikować stanu
 * początkowego lub gdy chcemy, aby miał on wartości domyślne.
 */

public class Java_010_why_default_constructors_are_needed {
    int number;
    String text;

    // Domyślny konstruktor jest tutaj niejawnie obecny.
    // Java automatycznie go dostarcza, jeśli nie zdefiniowano żadnego konstruktora.

    public static void main(String[] args) {
        // Tworzenie nowego obiektu klasy DefaultConstructorExample
        Java_010_why_default_constructors_are_needed example = new Java_010_why_default_constructors_are_needed();

        // nie wyrzuci bledu bo niejawny konstr. ustawil domyslne wart. na 0 i null
        // Wyświetlenie domyślnych wartości zmiennych instancyjnych
        System.out.println("Domyślna wartość number: " + example.number);
        System.out.println("Domyślna wartość text: " + example.text);
    }
}

/**
 * W tym kodzie demonstrujemy, jak Java automatycznie dostarcza domyślny konstruktor,
 * jeśli nie zdefiniowano żadnego innego konstruktora w klasie. Dzięki temu, możemy
 * łatwo tworzyć instancje klasy bez potrzeby określania wartości początkowych, co
 * jest szczególnie przydatne, gdy chcemy, aby nasze obiekty były inicjalizowane
 * wartościami domyślnymi. Domyślny konstruktor ułatwia tworzenie obiektów i
 * zwiększa elastyczność kodu.
 */
