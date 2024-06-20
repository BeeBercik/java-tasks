package org.example.Java_053;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Pytanie: Co to jest refleksja w Javie?
 * Odpowiedź: Refleksja w Javie to mechanizm pozwalający na badanie i modyfikowanie
 * struktury oraz zachowania programu w czasie jego wykonywania. Umożliwia dynamiczne
 * wczytywanie klas, dostęp do ich pól, metod, konstruktorów, co sprawia, że kod
 * może być bardziej elastyczny i adaptacyjny do różnych sytuacji.
 */

class Vehicle {
    private String brand;
    private int year;


    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("org.example.questions1.Vehicle");
            System.out.println("Klasa: " + cls.getName());

            // Wyświetlanie konstruktorów
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            System.out.println("Konstruktory:");
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor.toString());
            }

            // Wyświetlanie metod
            Method[] methods = cls.getDeclaredMethods();
            System.out.println("Metody:");
            for (Method method : methods) {
                System.out.println(method.toString());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

