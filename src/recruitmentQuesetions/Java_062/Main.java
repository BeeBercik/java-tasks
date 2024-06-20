package org.example.Java_062;


/**
 * Pytanie: Co oznacza niemutowalność w kontekście klasy String w Javie?
 * Odpowiedź: Niemutowalność klasy String w Javie oznacza, że obiekty String są stałe
 * i nie mogą zostać zmienione po ich utworzeniu. Każda operacja, która wydaje się modyfikować
 * String, tak naprawdę tworzy nowy obiekt String, pozostawiając oryginał niezmieniony.
 */

class ImmutableStringExample {
    public static void main(String[] args) {
        String greeting = "Witaj";
        System.out.println("Oryginalny ciąg znaków: " + greeting);

        // Próba "modyfikacji" ciągu znaków
        greeting.concat(", świecie!");

        // Ciąg znaków pozostaje niezmieniony, ponieważ String jest niemutowalny
        System.out.println("Ciąg znaków po 'modyfikacji': " + greeting);

        // Tworzenie nowego ciągu znaków
        String modifiedGreeting = greeting.concat(", świecie!");
        System.out.println("Nowy ciąg znaków: " + modifiedGreeting);
    }
}

/**
 * Ten przykład demonstruje niemutowalność ciągów znaków w Javie. Pomimo próby modyfikacji
 * zmiennej `greeting` za pomocą metody `concat`, oryginalny ciąg znaków pozostaje niezmieniony.
 * Zamiast tego, aby "zmienić" ciąg znaków, tworzymy nowy obiekt String, który zawiera wynikową
 * wartość. Niemutowalność String sprawia, że jest on bezpieczny do użycia w aplikacjach wielowątkowych
 * i pomaga w zapobieganiu niezamierzonym zmianom danych.
 */

