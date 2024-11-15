package oop.hashCodeEqualsVsComparatorAble;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bike> bikes = new ArrayList<>();
        bikes.add(new Bike("GIANT", "black", 2));
        bikes.add(new Bike("SCOTT", "red", 2));
        bikes.add(new Bike("ROMET", "blue", 2));
        bikes.add(new Bike("SCOTT", "white", 2));

        Set<Bike> bikesSet = bikes.stream().collect(Collectors.toSet());
        bikesSet.forEach(el -> System.out.println(el));
    }
}
