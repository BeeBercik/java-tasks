package Optionals;

import java.util.Optional;

// Optional to taki pojemnik na dane.
// Optional umozliwia unikniecia wyjatku gdy chce przeprowadzic operacje na danych kiedy te maja wartosc null. Z optional mozna sprawdzic czy sa one null zanim cos sie na nich wykona

public class OptionalBasics {
    public static void main(String[] args) {
//        metoda Optional.of() nie moze przyjac null
        Optional<String> op1 = Optional.of("test");
//        Optional<String> op2 = Optional.of(null); // blad
        System.out.println(op1.get());

//        ofNullable() moze przyjac jakas wartosc oraz null i zwraca optional z czyms lub pusty
        Optional<String> op3 = Optional.ofNullable("cos");
        Optional<String> op4 = Optional.ofNullable(null); // zwraca pusty optional
        System.out.println(op3); // Optional[cos] wiec pobieramy wartosc get'em
        System.out.println(op3.get());
        System.out.println(op4); // Optional.empty

//        zwraca pusty optional
        Optional<String> op5 = Optional.empty();
        System.out.println(op5);

        Integer integer = Integer.valueOf(10);
//        integer = null;
        Optional<Integer> opInt = Optional.ofNullable(integer);
        if(opInt.isPresent()) // sprawdza czy jest cos w pojemniku niz null
            System.out.println(opInt.get());
        else
            System.out.println("opInt jest nullem");

//        skrotowy zapis, jesli optional zawiera nie null to mozna przekazac lambde
        opInt.ifPresent(i -> System.out.println(i));
    }
}
