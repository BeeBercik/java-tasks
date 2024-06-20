package oop.interfaces.simplyInterface;

public class Car implements Vehicle {
    public int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return Vehicle.NAME;
    }

    @Override
    public void printHi() {
        System.out.println("Hello!");
    }
}
