package org.example.Java_049;
/**
 * Pytanie: Która klasa jest najważniejsza w Javie?
 * Odpowiedź: Najważniejszą klasą w Javie jest `Object`. Jest ona klasą bazową dla wszystkich
 * innych klas w Javie. Każda klasa w Javie dziedziczy z klasy `Object`, co sprawia, że
 * metody zdefiniowane w klasie `Object` są dostępne dla każdego obiektu. Te metody, takie jak
 * `equals()`, `hashCode()`, `toString()`, i inne, są fundamentalne dla programowania w Javie.
 */

class GardenItem { // Przykładowa klasa reprezentująca przedmiot w ogrodzie
    private String name;
    private double weight;

    // Konstruktor klasy GardenItem
    public GardenItem(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // Nadpisanie metody toString() z klasy Object
    @Override
    public String toString() {
        return "GardenItem{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        GardenItem item = new GardenItem("Garden Chair", 5.5);

        // Wykorzystanie metody toString() dziedziczonej z klasy Object
        System.out.println(item.toString());
    }
}

/**
 * W tym kodzie definiujemy klasę GardenItem, która reprezentuje przedmiot w ogrodzie.
 * Dziedziczy ona niejawnie z klasy `Object`, co umożliwia nam nadpisanie metody `toString()`
 * dla lepszego reprezentowania obiektu jako łańcucha znaków. To pokazuje, jak ważną rolę
 * pełni klasa `Object` w ekosystemie Javy, będąc podstawą dla wszystkich klas.
 */
