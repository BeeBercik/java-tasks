package homework.personComparator;

//Napisz klasę homework.personComparator.Person zawierającą: imię, nazwisko i wiek osoby. W funkcji głównej utwórz tablicę (lub listę) obiektów klasy homework.personComparator.Person, wypisz ją,
// a następnie posortuj wg imienia, nazwiska i wieku. Po każdym sortowaniu Wypisz zawartość tablicy. Napisz funkcję sortującą
// sort(homework.personComparator.Person[] array, Comparator<homework.personComparator.Person> comparator) (podobnie jak w zadaniu 1, tym razem Comparator porównuje obiekty typu homework.personComparator.Person).

import java.util.Arrays;
import java.util.Comparator;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "homework.personComparator.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void sort(Person[] array, Comparator<Person> comparator) {
        Arrays.sort(array, comparator);
    }

    public static void main(String[] args) {
        Person[] people = {
                new Person("Jan", "Kowalski", 25),
                new Person("Anna", "Nowak", 30),
                new Person("Marek", "Zalewski", 22)
        };

        System.out.println("Przed sortowaniem:");
        printPeople(people);

        sort(people, Comparator.comparing(Person::getFirstName));
        System.out.println("\nPo sortowaniu wg imienia:");
        printPeople(people);

        sort(people, Comparator.comparing(Person::getLastName));
        System.out.println("\nPo sortowaniu wg nazwiska:");
        printPeople(people);

        sort(people, Comparator.comparingInt(Person::getAge));
        System.out.println("\nPo sortowaniu wg wieku:");
        printPeople(people);
    }

    private static void printPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
