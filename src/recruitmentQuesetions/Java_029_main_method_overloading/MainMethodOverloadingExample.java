package org.example.Java_029_main_method_overloading;

/**
 * Pytanie: Czy w Javie dozwolone jest przeciążanie metody main()?
 * Odpowiedź:
 * Tak, przeciążanie metody main() jest dozwolone w Javie. Można mieć w jednej klasie
 * wiele metod main() z różnymi sygnaturami. Jednak JVM zawsze wywoła wersję metody
 * main(), która przyjmuje jedyny argument w postaci tablicy Stringów (String[] args).
 * Pozostałe wersje metody main() mogą być wywoływane tylko z kodu programu, nie przez JVM.
 */

// Przykładowa klasa demonstrująca przeciążanie metody main()
class MainMethodOverloadingExample {
    // Główna metoda main wywoływana przez JVM
    public static void main(String[] args) {
        System.out.println("Główna metoda main() wywołana.");
        // Wywołanie przeciążonej wersji metody main z innymi argumentami
        main("Przeciążona metoda main.");
        main(10);
    }

    // Przeciążona metoda main z jednym argumentem typu String
    public static void main(String arg) {
        System.out.println(arg);
    }

    // Przeciążona metoda main z jednym argumentem typu int
    public static void main(int number) {
        System.out.println("Liczba: " + number);
    }
}

/**
 * W tym kodzie pokazano klasę MainMethodOverloadingExample, która zawiera trzy wersje
 * metody main(). Pierwsza metoda main(String[] args) jest standardową metodą wywoływaną
 * przez JVM jako punkt startowy programu. Pozostałe dwie metody są przykładami przeciążonych
 * wersji metody main, które mogą być wywoływane z kodu programu, ale nie są bezpośrednio
 * wywoływane przez JVM. Demonstruje to, jak przeciążanie metody main() może być wykorzystane
 * do tworzenia dodatkowych punktów wejścia do programu, które są dostępne tylko z poziomu
 * już uruchomionej aplikacji.
 */
