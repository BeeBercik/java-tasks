package Collections;

// W TreeSet aby umozliwic porownywanie elementow trzeba dostarczyc wlasny komparator

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class AnimalElement {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public AnimalElement(String name) {
        this.name = name;
    }
}

class AnimalComparator implements Comparator<AnimalElement> {
    @Override
    public int compare(AnimalElement o1, AnimalElement o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class TreeSetObjects {
    public static void main(String[] args) {
        TreeSet<AnimalElement> animals = new TreeSet<>(new AnimalComparator());
        animals.add(new AnimalElement("Lion"));
        animals.add(new AnimalElement("Dog"));
        animals.add(new AnimalElement("Lion"));

        Iterator<AnimalElement> iterator = animals.iterator();
//        Functions.iter(iterator);
    }
}
