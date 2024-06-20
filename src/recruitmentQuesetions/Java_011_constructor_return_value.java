package org.example.questions1;
/**
 *
 * Pytanie: Jaka jest wartość zwracana przez konstruktor w Javie?
 * Odpowiedź:
 * Konstruktor w Javie nie zwraca żadnej wartości, nawet typu void. Konstruktory
 * są specjalnymi metodami służącymi do inicjalizacji nowych obiektów i nie mają
 * zdefiniowanej wartości zwrotnej w swojej sygnaturze. Ich głównym zadaniem jest
 * przygotowanie nowego obiektu do użycia, poprzez inicjalizację zmiennych
 * instancyjnych i wykonanie wszelkich niezbędnych operacji startowych. Kiedy
 * używamy słowa kluczowego 'new' w połączeniu z konstruktorem, Java tworzy
 * nową instancję obiektu i automatycznie wywołuje konstruktor klasy dla tego
 * obiektu, aby go zainicjalizować.
 */

class ExampleClass {
    // Definicja zmiennych instancyjnych klasy
    String exampleField;

    // Domyślny konstruktor klasy ExampleClass
    public ExampleClass() {
        this.exampleField = "Przykładowa wartość";
        // Konstruktor nie zwraca wartości, ale inicjalizuje obiekt.
    }

    // Metoda do wyświetlenia wartości zmiennej instancyjnej
    public void displayFieldValue() {
        System.out.println("Wartość exampleField: " + this.exampleField);
    }
}

public class Java_011_constructor_return_value {
    public static void main(String[] args) {
        // Tworzenie nowego obiektu klasy ExampleClass
        ExampleClass exampleObject = new ExampleClass();

        // Wywołanie metody displayFieldValue, aby wyświetlić wartość zmiennej instancyjnej
        exampleObject.displayFieldValue();
    }
}

/**
 * Kod ten demonstruje, że konstruktor klasy ExampleClass jest używany do
 * inicjalizacji obiektu klasy przy tworzeniu nowej instancji. Warto zauważyć,
 * że konstruktor nie posiada typu zwrotu w deklaracji - nawet 'void' nie jest
 * wymagany ani dozwolony. Jest to kluczowa różnica między konstruktorami a
 * metodami, które muszą mieć określony typ zwrotu (lub 'void' jeśli nie zwracają
 * wartości). Ten przykład podkreśla, jak konstruktory są wykorzystywane w Javie
 * do inicjalizacji nowych obiektów.
 */

