package streams;

import java.util.stream.Stream;

// Sluzy do generowania strumienia elementow (nie pojedynczej wartosci), ma 2 artumenty: 1 - wartosc poczatkowa, 2 - funkcja generujaca/obliczajaca kolejne elementy na podstawie poprzedniego. Kolejne obliczone wartosci sa zwracane do strumienia - ksazdy jest dostepny.

// Nalezy wiec ograniczyc wykonanie takiej metody tworzacej elementy metoda limit(), lub jako 2 argument dac wyrazenie lambda zwracajace boolean - warunek.

public class IterateCreateStreams {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.iterate(0, x -> x + 1).limit(10);
//        ^UP^ - 0 -> 1 -> 2 ... -> 9 (bo 10x sie wykona od 0) i kazdy element jest zwracany do strumienia
        numbers.forEach(el -> System.out.println(el));

//        w srodku dayn warunek do kiedy ma sie wykonywac iteracja
        Stream<String> letters = Stream.iterate("", x -> x.length() <= 3, x -> x + "a");
        letters.forEach(x -> System.out.println(x));
    }
}
