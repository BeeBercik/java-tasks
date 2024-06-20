package org.example.Java_036;

/**
 * Pytanie: Co to jest klasa abstrakcyjna w Javie?
 * Odpowiedź:
 * Klasa abstrakcyjna w Javie to taka, która nie może być instancjonowana bezpośrednio.
 * Służy głównie jako klasa bazowa dla innych klas, które dziedziczą po niej i implementują
 * jej metody abstrakcyjne. Klasa abstrakcyjna może zawierać metody abstrakcyjne (bez ciała)
 * oraz metody z implementacją. Klasa pochodna musi zaimplementować wszystkie metody abstrakcyjne
 * klasy bazowej, chyba że sama jest oznaczona jako abstrakcyjna.
 */

// Definicja klasy abstrakcyjnej
abstract class Shape {
    String color;

    // Konstruktor klasy abstrakcyjnej
    public Shape(String color) {
        this.color = color;
    }

    // Metoda abstrakcyjna
    abstract double area();

    // Metoda zwykła (nieabstrakcyjna)
    public String getColor() {
        return color;
    }
}

// Klasa pochodna implementująca metodę abstrakcyjną
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color); // Wywołanie konstruktora klasy bazowej
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius; // Implementacja metody abstrakcyjnej
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("czerwony", 4.5);
        System.out.println("Kolor: " + circle.getColor() + ", Powierzchnia: " + circle.area());
    }
}
