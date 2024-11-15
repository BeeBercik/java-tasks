package Optionals;

import java.util.Optional;

// Map widzi, ile jest elementow na zmiennej, na ktorej ja wykonujemy (ta metode) i po kazdym elemencie przechodzi stosujac nasze przeksztalcenia
// Jesli jest null pod optionalem to sie nie wykona, tylko zwroci pustego Optional.empty

// OrElse() - jesli pod elementem na ktroym wykonaa jest zanjduje sie jakas wartosc to ja zwraca i mozna ja np wyswietlic, gdy nie ma wartosci - jest null to zwraca przekazany do niej parametr "defaultowy"

public class OptionalMapOrElse {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("Robert");
        Optional<String> modified = name.map(el -> el.toUpperCase());
        System.out.println(modified);
        System.out.println(modified.get());

        Optional<Integer> num = Optional.ofNullable(null);
        num = num.map(i -> i * 2);
        //System.out.println(num.get()); // wyjatek [...]No value present
//        gdyby bylo null to nie rzucaj wyjatku tylko zwroc domyslna wartosc
        System.out.println(num.orElse(100));

//        Jako ze .map() zwraca optionala to mozna kilka razy wykonywac
        Optional<Integer> many = Optional.ofNullable(20);
        many.map(i -> i * 5).map(i -> i * 10).ifPresent(el -> System.out.println(el));
    }
}
