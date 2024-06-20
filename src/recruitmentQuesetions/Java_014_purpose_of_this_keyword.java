package org.example.questions1;
/**
 *
 * Pytanie: Jaki jest cel słowa kluczowego 'this' w Javie?
 * Odpowiedź:
 * Słowo kluczowe 'this' w Javie odnosi się do bieżącego obiektu w obrębie metody lub
 * konstruktora klasy. Jest używane głównie do rozróżnienia zmiennych instancyjnych
 * od zmiennych lokalnych o tej samej nazwie, do wywoływania innych konstruktorów
 * w obrębie tej samej klasy oraz do przekazywania bieżącego obiektu jako argument
 * do innej metody. Dzięki 'this', kod jest bardziej czytelny i łatwiejszy w utrzymaniu.
 */

class ExampleClass3 {
    String exampleField;

    // Konstruktor klasy ExampleClass używający 'this' do inicjalizacji zmiennej instancyjnej
    public ExampleClass3(String exampleField) {
        this.exampleField = exampleField; // 'this' rozróżnia zmienną instancyjną od parametru
    }

    // Metoda wykorzystująca 'this' do wywołania innej metody w tej samej klasie
    public void display() {
        print(this); // Przekazanie bieżącego obiektu jako argument
    }

    // Statyczna metoda pomocnicza do wyświetlenia wartości zmiennej instancyjnej
    public static void print(ExampleClass3 obj) {
        System.out.println("Wartość exampleField: " + obj.exampleField);
    }
}

public class Java_014_purpose_of_this_keyword {
    public static void main(String[] args) {
        ExampleClass3 exampleObject = new ExampleClass3("Test 'this' keyword");
        exampleObject.display(); // Wywołanie metody, która używa 'this'
    }
}

/**
 * Ten kod demonstruje użycie słowa kluczowego 'this' w Javie w różnych kontekstach.
 * 'This' jest używane do inicjalizacji zmiennych instancyjnych w konstruktorze,
 * rozróżniając je od parametrów konstruktora o tej samej nazwie. Pokazuje również,
 * jak 'this' może być użyte do wywołania metody w tej samej klasie, przekazując
 * bieżący obiekt jako argument. Dzięki temu, kod staje się bardziej zrozumiały
 * i łatwiejszy do zarządzania.
 */
