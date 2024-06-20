package org.example.Java_060;

/**
 * Pytanie: Jaka jest różnica między klasą zagnieżdżoną a klasą wewnętrzną w Javie?
 * Odpowiedź: Kluczową różnicą jest to, że klasa zagnieżdżona statyczna (Static Nested Class)
 * nie ma dostępu do instancji klasy zewnętrznej, podczas gdy klasa wewnętrzna (Inner class) ma
 * dostęp do wszystkich pól i metod klasy zewnętrznej, w tym tych prywatnych.
 *
 *  Klasa zagniezdzona niestatyczna to to smo co klasa wewnetrzna. Klasa anonimowa to klasa tworzona i zapisywana od razu do zmiennej. Klasa zagniezdzona lokalna to klasa stworozna wewnatrz metody
 *
 */


class Library {
    private String libraryName;

    Library(String name) {
        this.libraryName = name;
    }

    // Statyczna klasa zagnieżdżona
    static class LibraryCard {
        void accessCard() {
            System.out.println("Dostęp do karty bibliotecznej.");
            // Nie ma dostępu do libraryName, ponieważ jest to statyczna klasa zagnieżdżona
        }
    }

    // Klasa wewnętrzna
    class Book {
        private String title;

        Book(String title) {
            this.title = title;
        }

        void displayInfo() {
            System.out.println("Książka: " + title + ", Biblioteka: " + libraryName);
            // Ma dostęp do libraryName, ponieważ jest to klasa wewnętrzna
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library("Biblioteka Miejska");

        // Utworzenie instancji klasy wewnętrznej
        Library.Book myBook = myLibrary.new Book("W pustyni i w puszczy");
        myBook.displayInfo();

        // Utworzenie instancji statycznej klasy zagnieżdżonej
        Library.LibraryCard myCard = new Library.LibraryCard();
        myCard.accessCard();
    }
}

/**
 * W tym przykładzie klasa `Library` zawiera klasę wewnętrzną `Book` i statyczną klasę zagnieżdżoną `LibraryCard`.
 * Klasa `Book` ma dostęp do pól klasy `Library`, w tym do prywatnego pola `libraryName`. Natomiast klasa `LibraryCard`,
 * będąca statyczną klasą zagnieżdżoną, nie ma dostępu do pól instancji klasy `Library`, co demonstruje główną różnicę
 * w dostępie między klasą wewnętrzną a klasą zagnieżdżoną.
 */


