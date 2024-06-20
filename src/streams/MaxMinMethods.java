package streams;

import java.util.ArrayList;
import java.util.Comparator;

public class MaxMinMethods {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 2016));
        cars.add(new Car("Opel", 2013));
        cars.add(new Car("Volks", 2020));
        cars.add(new Car("Kia", 2010));

//        z uzyciem lambdy - sami wskazujemy po czym ma porownywac, dziala podobnie jak compare Comparatora, compareTo Comparable. Jesli obecny obiekt ma wieksza wartosc to zwraca jeden (wart. dodatn), gdy drugi to -1 (ujemna)
        Car maxYearCar = cars.stream().max((car1, car2) -> car1.year > car2.year ? 1 : -1).get();
        System.out.println(maxYearCar);

//        podobnie jak compare, czy taki max. Jesli pierwszy element jest mniejszy to zwraca jeden, inaczej -1
        Car minYearCar = cars.stream().min((car1, car2) -> car1.year > car2.year ? 1 : -1).get();
        System.out.println(minYearCar);

//        z comparatorem
        Car maxYearCarComparator = cars.stream().max(new CarComparator()).get();
        System.out.println(maxYearCarComparator);

//        z comparable - klasa car zawiera juz metode porownujace jej obiekty, wiec przekazujemy do max() metode statyczna Comparatora naturalOrder(), ktory wskazuje ze obiekty maja zostac porownane w sposob naturalny, np liczby rosnaco, a obiekty ktore maja metode wskazujaca jak je porownac beda wlasnie na jej podstawie
        Car maxYearCarComparable = cars.stream().max(Comparator.naturalOrder()).get();
        System.out.println(maxYearCarComparable);

    }
}

class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.year - o2.year;
    }
}
