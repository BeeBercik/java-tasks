package MyTasks.personComparator;

import java.util.Arrays;
import java.util.Comparator;

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.age - p2.age;
    }
}

public class Person {
    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static void sort(Person[] array, Comparator<Person> comparator) {
        Arrays.sort(array, comparator);
        Person.printPersons(array);
    }

    public static void printPersons(Person[] array) {
        for(Person person : array) {
            System.out.println("Name: " + person.name + " surname: " + person.surname + " age: " + person.age);
        }
    }

    public static void main(String[] args) {
        Person[] array = new Person[3];
        array[0] = new Person("Robert", "Alterio", 22);
        array[1] = new Person("Weronika", "Kozik", 35);
        array[2] = new Person("Anna", "Boboch", 25);

        System.out.println("Sortowanie po imieniu");
        Person.sort(array, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println("\nSortowanie po nazwisku");
        Person.sort(array, new Person.SurnameComparator());

        System.out.println("\nSortowanie po wieku - rosnaco");
        Person.sort(array, new AgeComparator());
    }

//    statyczna bo uzywam jej w metodzie statycznej i nie mialbym inaczej dostepu
    static class SurnameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.surname.compareTo(p2.surname);
        }
    }
}
