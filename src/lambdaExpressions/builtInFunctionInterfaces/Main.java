package lambdaExpressions.builtInFunctionInterfaces;

import java.util.ArrayList;
//import java.util.function.Predicate;
// nie trzeba importowac, po najechaniu na funkcje pisze jakiego interfejsu z funkc. abstr uzywa i podaje jego sciezke -  w tym wypadku jesli metoda interf. Predicate zworci true to usunie element

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("merc");
        cars.add("audi");
        cars.add(null);
        cars.add("mbw");

        cars.removeIf((e) -> e == null); // metoda interf. zwaraca boolean a my tworzymy cialo kiedy co zwraca
        for(String car : cars) {
            System.out.println(car);
        }
    }
}
