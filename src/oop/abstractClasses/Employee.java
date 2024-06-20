package oop.abstractClasses;

// Klasy abstrakcyjne sluza jako szablony dla klas dziedziczacych po nich. Nie mozna stworzyc obiektu takiej klasy!

// Nie musi posiadac zadnych metod abstrakcyjnych!
// Moze rowniez zarowno abstrakcyjne jak i z cialem metody

public abstract class Employee {
    protected String name;
    protected String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public abstract String toString();
}
