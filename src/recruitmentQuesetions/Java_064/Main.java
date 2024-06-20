package org.example.Java_064;

/**
 * Pytanie: Jaki jest cel metody toString() w Javie?
 * Odpowiedź: Metoda toString() jest używana do zwracania reprezentacji tekstowej
 * obiektu. W klasach zdefiniowanych przez użytkownika, nadpisanie tej metody pozwala
 * na zwrócenie łańcucha znaków, który najlepiej opisuje obiekt, co jest przydatne
 * np. podczas logowania, debugowania lub wyświetlania informacji o obiekcie.
 */

class Bicycle {
    private String model;
    private int gear;

    public Bicycle(String model, int gear) {
        this.model = model;
        this.gear = gear;
    }

    // Nadpisanie metody toString() dla klasy Bicycle
    @Override
    public String toString() {
        return "Bicycle{" +
                "model='" + model + '\'' +
                ", gear=" + gear +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("MountainBike", 21);

        // Wywołanie metody toString() na obiekcie bicycle,
        // aby uzyskać i wyświetlić jego tekstową reprezentację
        System.out.println(bicycle.toString());
        // Lub krócej, ponieważ println() automatycznie wywoła toString() na obiekcie
        System.out.println(bicycle);
    }
}

/**
 * W tym kodzie definiujemy klasę Bicycle z nadpisaną metodą toString(), która zwraca
 * łańcuch znaków opisujący obiekt roweru, włączając jego model i liczbę biegów.
 * Demonstruje to, jak nadpisanie metody toString() pozwala na łatwe i intuicyjne
 * reprezentowanie stanu obiektów klasy.
 */

