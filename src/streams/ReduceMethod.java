package streams;

import streams.Car;

import java.util.ArrayList;

// sluzy do redukowania elementów strumienia do jednego wyniku

public class ReduceMethod {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 2016));
        cars.add(new Car("Opel", 2013));
        cars.add(new Car("Volks", 2020));
        cars.add(new Car("Kia", 2010));

//        1 argument metody reduce to wartosc poczatkowa, do ktorej beda dodawane kolejne sumy iteracji, druga to funkcja redukujaca lambda (pierwszy argument to suma z poprzednich iteracji i aktualny element - przechodzac po kolejnych elementach (car) w kazdej iteracji dodajemy rok produkcji do argumentu subtotal), trzeci to operacja redukowania - referencja do wbudowanej metody sumowania w Integer
        int howMuchYears = cars.stream().reduce(0, (subtotal, car) -> subtotal + car.year, Integer::sum);
        System.out.println(howMuchYears);
    }
}
