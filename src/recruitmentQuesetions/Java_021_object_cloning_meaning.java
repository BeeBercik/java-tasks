package org.example.questions1;
/**
 * Pytanie: Co oznacza klonowanie obiektów w Javie?
 * Odpowiedź:
 * Klonowanie obiektów w Javie oznacza tworzenie dokładnej kopii istniejącego obiektu.
 * Umożliwia to pracę na kopii obiektu bez ryzyka modyfikacji oryginalnego obiektu.
 * Klonowanie jest realizowane za pomocą metody clone() klasy Object, którą można
 * nadpisać w klasie, aby dostosować proces klonowania do specyficznych potrzeb.
 * Aby klasa mogła być klonowana, musi implementować interfejs Cloneable, co jest
 * sygnałem dla JVM, że obiekt tej klasy może być bezpiecznie klonowany.
 */

class Gadget implements Cloneable {
    String name;
    double price;

    public Gadget(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Metoda klonująca obiekt Gadget
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void displayInfo() {
        System.out.println("Gadżet: " + name + ", Cena: " + price + " zł");
    }
}

public class Java_021_object_cloning_meaning {
    public static void main(String[] args) {
        try {
            Gadget originalGadget = new Gadget("Smartwatch", 999.99);
            Gadget clonedGadget = (Gadget) originalGadget.clone(); // Klonowanie obiektu

            originalGadget.displayInfo(); // Wyświetlenie informacji o oryginalnym gadżecie
            clonedGadget.displayInfo();   // Wyświetlenie informacji o sklonowanym gadżecie
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}

/**
 * Ten kod demonstruje proces klonowania obiektu w Javie na przykładzie klasy Gadget.
 * Klasa Gadget implementuje interfejs Cloneable i nadpisuje metodę clone() z klasy
 * Object, co pozwala na tworzenie dokładnych kopii obiektów tej klasy. Klonowanie
 * umożliwia pracę na kopii obiektu, zachowując oryginał bez zmian. Jest to szczególnie
 * przydatne w sytuacjach, gdy potrzebujemy tymczasowo modyfikować dane bez wpływu
 * na stan oryginalnego obiektu.
 */

