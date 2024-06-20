package org.example.Java_052;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Pytanie: Co to jest serializacja?
 * Odpowiedź: Serializacja to proces konwersji stanu obiektu na ciąg bajtów, co umożliwia
 * jego zapisanie do pliku lub przesyłanie przez sieć. Umożliwia to trwałe przechowywanie
 * obiektów lub ich wymianę między systemami. Aby obiekt mógł być serializowany, jego klasa
 * musi implementować interfejs Serializable.
 */

// Przykładowa klasa Book, która implementuje interfejs Serializable
class Book implements Serializable {
    private static final long serialVersionUID = 1L; // UID wersji klasy dla celów serializacji
    private String title;
    private String author;
    private int year;

    // Konstruktor klasy Book
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Podstawy", "Cay S. Horstmann", 2019);

        // Serializacja obiektu book do pliku
        try (FileOutputStream fileOut = new FileOutputStream("book.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(book);
            System.out.println("Serializacja obiektu Book zakończona sukcesem.");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

/**
 * W tym kodzie tworzymy obiekt klasy Book i serializujemy go do pliku o nazwie "book.ser".
 * Klasa Book implementuje interfejs Serializable, co umożliwia jej serializację. W bloku try-with-resources
 * otwieramy strumień do pliku i używamy ObjectOutputStream do zapisania stanu obiektu book. Dzięki serializacji,stan obiektu może być później odtworzony, co jest szczególnie przydatne w aplikacjach rozproszonych.
 */
