package MyTasks.interfVehicleStopStart;

// lekko zmodyfikowane bo za proste

interface Vehicle {
    Car start(String make, String color, String model, int year);
    void stop();
}

class Fabric implements Vehicle {
//    obie metody moglyby byc statyczne - wygodniej, ale w zadaniu ze maja byc z interfejsu a statyczne metody w interfejsie musza miec cialo - wole tak
    public Car start(
            String make, String color, String model, int year
    ) {
        System.out.println("Produkcja samochodu.");
        return new Car(make, color, model, year);
    }

    public void stop() {
        System.out.println("Koniec produkcji.");
    }
}

public class Car {
    private String make;
    private String color;
    private String model;
    private int year;

    public Car(String make, String color, String model, int year) {
        this.make = make;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Fabric fabric = new Fabric();
        System.out.println(fabric.start("Audi", "black", "A6", 2020));
        fabric.stop();
    }
}
