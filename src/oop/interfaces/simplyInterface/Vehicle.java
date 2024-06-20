package oop.interfaces.simplyInterface;

public interface Vehicle {
    public static final String NAME = "Pojazd";

    public default void printHi() {
        System.out.println("Hi!!");
    }

    public abstract void setAge(int age);
    public abstract String getName();
}
