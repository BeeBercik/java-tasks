package org.example.Java_050;

/**
 * Pytanie: Czy za każdym razem wymagane jest importowanie pakietu java.lang?
 * Odpowiedź: Nie, importowanie pakietu java.lang nie jest wymagane za każdym razem.
 * Pakiet java.lang jest automatycznie importowany przez kompilator Javy, co oznacza,
 * że wszystkie klasy znajdujące się w tym pakiecie są dostępne w programie bez
 * potrzeby jawnego importowania.
 */

class UniqueToy { // Przykładowa klasa reprezentująca unikatową zabawkę
    private String name;
    private int productionYear;

    // Konstruktor klasy UniqueToy
    public UniqueToy(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    // Przesłonięcie metody toString() z klasy Object
    @Override
    public String toString() {
        return "UniqueToy{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        UniqueToy toy = new UniqueToy("Vintage Car", 1970);

        // Wykorzystanie metody toString() dziedziczonej z klasy Object
        System.out.println(toy.toString());
    }
}

/**
 * W tym kodzie definiujemy klasę UniqueToy, która reprezentuje unikatową zabawkę.
 * Dzięki automatycznemu importowi pakietu java.lang, możemy bezpośrednio korzystać
 * z metod takich jak toString() bez konieczności importowania klasy Object lub innych
 * klas z tego pakietu. To pokazuje, jak wygodne jest to rozwiązanie w praktycznym
 * programowaniu w Javie.
 */
