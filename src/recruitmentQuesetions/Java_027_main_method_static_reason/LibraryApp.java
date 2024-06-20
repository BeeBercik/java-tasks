package org.example.Java_027_main_method_static_reason;


/**
 * Pytanie: Dlaczego metoda main jest oznaczona jako statyczna w Javie?
 * Odpowiedź:
 * Metoda main jest oznaczana jako statyczna, aby JVM mogła ją wywołać bez potrzeby
 * tworzenia instancji klasy, w której się znajduje. Jest to punkt wejścia do programu,
 * a jej statyczność umożliwia uruchomienie aplikacji bez konieczności inicjalizacji
 * jakiegokolwiek obiektu. Dzięki temu, proces startowy aplikacji jest uproszczony,
 * ponieważ JVM bezpośrednio wywołuje metodę main, rozpoczynając wykonanie programu.
 */

class Library {
    // Statyczna zmienna dla demonstracji
    static int numberOfBooks = 0;

    // Statyczna metoda do dodawania książek
    public static void addBook() {
        numberOfBooks++;
        System.out.println("Dodano książkę. Łączna liczba książek: " + numberOfBooks);
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        System.out.println("Uruchomienie aplikacji bibliotecznej.");
        Library.addBook(); // Wywołanie metody statycznej bez tworzenia instancji klasy
        Library.addBook();
    }
}

/**
 * W tym kodzie definiujemy klasę Library, która zawiera statyczną zmienną numberOfBooks
 * oraz statyczną metodę addBook(), służącą do symulacji dodawania książek do biblioteki.
 * Metoda main w klasie LibraryApp jest statyczna, co pozwala na jej bezpośrednie
 * wywołanie przez JVM jako punkt wejścia do programu. Dzięki temu, możemy uruchomić
 * działanie aplikacji bez konieczności inicjalizowania obiektu klasy Library, co
 * podkreśla znaczenie statyczności metody main w kontekście uruchamiania programów Java.
 */
