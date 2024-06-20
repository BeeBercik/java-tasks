package org.example.Java_066;

/**
 * Pytanie: Co to jest blok finally w Javie?
 * Odpowiedź: Blok finally to sekcja kodu, która jest zawsze wykonana po blokach
 * try i catch, niezależnie od tego, czy w trakcie wykonania bloku try wystąpił
 * wyjątek, czy nie. Umożliwia to wykonanie niezbędnych operacji porządkujących,
 * takich jak zwolnienie zasobów.
 */

class BookReader {
    private String bookName;

    // Konstruktor klasy BookReader
    public BookReader(String bookName) {
        this.bookName = bookName;
    }

    // Metoda symulująca czytanie książki, która może rzucić wyjątek
    public void readBook() {
        try {
            if (bookName == null) {
                throw new Exception("Nazwa książki nie może być null.");
            }
            System.out.println("Czytanie książki: " + bookName);
        } catch (Exception e) {
            System.err.println("Wyjątek: " + e.getMessage());
        } finally {
            System.out.println("Zamykanie książki.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BookReader bookReader = new BookReader(null); // Przypadkowo przekazano null jako nazwę książki

        bookReader.readBook();
    }
}

/**
 * W tym przykładzie zdefiniowaliśmy klasę BookReader z metodą readBook(),
 * która symuluje proces czytania książki. W metodzie tej używamy bloku finally,
 * aby zapewnić, że książka zostanie "zamknięta" niezależnie od tego, czy podczas
 * czytania wystąpił wyjątek, czy nie. Jest to przykład typowego zastosowania bloku
 * finally do zapewnienia prawidłowego zwolnienia zasobów w Javie.
 */
