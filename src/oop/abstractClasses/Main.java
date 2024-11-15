package oop.abstractClasses;

public class Main {
    public static void main(String[] args) {
        Employee programmer = new Programmer("imie", "nazwisko", "jezyki");
        System.out.println(programmer.toString());
        programmer.setName("dupa");
        System.out.println("Metoda z klasy abstr.: " + programmer.getName());
    }
}
