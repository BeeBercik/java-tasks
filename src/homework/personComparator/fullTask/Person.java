package homework.personComparator.fullTask;

import java.util.Arrays;
import java.util.Comparator;

public class Person {
    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    static class AgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.age, o2.age);
        }
    }

    static class NameComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public static void main(String[] args) {
        Person[] persons = {
                new Person("robert", "kania", 21),
                new Person("wera", "kozik", 22),
                new Person("kamil", "rydzik", 20)};

        System.out.println("--DEFAULT tablica--");
        for(Person person : persons) {
            System.out.println(person);
        }

        Arrays.sort(persons, new Person.AgeComparator());
        System.out.println("\n---Posortowana po wieku (age)--");
        for(Person person : persons) {
            System.out.println(person);
        }

        Arrays.sort(persons, new Person.NameComparator());
        System.out.println("\n---Posortowana po imieniu (name)--");
        for(Person person : persons) {
            System.out.println(person);
        }
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.surname.compareTo(o2.surname);
            }
        });
        System.out.println("\n---Posortowana po nazwisku (surname)--");
        for(Person person : persons) {
            System.out.println(person);
        }

    }
}
