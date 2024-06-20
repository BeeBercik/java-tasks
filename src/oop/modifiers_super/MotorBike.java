package oop.modifiers_super;

public class MotorBike extends Bike {
    public int power;

    public MotorBike(int year) {
        super(year);
    }

    public int getPower() {
        return this.power;
    }

    @Override
    public void set(int wheels, String color) {
        super.set(wheels, color);
        this.power = 200;
    }
}
