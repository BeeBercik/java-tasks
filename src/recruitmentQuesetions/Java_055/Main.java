package org.example.Java_055;


/**
 * Pytanie: Co to jest Garbage Collection w Javie?
 * Odpowiedź: Garbage Collection (Zbieranie śmieci) w Javie to proces automatycznego
 * zarządzania pamięcią, który pozwala na odzyskiwanie pamięci zajmowanej przez
 * obiekty, do których już nie istnieją żadne referencje. Mechanizm ten zapewnia,
 * że aplikacja nie wyczerpie dostępnej pamięci, automatycznie zwalniając zasoby,
 * które nie są już używane.
 */

class GarbageCollectionExample {
    public void showGarbageCollection() {
        // Tworzenie obiektów
        String temporaryString = new String("Przykładowy tekst");
        // Przypisanie null do referencji obiektu, co czyni obiekt kandydatem do GC
        temporaryString = null;

        // Ręczne wywołanie Garbage Collector
        System.gc();

        System.out.println("Garbage Collection zostało wykonane.");
    }
}

public class Main {
    public static void main(String[] args) {
        GarbageCollectionExample example = new GarbageCollectionExample();
        example.showGarbageCollection();
    }
}

/**
 * W tym przykładzie tworzymy obiekt typu String i następnie ustawiamy jego referencję
 * na null, co czyni go kandydatem do Garbage Collection. Następnie ręcznie wywołujemy
 * Garbage Collector poprzez System.gc(), choć w praktyce jest to zadanie wykonywane
 * automatycznie przez JVM. Demonstruje to, jak JVM zarządza pamięcią i automatycznie
 * zwalnia zasoby, które nie są już potrzebne.
 */
