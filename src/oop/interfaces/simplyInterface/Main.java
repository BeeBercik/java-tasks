package oop.interfaces.simplyInterface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setAge(10);
        System.out.println(car.getAge());
        car.printHi();
        System.out.println(Vehicle.NAME);
    }
}
