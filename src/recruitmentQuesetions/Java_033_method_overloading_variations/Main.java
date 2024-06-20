package org.example.Java_033_method_overloading_variations;

/**
 * Pytanie: Jakie wariacje argumentów są dozwolone w przeciążaniu metod?
 * Odpowiedź:
 * W przeciążaniu metod dozwolone są różne wariacje argumentów, takie jak różna liczba
 * argumentów, różne typy danych oraz różna kolejność typów.
 * Dzięki temu, można zdefiniować wiele metod o tej samej nazwie, ale z różnymi
 * parametrami wejściowymi w jednej klasie.
 */

class Calculator {
    // Metoda przeciążona z jednym argumentem
    int add(int a) {
        return a + a;
    }

    // Metoda przeciążona z dwoma argumentami
    int add(int a, int b) {
        return a + b;
    }

    // Metoda przeciążona z dwoma argumentami różnych typów
    double add(double a, double b) {
        return a + b;
    }

    // Metoda przeciążona z trzema argumentami różnych typów
    double add(int a, double b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Dodawanie (int): " + calc.add(5));
        System.out.println("Dodawanie (int, int): " + calc.add(5, 3));
        System.out.println("Dodawanie (double, double): " + calc.add(2.5, 3.5));
        System.out.println("Dodawanie (int, double, int): " + calc.add(5, 4.5, 3));
    }
}

