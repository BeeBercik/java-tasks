package Collections.Iterators;

// Moze przechowywac rozne klucze/wartosci, ale wszystko jest konwertowane na ich odpowiedniki obiektowe
// np 2 (int) -> Integer
// Cos w stylu { "klucz" => "wartosc" } w php, klucze unikalne

// Przechowuje elementy w losowej kolejnosci

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class HashMapIterator {
    public static void main(String[] args) {
        HashMap<String, Animal> map = new HashMap<>();
        map.put("Dog", new Animal("Dog"));
        map.put("Cat", new Animal("Cat"));

//        IMO najprostszy sposob
//        Tworzymy iterator, ktory bedzie operowal na zbiorze obiektow typu Map.Entry (par klucz-wartosc, gdzie klucz bedzie Stringiem a wartosv obj. Animal) dlatego na kolekcji uzywamy metody entrySet(), ktora zwraca wlasnie te obiekty typu Map.Entry, a na koniec na zbiorze tych obiektow wywolujemy metode .iterator(), aby to wlasnie na nich utworzyc nasz operator i na nich operowac - tych obj/parach klucz-wartosc
        Iterator<Map.Entry<String, Animal>> i = map.entrySet().iterator();
        while(i.hasNext()) {
            Map.Entry<String, Animal> currEl = i.next(); // obecny element jest typu Map.Entry czyli para klucz-wartosc, gdzie klucz jest String a wartosc obj Animal
            String keyValue = currEl.getKey();
            Animal val = currEl.getValue();
        }

//        Tu przyklad z RZUTOWANIEM
//        Iterator i = map.entrySet().iterator();
//        while(i.hasNext()) {
//            Map.Entry entry = (Map.Entry) i.next();
//            String key = (String) entry.getKey();
//            Animal value = (Animal) entry.getValue();
//
//            System.out.println(key + " -> " + value);
//        }

        System.out.println(map);
//        Aby wejsc do konkretnego "wiersza"/pary klucz-wartosc uzywamy

//        Tu tak samo - przechodzimy po parach klucz-wartosc w kolekcji dlatego wskazujemy na typ Map.Entry elementu (oraz String klucza i Animal zawartosci pod tym kluczem) a zeby w ogole uzyskac dostep w ten sposob do tych elementow to na kolekcji uzywamy metody entrySet(), ktorwa wlasnie zwaraca zbior obiektow typu Map.Entry w postaci wlasnie par
        for(Map.Entry<String, Animal> el : map.entrySet()) {
            String key = el.getKey();
            Animal value = el.getValue();
            System.out.println(key + " - " + value);
        }

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Robert", 22);
        ages.put("Wera", 23);
        System.out.println(ages.get("Wera")); // 23
    }
}
