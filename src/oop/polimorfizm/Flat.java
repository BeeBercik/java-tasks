package oop.polimorfizm;

public class Flat {
    String city;
    String street;

    Flat() {}

    Flat(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
