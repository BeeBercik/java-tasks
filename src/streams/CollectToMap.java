package streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Tworzy mape z elementow strumienia z kolekcji (klucz -> wartosc)

public class CollectToMap {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 2016));
        cars.add(new Car("Opel", 2013));

//        jako ze mapa sklada sie z klucz - wartosc, musimy wskazac wyrazeniem lambda co ma byc kluczem , a co wartoscia
        Map<String, Car> carMap = cars.stream()
                .collect(Collectors.toMap(car -> car.make, car -> car));

        System.out.println(carMap.get("Audi"));

//        z ogolnego Map mozna stworzyc HashMap
        HashMap<String, Car> carHashMap = new HashMap<>(carMap);
        System.out.println(carHashMap.get("Audi"));
    }
}
