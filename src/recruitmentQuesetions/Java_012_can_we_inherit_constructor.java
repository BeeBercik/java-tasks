package org.example.questions1;

/**
 *
 * Pytanie: Czy możemy dziedziczyć konstruktor?
 * Odpowiedź:
 * W Javie, konstruktory nie są dziedziczone. Każda klasa musi zdefiniować własne
 * konstruktory. Gdy tworzymy obiekt klasy potomnej, konstruktor klasy bazowej
 * może być wywołany za pomocą słowa kluczowego 'super'. To pozwala na inicjalizację
 * stanu dziedziczonego z klasy bazowej. Jednakże, nie jest to dziedziczenie
 * konstruktora w sensie dosłownym, ale raczej wywołanie konstruktora klasy
 * bazowej z konstruktora klasy potomnej.
 */

class Person2 {
    String name;

    public Person2(String name) {
        this.name = name;
        System.out.println("Konstruktor Person: " + name);
    }
}

class Employee extends Person2 {
    int id;

    public Employee(String name, int id) {
        super(name); // Wywołanie konstruktora klasy bazowej
        this.id = id;
        System.out.println("Konstruktor Employee: " + name + ", " + id);
    }
}

public class Java_012_can_we_inherit_constructor {
    public static void main(String[] args) {
        // Tworzenie nowego obiektu klasy Employee
        Employee employee = new Employee("Jan Kowalski", 101);

        // Wyświetlenie stanu obiektu employee
        System.out.println("Nazwa: " + employee.name + ", ID: " + employee.id);
    }
}

/**
 * W tym kodzie definiujemy klasę Person z konstruktorem przyjmującym parametr name
 * oraz klasę Employee, która rozszerza klasę Person. Konstruktor klasy Employee
 * wywołuje konstruktor klasy Person za pomocą 'super(name)', co jest przykładem
 * wywołania konstruktora klasy bazowej, a nie dziedziczenia konstruktora. Pokazuje
 * to, jak w Javie inicjalizujemy stan obiektu klasy bazowej, tworząc obiekt klasy
 * potomnej. Jest to kluczowe dla zrozumienia, jak działa dziedziczenie i inicjalizacja
 * w Javie.
 */
