package org.example.Java_031_method_overloading;

/**
 *
 * Pytanie: Jak zaimplementować przeciążanie metod w Javie?
 * Odpowiedź: Przeciążanie metod w Javie polega na tworzeniu w jednej klasie
 * wielu metod o tej samej nazwie, ale różniących się listą parametrów. Pozwala to
 * na używanie tej samej nazwy metody do wykonania różnych zadań w zależności od
 * przekazanych argumentów.
 */

class Calculator {

    // Metoda do dodawania dwóch liczb całkowitych
    public int add(int a, int b) {
        return a + b;
    }

    // Metoda do dodawania trzech liczb całkowitych
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Metoda do dodawania dwóch liczb zmiennoprzecinkowych
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Wywołanie metody dodającej dwie liczby całkowite
        System.out.println("Suma 2 + 3 = " + calc.add(2, 3));

        // Wywołanie metody dodającej trzy liczby całkowite
        System.out.println("Suma 2 + 3 + 4 = " + calc.add(2, 3, 4));

        // Wywołanie metody dodającej dwie liczby zmiennoprzecinkowe
        System.out.println("Suma 2.5 + 3.5 = " + calc.add(2.5, 3.5));
    }
}

/**
 * W tym kodzie definiujemy klasę Calculator, która zawiera trzy przeciążone wersje
 * metody add. Każda z tych metod wykonuje dodawanie, ale akceptuje różne typy i liczby
 * argumentów. Dzięki przeciążaniu metod, można użyć tej samej nazwy metody add do
 * wykonania różnych operacji dodawania, co ułatwia czytelność i organizację kodu.
 */
