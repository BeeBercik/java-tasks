package org.example.Java_051;

import static java.lang.Math.*; // Statyczny import, mozemy uzywac metod, stalych po ich nazwie
import static java.lang.Math.pow; // Statyczny import metody pow()

/**
 * Pytanie: Czym jest statyczny import w Javie?
 * Odpowiedź: Statyczny import w Javie umożliwia bezpośredni dostęp do statycznych
 * metod i zmiennych klasy bez konieczności przedstawiania ich z pełną kwalifikacją
 * nazwy klasy. To ułatwia pisanie kodu, czyniąc go bardziej zwięzłym i czytelnym,
 * szczególnie przy częstym korzystaniu z tych samych statycznych członków klasy.
 */

class SpaceObject { // Przykładowa klasa reprezentująca obiekt kosmiczny
    private String name;
    private double radius;

    // Konstruktor klasy SpaceObject
    public SpaceObject(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    // Metoda obliczająca objętość obiektu kosmicznego przy założeniu, że jest on kulą
    public double calculateVolume() {
        return (4.0/3) * PI * pow(radius, 3);
    }

    @Override
    public String toString() {
        return "SpaceObject{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", volume=" + calculateVolume() +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        SpaceObject earth = new SpaceObject("Ziemia", 6371);

        // Wykorzystanie metody toString() do wyświetlenia informacji o obiekcie kosmicznym
        System.out.println(earth.toString());
    }
}

/**
 * W tym kodzie korzystamy ze statycznego importu, aby bezpośrednio użyć stałej PI
 * i metody pow() z klasy Math bez potrzeby jej pełnej kwalifikacji. To demonstruje
 * jak statyczny import sprawia, że korzystanie z często używanych metod matematycznych
 * staje się bardziej zwięzłe i czytelne.
 */
