package org.example.questions1;

/**
 * Pytanie: Która klasa w Javie jest nadklasą każdej innej klasy?
 * Odpowiedź:
 * Klasa Object w Javie jest nadklasą (superklasą) każdej innej klasy. Każda klasa,
 * którą tworzymy w Javie, dziedziczy bezpośrednio lub pośrednio z klasy Object.
 * Dostarcza ona metody, które są wspólne dla wszystkich obiektów, takie jak
 * equals(), hashCode(), toString(), clone(), getClass() i notify(), które mogą
 * być nadpisywane w klasach pochodnych w celu zmiany ich zachowania.
 */

// Demonstracja użycia klasy Object jako nadklasy
class TestClass {
    // Ta klasa dziedziczy niejawnie z klasy Object
}

public class Java_016_superclass_of_every_class {
    public static void main(String[] args) {
        TestClass exampleObject = new TestClass();
        // Wywołanie metody toString() dziedziczonej z klasy Object
        System.out.println(exampleObject.toString());

        // Wyświetlenie nazwy klasy za pomocą metody getClass() z klasy Object
        System.out.println("Klasa exampleObject to: " + exampleObject.getClass().getName());
    }
}

/**
 * Ten kod pokazuje, że każda klasa w Javie dziedziczy z klasy Object, nawet jeśli
 * nie jest to zadeklarowane wprost. Klasa Object jest bazą dla wszystkich klas i
 * dostarcza podstawowe metody, które mogą być wykorzystywane lub modyfikowane
 * przez klasy pochodne. Dzięki temu, wszystkie obiekty w Javie mają wspólny zestaw
 * metod, co jest fundamentem dla mechanizmów takich jak porównywanie obiektów,
 * ich reprezentacja tekstowa czy zarządzanie pamięcią.
 */
