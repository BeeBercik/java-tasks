package streams;

import java.util.ArrayList;

// ogranicz ilosc elementow

public class LimitMethod {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 2016));
        cars.add(new Car("Opel", 2013));
        cars.add(new Car("Volks", 2020));
        cars.add(new Car("Kia", 2010));

        cars.stream().limit(2).forEach(el -> System.out.println(el));
    }
}
