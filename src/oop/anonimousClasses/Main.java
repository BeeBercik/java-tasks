package oop.anonimousClasses;

// Jest to tworzenie instancji klasy bez nazwy "w locie", bez tworzenia osobnej klasy. Przypisuje sie ja do zmiennej, za pomoca ktorej pozniej mozna wywolywac np metody.
// Stosuje sie taki zapis do tworzenia klas anonimowych rozszerzajacych klasy abstrakcyjne luz interfejsow

abstract class Animal {
    abstract void makeSound();
}

public class Main {
    public static void main(String[] args) {
//        typ to nazwa klasy abstr/interfejsu | nazwa zmiennej przechow. klase anonim | = | new (bo instancje tworzymy) | nazwa klasy abstr.interf
        Animal animal = new Animal() {
            @Override
            void makeSound() {
                System.out.println("HAU HAU");
            }
        };
        animal.makeSound(); // HAU HAU
    }
}
