package org.example.Java_057;


/**
 * Pytanie: Dlaczego używamy metody finalize() w Javie?
 * Odpowiedź: Metoda finalize() jest wywoływana przed usunięciem obiektu przez
 * Garbage Collector i służy do zwolnienia zasobów, które nie są zarządzane przez
 * Javę, takich jak połączenia z bazami danych, strumienie plików itp. Jest to
 * mechanizm bezpieczeństwa, który pozwala na upewnienie się, że wszystkie zasoby
 * zostały prawidłowo zwolnione przed usunięciem obiektu z pamięci.
 */

class ResourceCleaner {
    // Symulacja zasobu, który wymaga zwolnienia
    private String resourceName;

    public ResourceCleaner(String resourceName) {
        this.resourceName = resourceName;
        System.out.println(resourceName + " utworzony.");
    }

    // Nadpisanie metody finalize()
    @Override
    protected void finalize() throws Throwable {
        System.out.println(resourceName + " zwalnianie zasobów przed usunięciem.");
        super.finalize(); // Wywołanie finalize() klasy bazowej
    }

    public static void main(String[] args) {
        ResourceCleaner cleaner = new ResourceCleaner("Zasób 1");

        // Ustawienie obiektu na null, aby stał się kandydatem do garbage collection
        cleaner = null;

        // Sugerowanie JVM do uruchomienia Garbage Collector'a
        System.gc();

        System.out.println("Garbage Collection zostało zasugerowane.");
    }
}

/**
 * W tym kodzie definiujemy klasę ResourceCleaner, która symuluje zarządzanie
 * zasobem wymagającym zwolnienia. W metodzie finalize() dodajemy logikę zwalniania
 * zasobów, co pokazuje, jak można użyć tej metody do sprzątania przed usunięciem
 * obiektu przez Garbage Collector. Ustawienie obiektu na null i sugerowanie
 * uruchomienia Garbage Collector'a przez System.gc() demonstruje, jak obiekt
*/