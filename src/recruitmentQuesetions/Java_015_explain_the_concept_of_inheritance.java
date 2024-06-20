package org.example.questions1;

/**
 * Pytanie: Wyjaśnij koncepcję dziedziczenia.
 * Odpowiedź:
 * Dziedziczenie jest jednym z fundamentalnych mechanizmów programowania
 * obiektowego, pozwalającym na tworzenie nowej klasy na podstawie istniejącej klasy.
 * Nowa klasa, zwana klasą pochodną (lub podklasą), dziedziczy atrybuty i metody klasy
 * bazowej (lub nadklasy), umożliwiając ponowne wykorzystanie kodu, rozszerzanie
 * funkcjonalności oraz ułatwiając zarządzanie kodem. Dziedziczenie wspiera również
 * polimorfizm, co pozwala na traktowanie obiektów klas pochodnych jako obiektów klasy
 * bazowej.
 */

// Klasa bazowa
class Person3 {
    String name;
    int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Nazwa: " + name + ", Wiek: " + age);
    }
}

// Klasa pochodna rozszerzająca klasę Person3
class Employee3 extends Person3 {
    int id;

    public Employee3(String name, int age, int id) {
        super(name, age); // Wywołanie konstruktora klasy bazowej
        this.id = id;
    }

    // Rozszerzenie metody displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo(); // Wywołanie metody z klasy bazowej
        System.out.println("ID: " + id);
    }
}

public class Java_015_explain_the_concept_of_inheritance {
    public static void main(String[] args) {
        Employee3 employee = new Employee3("Jan Kowalski", 30, 101);

        // Wyświetlenie informacji o obiekcie klasy pochodnej
        employee.displayInfo();
    }
}

/**
 * Kod ten demonstruje użycie dziedziczenia w Javie poprzez rozszerzenie klasy Person
 * do nowej klasy Employee, która dziedziczy pola i metody klasy Person i dodaje nowe
 * pole `id` oraz modyfikuje metodę displayInfo. Dzięki temu, Employee zachowuje cechy
 * klasy Person, jednocześnie rozszerzając jej funkcjonalność. Jest to przykład, jak
 * dziedziczenie umożliwia efektywne ponowne wykorzystanie i organizację kodu.
 */
