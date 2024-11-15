package recruitmentQuesetions;

/**
 * Java_008_why_constructors_are_needed.java
 *
 * Pytanie: Dlaczego potrzebujemy konstruktorów w Javie?
 * Odpowiedź:
 * Konstruktory w Javie są specjalnymi metodami klasy, które są wywoływane
 * podczas tworzenia nowego obiektu tej klasy. Służą do inicjalizacji nowo
 * tworzonych obiektów. Umożliwiają ustawienie początkowego stanu obiektu poprzez
 * przekazanie argumentów konstruktorowi. Bez konstruktora, nie byłoby możliwe
 * zapewnienie, że obiekt klasy ma odpowiedni stan zaraz po jego utworzeniu.
 * Konstruktory zapewniają kontrolę nad procesem tworzenia obiektów, co jest
 * kluczowe dla poprawnego funkcjonowania programu.
 */

class Person {
    // Definicja zmiennych instancyjnych klasy
    String name;
    int age;

    // Definicja konstruktora klasy Person
    public Person(String name, int age) {
        this.name = name; // Inicjalizacja zmiennej instancyjnej 'name'
        this.age = age; // Inicjalizacja zmiennej instancyjnej 'age'
    }


}

public class Java_009_why_constructors_are_needed {
    public static void main(String[] args) {
        // Tworzenie nowego obiektu klasy Person z użyciem konstruktora
        Person person = new Person("Jan", 30);

        // Wyświetlenie stanu obiektu person
        System.out.println("Nazwa: " + person.name + ", Wiek: " + person.age);
    }
}

/**
 * W tym kodzie definiujemy klasę Person, która posiada konstruktor umożliwiający
 * inicjalizację jej zmiennych instancyjnych 'name' i 'age' podczas tworzenia
 * nowego obiektu. Pokazuje to, jak konstruktory są wykorzystywane do nadawania
 * początkowego stanu obiektom. Dzięki temu, możemy zapewnić, że każdy obiekt
 * klasy Person jest poprawnie zainicjalizowany zgodnie z zadanymi parametrami
 * jeszcze przed jego użyciem w programie.
 */
