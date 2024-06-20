package homework.option2;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    private String make;
    private String model;
    private String color;
    private int year;

    Car(String made, String model, String color, int year) {
        this.make = made;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public void start() {
        System.out.println("Autko " + this.toString() + " jedzie brum brum.");
    }

    @Override
    public void stop() {
        System.out.println("Autko " + this.toString() + " sie zatrzymuje prrr.");
    }

    @Override
    public String toString() {
        return "Marka: " + this.make + ", model: " + this.model + ", kolor: " + this.color +
                ", rok produkcji: " + this.year;
    }
}

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "A6", "Black", 2020);
        audi.start();
        audi.stop();

        System.out.println();

        Car bmw = new Car("BWM", "320d", "White", 2022);
        bmw.start();
        bmw.stop();
    }
}
