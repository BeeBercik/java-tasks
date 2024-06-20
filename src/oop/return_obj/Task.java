package oop.return_obj;

class Car {
    String model;
    String brand;
    String color;

    Car(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }
    String getColor() {
        return this.color;
    }
    void printInfo() {
        System.out.println("Model: " + this.model + ", marka: " + this.brand + ", kolor: " + this.color);
    }
}

class CarFactory {
    public Car buildCar() {
        String model = "Mustang";
        String brand = "Ford";
        String[] colors = {"red", "black", "white"};
        int nr = (int) Math.floor(Math.random() * 3);
        Car auto = new Car(model, brand, colors[nr]);

        return auto;
    }
}

public class Task {
    public static void main(String[] args) {
        CarFactory cf = new CarFactory();
        Car mustang1 = cf.buildCar();
        Car mustang2 = cf.buildCar();
        Car mustang3 = cf.buildCar();

        mustang1.printInfo();
        mustang2.printInfo();
        mustang3.printInfo();
    }
}