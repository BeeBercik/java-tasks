package lambdaExpressions.lambdaJakoComparator;

import java.util.Arrays;
import java.util.Comparator;

// lambda expresisons mozemy zastosowac wszedzie tam gdzie mozna przekazac zmienna o typie interejsu funkjcyjnego ktory rezprezentuje - mozna tez przekazac samo wyrazenie bez przypisywania go. Kompilator bedzie wiedzial, ze skroor wymagana jest implementacja jednej metody, to funkcja stworzona przez nas (nasza lambda) to jest wlasnie ta implementacja

// w tym wypadku interface Comparator ma wlsnie jedna abstr. metode - compare. Zamiast wiec tworzyc nowa klase implementujaca go i nadpisywac ta metode, mozemy bezposrednio przekazac do funkcji, ktora przyjmuje instancje (obiekt) klasy implementujaca interface Comparator wyrazenie lambda, wedlug ktorego bedziemy sortowac.

class NameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return String.valueOf(o1).length() - o2.toString().length();
    }
}

public class Main {
    public static void main(String[] args) {
        String[] names = {"Justyna", "Wera" , "Robert"};
        Arrays.sort(names, new NameComparator());

        for(String name : names) {
            System.out.println(name);
        }

//        BEZ COMPARATORA - WYRAZENIE LAMBDA
        String[] cars = {"Audi", "BMW", "Mercedes"};
        Arrays.sort(cars, (o1, o2) -> o1.length() - o2.length());

        for(String car : cars) {
            System.out.println(car);
        }

    }
}
