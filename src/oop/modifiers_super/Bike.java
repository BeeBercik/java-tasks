package oop.modifiers_super;

public class Bike {
    private int year;
    protected int wheels;
    protected String color;

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public Bike(int year) {
        this.year = year;
    }

    protected void set(int wheels, String color) {
        this.wheels = wheels;
        this.color = color;
    }
}
