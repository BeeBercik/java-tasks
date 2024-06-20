package org.example.questions1;

/**
 *
 * Pytanie: Dlaczego w Javie nie ma wskaźników?
 * Odpowiedź:
 * Java została zaprojektowana tak, aby unikać bezpośredniego korzystania z wskaźników
 * w celu zwiększenia bezpieczeństwa i prostoty języka. Brak wskaźników eliminuje
 * potencjalne problemy, takie jak dzikie wskaźniki, wycieki pamięci oraz naruszenia
 * dostępu do pamięci, co czyni programy napisane w Javie bardziej stabilne i mniej
 * podatne na błędy. Java używa referencji do obiektów, które pełnią podobną rolę do
 * wskaźników, ale są zarządzane automatycznie przez maszynę wirtualną Javy (JVM),
 * która zajmuje się zarządzaniem pamięcią, w tym zbieraniem śmieci (garbage collection).
 */

class Plant {
    String species;
    boolean isPerennial;

    public Plant(String species, boolean isPerennial) {
        this.species = species; // Przypisanie nazwy gatunku rośliny
        this.isPerennial = isPerennial; // Określenie, czy roślina jest byliną
    }

    public void displayInfo() {
        System.out.println("Gatunek rośliny: " + species + ", Bylina: " + isPerennial);
    }
}

public class Java_018_why_no_pointers_in_java {
    public static void main(String[] args) {
        Plant myPlant = new Plant("Róża", true);

        // Wywołanie metody wyświetlającej informacje o roślinie
        myPlant.displayInfo();
    }
}

/**
 * Ten kod demonstruje użycie referencji do obiektu klasy Plant zamiast wskaźników.
 * Obiekt 'myPlant' jest referencją do instancji klasy Plant, co pozwala na
 * manipulację obiektem w sposób bezpieczny i kontrolowany przez JVM. Automatyczne
 * zarządzanie pamięcią i brak konieczności bezpośredniego zarządzania wskaźnikami
 * ułatwiają pracę programisty i zwiększają bezpieczeństwo aplikacji.
 */
