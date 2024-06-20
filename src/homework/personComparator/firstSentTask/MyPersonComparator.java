package homework.personComparator.firstSentTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MyPersonComparator {
    String name;
    String surname;
    int age;

    MyPersonComparator(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyPersonComparator{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    static void sort(ArrayList<MyPersonComparator> persons, Comparator<MyPersonComparator> comparator) {
        Collections.sort(persons, comparator);

        for(MyPersonComparator person : persons) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        ArrayList<MyPersonComparator> persons = new ArrayList<>();
        persons.add(new MyPersonComparator("Robert", "Kania", 21));
        persons.add(new MyPersonComparator("Weronika", "Kozik", 22));
        persons.add(new MyPersonComparator("Karol", "Woznicki", 20));

        Iterator<MyPersonComparator> iterator = persons.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        //            ------ UZYCIE COLLESTIONS.SORT -----
//        System.out.println("Posortowane Collections.sort()");
//        Collections.sort(persons, new Comparator<MyPersonComparator>() {
//            @Override
//            public int compare(MyPersonComparator o1, MyPersonComparator o2) {
//                return Integer.compare(o1.age, o2.age);
//            }
//        });
//
//        for(MyPersonComparator person : persons) {
//            System.out.println(person);
//        }


//            ------ UZYCIE MOJEGO SORT -----
//   -- de facto to samo co wyzej tylko w odzielnej metodzie --
        Comparator<MyPersonComparator> comparator = new Comparator<MyPersonComparator>() {
            @Override
            public int compare(MyPersonComparator o1, MyPersonComparator o2) {
                return Integer.compare(o1.age, o2.age);
            }
        };

        System.out.println("Sortowanie wlasna metoda sort z wypisaniem");
        MyPersonComparator.sort(persons, new Compik());
    }
}

//zamiast anonimowej klasy (przypisanie jej do zmiennej comparator) mozna stworzyc osobna klas,e nadpisac wymagana metode compare i przekazac jej obiekt
class Compik implements Comparator<MyPersonComparator> {
    @Override
    public int compare(MyPersonComparator o1, MyPersonComparator o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
