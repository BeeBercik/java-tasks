package streams;

import java.util.ArrayList;

// zlicza elementy w strumieniu

public class CountMethod {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 2016));
        cars.add(new Car("Opel", 2013));
        cars.add(new Car("Volks", 2020));
        cars.add(new Car("Kia", 2010));

//        po najechaniu na metode widac, ze zwraca typ long
        long howMuch = cars.stream().filter(el -> el.year > 2013).count();
        System.out.println(howMuch);

        int howMuchInt = (int) cars.stream().filter(el -> el.year > 2013).count();
        System.out.println(howMuchInt);
    }
}
