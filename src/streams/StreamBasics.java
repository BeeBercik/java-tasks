package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

// Strumienie sluza do iteracji i manipulacji danymi na kolekcjach - posiadaja metody ulatwiajace to
// Metody najczesciej jako argument przyjmmuja wyrazenie lambda

public class StreamBasics {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("robert");
        names.add("wera");
        names.add("lukasz");
        names.add("kita");

//        ---MEGA WAZNE---
//        Do metofy .filter() przekazujemy wyrazenie lambda, poniewaz oczekuje ona od nas argumentu typu Predicate<TYP ELEMENTOW>, czyli obiektu implementujacego interfejs funkcyjny Predicate, ktory posiada metode abstr. boolea test(n) przyjmujaca jeden argument (w tym wypadku sa to po kolei elementy w strumieniu podstawiane pod to n) i zwracajace wartosc boolean. Zamiast tego mozna wiec podstawic wyr. lambda, bo kompilator sam powiaze nasza funkcje z wymagana metoda test, ze jest to jej nasza implementacja
        names.stream().filter(el -> el.length() > 3 && el.length() < 5).forEach(el -> System.out.println(el));

//        lub z przypisaniem
        Stream<String> stream = names.stream().filter(el -> el.length() > 3 && el.length() < 5).filter(el -> el.startsWith("k"));
        stream.forEach(el -> System.out.println("\n" + el)); // nie uzywam .stream() bo to juz jest zmienna typu stream
//        Metoda Stream.of(...) umozliwia stworzeie strumienia z podanych elementow i np. przypisanie go
        Stream<Car> testStrea = Stream.of(new Car("Audi", 2020), new Car("BMW", 2015));
        System.out.println("--STREAM.OF--");
        testStrea.forEach(el-> System.out.println(el));

//        STREAMS METODY ULATWIAJA PRACE
        long num = names.stream().filter(el -> el.startsWith("k")).count();
        System.out.println("Imion na 'k' streamami: " + num);
//        VS
        int ile = 0;
        for(String name : names) {
            if(name.startsWith("k"))
                ile++;
        }
        System.out.println("Imion na 'k' normalnie: " + num);
    }
}
