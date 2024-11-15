package oop.polimorfizm;

public class Residence extends House {
    float garageSize;

    public Residence(String street, String city,
                     float parcelSize, float garageSize) {
        super(street, city, parcelSize);
        this.garageSize = garageSize;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "garageSize=" + garageSize +
                ", parcelSize=" + parcelSize +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public float getGarageSize() {
        return garageSize;
    }

    public void setGarageSize(float garageSize) {
        this.garageSize = garageSize;
    }
}
