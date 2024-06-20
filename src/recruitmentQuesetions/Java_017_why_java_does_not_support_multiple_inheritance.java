package org.example.questions1;
/**
 * Pytanie: Dlaczego Java nie obsługuje wielokrotnego dziedziczenia?
 * Odpowiedź:
 * Java nie obsługuje wielokrotnego dziedziczenia dla klas w celu uniknięcia
 * problemu diamentowego (problem diamentu), który występuje, gdy dwie klasy
 * dziedziczą z tej samej klasy bazowej, a następnie inna klasa próbuje dziedziczyć
 * od obu tych klas. To może prowadzić do niejednoznaczności, np. w przypadku, gdy
 * obie klasy pochodne mają metodę o tej samej sygnaturze. Aby rozwiązać ten problem
 * oraz uczynić system typów w Javie bardziej zrozumiałym i łatwiejszym do zarządzania,
 * Java pozwala na wielokrotne dziedziczenie tylko interfejsów, a nie klas.
 * JA
 * No bo gdybysmy mieli dwie klasy dziedziaczace po jednej i w 3 klasie dziedziczyli z tych 2 no to de * facto mamy wszystko takie samo, mmetody i wlasciwosci powielaja sie w obu tych klasach. Wiec gdyby  * przyszlo odwolac sie do super.metoda() to z ktorej klasy ma byc wykonana metoda??
 */

// Przykład klasy z innego tematu niż wcześniej używane, pokazujący unikatowe zastosowanie

class Vehicle {
    public void move() {
        System.out.println("Pojazd się porusza");
    }
}

interface WaterTransport {
    void sail();
}

// Klasa Boat dziedziczy funkcjonalność klasy Vehicle i implementuje interfejs WaterTransport
class Boat extends Vehicle implements WaterTransport {
    public void sail() {
        System.out.println("Łódź żegluje");
    }
}

public class Java_017_why_java_does_not_support_multiple_inheritance {
    public static void main(String[] args) {
        Boat myBoat = new Boat();
        myBoat.move(); // Dziedziczone z klasy Vehicle
        myBoat.sail(); // Implementowane z interfejsu WaterTransport

        System.out.println("Demonstracja uniknięcia problemu diamentowego w Javie przez " +
                "ograniczenie do jednokrotnego dziedziczenia klas i wielokrotnego dziedziczenia interfejsów.");
    }
}

/**
 * Ten kod pokazuje, jak Java radzi sobie z koncepcją wielokrotnego dziedziczenia poprzez
 * ograniczenie dziedziczenia klas do pojedynczej linii hierarchii (jednokrotne dziedziczenie)
 * i umożliwienie wielokrotnego dziedziczenia poprzez implementowanie interfejsów. Klasa Boat
 * dziedziczy metody klasy Vehicle i jednocześnie implementuje metody z interfejsu WaterTransport,
 * demonstrując, jak Java zapobiega problemom związanym z wielokrotnym dziedziczeniem klas.
 */
