package org.example.questions1;

/**
 * Java_002_what_is_jvm.java
 *
 * Pytanie: Co to jest Java Virtual Machine (JVM)?
 * Odpowiedź:
 * JVM, czyli Java Virtual Machine, to wirtualna maszyna wykonująca
 * bajtkod Java. Jest to część środowiska wykonawczego Java, która pozwala na
 * uruchamianie programów napisanych w języku Java na dowolnym urządzeniu lub
 * systemie operacyjnym bez konieczności modyfikacji kodu źródłowego. JVM jest
 * odpowiedzialna za zarządzanie zasobami systemu, takimi jak pamięć i wykonywanie
 * kodu bajtowego Java. Dzięki temu Java jest językiem "zapisz raz, uruchom wszędzie"
 * (write once, run anywhere - WORA).
 */

public class Java_003_what_is_jvm {
    public static void main(String[] args) {
        // Wyświetlenie informacji o wersji i producencie JVM
        System.out.println("Wersja JVM: " + System.getProperty("java.vm.version"));
        System.out.println("Producent JVM: " + System.getProperty("java.vm.vendor"));

        // Informacja o nazwie JVM
        System.out.println("Nazwa JVM: " + System.getProperty("java.vm.name"));
    }
}

/**
 * Ten kod demonstruje, jak można uzyskać podstawowe informacje o JVM, z której
 * korzysta aplikacja Java. Użycie klasy System i metody getProperty pozwala na
 * łatwe odwołanie się do właściwości systemowych JVM. Jest to przykład pokazujący,
 * jak Java abstrahuje szczegóły implementacyjne, umożliwiając aplikacjom działanie
 * na różnych platformach bez zmian w kodzie źródłowym.
 */
