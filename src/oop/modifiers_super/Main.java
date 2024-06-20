package oop.modifiers_super;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike(2020);

        MotorBike motorbike = new MotorBike(2015);
        motorbike.set(3, "red");
        System.out.println(motorbike.getWheels());

    }
}
