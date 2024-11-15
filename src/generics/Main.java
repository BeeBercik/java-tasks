package generics;

import java.util.ArrayList;

class Animal {
    protected String name;
    protected int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }
}

class Tiger extends Animal {
    Tiger(String name, int age) {
        super(name, age);
    }
}

class Zoo<E extends Animal> {
    private ArrayList<E> animals;

    Zoo() {
        this.animals = new ArrayList<E>();
    }

    public void addAnimal(E animal) {
        this.animals.add(animal);
    }

    public void printAllAnimals() {
        for(E animal : animals) {
            System.out.println(animal);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Zoo<Tiger> tigers = new Zoo<>();
        tigers.addAnimal(new Tiger("tygrysek", 3));
        tigers.addAnimal(new Tiger("tygrys duzy", 15));
        tigers.printAllAnimals();

        Zoo<Lion> lions = new Zoo<>();
    }
}
