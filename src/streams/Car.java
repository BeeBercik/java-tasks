package streams;

public class Car implements Comparable<Car> {
    String make;
    int year;
    static int price;

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                '}';
    }

    public int getYear() {
        return year;
    }

    public static void setPirce(int price) {
        Car.price = price;
    }

    public static int getPrice() {
        return Car.price;
    }

    @Override
    public int compareTo(Car o) {
        return this.year - o.year;
    }
}