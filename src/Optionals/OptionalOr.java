package Optionals;

// metoda .or() pelni role dostawcy, jesli w Optionalu jest null to dostarcza nowy pojemnik i kontynuowana jest praca
// Dla porownania orElse() zwraca podana przez nas wartosc

import java.util.Optional;

public class OptionalOr {
    public static void main(String[] args) {
        Optional<Integer> num = Optional.ofNullable(null);
        Optional<Integer> result = num.filter(i -> i < 10).or(() -> Optional.ofNullable(10));
        System.out.println(result); // byl null wiec stworzylo optional z 10
    }
}
