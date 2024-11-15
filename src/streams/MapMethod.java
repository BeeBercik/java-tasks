package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Metoda map widzi ile jest elementow i przechodzu po kazdym, np jest 1 to raz, 3 to trzy razy (po kazdym)
// metoda przechodzi po kazdym elemencie i wykonuje na nim przekazana w niej metode jako referencje tj. .map(Car::getYear). W wyniku tego nasz strumien (stworzony na arrayliscie) nie zawiera juz obiektow Car, lecz ich ceny pobrane przez wlasnie metode map.
// Na koniec standardowo zbieramy wynik mtoda Collect i np rzucamy do listy

public class MapMethod {
    public static void main(String[] args) {
//        NORMALNIE
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 2016));
        cars.add(new Car("Opel", 2013));

        List<Integer> carList = new ArrayList<>();
        for(Car car : cars) {
            carList.add(car.year);
        }
        carList.forEach(el -> System.out.println("Wypisano standardowym sposobem: " + el));

//        metoda map nie przyjmuje metody statycznej (czy tez zmiennych uzywajac wyrazenia lambda) bo przechodzi przez kazdy element (obiekt) i na nim wykonuje dana metode, wywoluje z niego. A statyczne emtody dotycza klas dlatego bylby blad.

//    NIENORMALNIE XD - METODA MAP (w sposob referencyjny przekazana metoda)
        List<Integer> years1 = cars.stream().map(Car::getYear).collect(Collectors.toList());
//        lub jako lambda - na kazdym elemencie/obiekcie pobiera jego zmienna
        List<Integer> years2 = cars.stream().map(car -> car.year).collect(Collectors.toList());
        years1.forEach(el -> System.out.println("Wypisano stream().map(): " + el));
    }
}
