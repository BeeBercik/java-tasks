package oop.more_constructors;

class Student {
    String name;
    String surname;
    String city;
    int age;

    public Student() {
        this.name = "unknown";
        this.surname = "unknown";
        this.city = "unknown";
        this.age = 0;
    }

    public Student(String givenName, String givenSurname,
                   String givenCity, int givenAge) {
        this.name = givenName;
        this.surname = givenSurname;
        this.city = givenCity;
        this.age = givenAge;
    }

    public void printBasicData() {
        System.out.println(this.name + ", " + this.surname + ", " + this.city + ", " + this.age);
    }
}

public class Main {
    public static void main(String[] args) {
           Student robert = new Student("Robert", "Kania", "Wadowice", 22);
           robert.printBasicData();

           Student newAdded = new Student();
           newAdded.printBasicData();
    }
}
