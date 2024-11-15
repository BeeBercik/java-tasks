package generics.genericClass;

// Typy generyczne pozwalaja uzyskac wieksza elastycznosc kodum np w tym wypadku instancja klasy Car moze zawierac rozne wartosci np String i int jak tutaj, ale rowniez mozemy stowrzyc nowy obiekt, ktorego wlasciwosci przyjma wartosci String i Float

// Umozliwiaja nam przechowanie w klasie/obiekcie klasy typu ktory sami wskazemy - wieksze mozliwosci

// Typy generyczne przedsatwiaja obiekty np Integer, Double itd - nie typy proste
class Car<T, U> {
    T price;
    U model;

    Car(T price, U model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model=" + model +
                '}';
    }

    public T getPrice() {
        return this.price;
    }
}

public class Example1 {

    public static void main(String[] args) {
        Car<Integer, String> car = new Car<>(2000, "Fiat");
        System.out.println(car);
        System.out.println("Cena: " + car.getPrice());
    }
}
