package org.example.Java_043;

/**
 * Pytanie: Jak można zmienić wartość zmiennej final w Javie?
 * Odpowiedź: W Javie wartość zmiennej oznaczonej jako final można ustawić tylko raz.
 * Jednakże, jest możliwe jej przypisanie w konstruktorze klasy. To pozwala na
 * inicjalizację zmiennej final w momencie tworzenia obiektu klasy, dając pewność,
 * że każda instancja klasy będzie miała swoją unikalną, niemodyfikowalną wartość tej zmiennej.
 */

class UniqueIDGenerator {
    private final int uniqueID;

    public UniqueIDGenerator(int ID) {
        this.uniqueID = ID; // Przypisanie wartości do zmiennej final w konstruktorze
    }

    public int getUniqueID() {
        return uniqueID;
    }
}

public class Main {
    public static void main(String[] args) {
        UniqueIDGenerator generator1 = new UniqueIDGenerator(101);
        UniqueIDGenerator generator2 = new UniqueIDGenerator(102);

        System.out.println("Unikalne ID generatora 1: " + generator1.getUniqueID());
        System.out.println("Unikalne ID generatora 2: " + generator2.getUniqueID());
    }
}

/**
 * W tym kodzie definiujemy klasę UniqueIDGenerator, która posiada zmienną instancyjną
 * oznaczoną jako final. Wartość tej zmiennej jest przypisywana w konstruktorze,
 * co pozwala na ustawienie unikalnego ID dla każdej instancji tej klasy.
 * Metoda getUniqueID() pozwala na odczytanie wartości tej zmiennej.
 * Przykład pokazuje, jak można inicjalizować zmienne final w konstruktorze,
 * co jest jedynym sposobem na ich "zmianę" (inicjalizację) po definicji.
 */
