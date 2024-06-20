package streams;

import java.util.ArrayList;
import java.util.List;

// metoda .toList() wykonana na strumeinu (obiekcie klasy importujace interface Stream) umozliwia zapisanie wyniku np. filtrowania do OGOLNEJ LISTY, ktora pozniej moze zostac przekazana do konstruktora innej kolekcji np. ArrayList

// metoda .collect() zbiera elementy strumienia do kolekcji do bobojetne jakiej kolekcji (jako argument korzystajac z metody intrerfejsu Collectors np toList())

public class CollectToListMethod {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("robert");
        names.add("wera");
        names.add("lukasz");
        names.add("kita");

//        STARE - SET trzeba w ten sposob
//        List<String> list  = names.stream().filter(el -> el.length() > 4).collect(Collectors.toList());
        List<String> list  = names.stream().filter(el -> el.length() > 4).toList();
        list.forEach(el -> System.out.println(el)); // wypisuje bo to normalna (ogolna) kolekcja

        ArrayList<String> myNames = new ArrayList<>(list); // przekazanie do konstr
        myNames.forEach(name -> System.out.println(name));
    }
}
