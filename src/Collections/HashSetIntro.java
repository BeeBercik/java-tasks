package Collections;

// Posiada unikalne elementy w losowej kolejnosci
// Przydatne gdy nie intneresuje nas kolejnosc tylko np sprawdzamy czy cos jest w zbiorze, mozemy to usunac itd


import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;


class Car {
    String name;

    Car(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name;
    }

//    JESLI CHCEMY POROWNAC OBIEKTY CZY TAKIE SAME
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class HashSetIntro {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        hash.add("Ola");
        hash.add("Kasia");
        hash.add("Daniel");
        hash.add("Ola");
        hash.add("Kasia");
        hash.add("Adam");

        System.out.println(hash);

        HashSet<Car> cars = new HashSet<>();
        cars.add(new Car("Dodge"));
        cars.add(new Car("Citroen"));
        cars.add(new Car("Opel"));
        cars.add(new Car("Opel"));

        Iterator<Car> iterator = cars.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
