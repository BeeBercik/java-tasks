package org.example.questions1;

/**
 * Pytanie: W Javie, dlaczego używamy zmiennej statycznej?
 * Odpowiedź:
 * Zmienna statyczna w Javie jest używana do przechowywania wartości, która jest wspólna
 * dla wszystkich instancji klasy, niezależnie od liczby utworzonych obiektów. Takie zmienne
 * są przechowywane w pamięci statycznej. Głównym zastosowaniem zmiennych statycznych jest
 * zarządzanie wspólnymi danymi dla wszystkich obiektów klasy, np. licznik instancji klasy
 * lub wspólna konfiguracja. Zmienne statyczne są inicjalizowane przy pierwszym załadowaniu
 * klasy i istnieją aż do zakończenia pracy programu.
 */

class LibraryBook {
    static int bookCount = 0; // Zmienna statyczna przechowująca liczbę książek
    String title;

    public LibraryBook(String title) {
        this.title = title;
        bookCount++; // Zwiększenie licznika książek przy tworzeniu nowej instancji
    }

    public static void displayBookCount() {
        System.out.println("Całkowita liczba książek w bibliotece: " + bookCount);
    }
}

public class Java_020_why_use_static_variable {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Podstawy");
        LibraryBook book2 = new LibraryBook("Java Zaawansowane");

        LibraryBook.displayBookCount(); // Wyświetlenie liczby książek bez odwoływania się do konkretnej instancji
    }
}

/**
 * W tym kodzie zdefiniowaliśmy klasę LibraryBook, która używa zmiennej statycznej bookCount
 * do śledzenia liczby utworzonych książek. Niezależnie od liczby instancji klasy LibraryBook,
 * zmienna bookCount jest współdzielona i aktualizowana. Demonstruje to kluczowe zastosowanie
 * zmiennej statycznej w zarządzaniu danymi wspólnymi dla klasy. Użycie metody statycznej
 * displayBookCount() pozwala na dostęp do zmiennej statycznej bez potrzeby tworzenia
 * instancji klasy, co jest przykładem wykorzystania statycznych składowych klasy do
 * operacji na danych klasowych, a nie instancyjnych.
 */
