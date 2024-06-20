package Collections;

// kolekcja arrayList umowzliwia swobodne dodawanie, usuwanie i przeslananie
// elementow kolekcji podczas gdy tablice maja z gory okreslona dlugosc
// i nie mozna na nich tak latwo operowac (trzeba zmieniac rozmiar i przekopiowywac..)

// mozna dodac na koncu (add()) lub podac index w ktorym miejscu

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntroduction {
    public static void main(String[] args) {
//        kolekcja ArrayList bez podanego typu
        ArrayList tab = new ArrayList();
        tab.add("aha"); // domyslnie add dodaje na koniec kolekcji
        tab.add(1); // mozna bez rzutowania bo samo przeksztalca na Integer/String/Object (nie typy proste)
        tab.add(Integer.valueOf(10)); // lub z rzutowaniem
        tab.remove(1);
        System.out.println(tab);

        String el = (String) tab.get(0); // pobranie  elementu - jesli kolekcja bez podanego typu to trzeba rzutowac gdyz zwraca object
        System.out.println(el);
        System.out.println(tab.contains(2)); // zwraca true/false czy zawiera el
        System.out.println(tab);

        ArrayList<String> names = new ArrayList<>();
        names.add("robert");
        String namedEl = names.get(0); // kolekcja nadanegio typu nie treba rzutowac bo zwaraca od razu typ
        System.out.println(namedEl);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(1);
        Collections.sort(nums); // sortowanie metoda statyczna klasy Collections
        nums.add(0, 10); // z podaniem idnexu dodaje i przesuwa reszte
        System.out.println(nums);
        nums.set(2, 123); // przesloniecie 2 na 2 indnexie 123

        for(Integer num: nums) {
            System.out.println("Element: " + num);
        }

//        ARRAY LIST W ARRAY LISCIE
        ArrayList<ArrayList<String>> students = new ArrayList<>();

        ArrayList<String> firstGrade = new ArrayList<>();
        firstGrade.add("karol");
        firstGrade.add("mikolaj");

        ArrayList<String> secondGrade = new ArrayList<>();
        secondGrade.add("wera");
        secondGrade.add("robert");

        students.add(firstGrade);
        students.add(secondGrade);

        for(ArrayList<String> sNames : students) {
            for(String name : sNames) {
                System.out.println(name);
            }
        }

//        KOPIOWANIE ARRAY LIST
        ArrayList<String> citizen = new ArrayList<>();
        names.add("rob");
        names.add("wer");

        ArrayList<String> citizen2 = new ArrayList<>(names);
        for(String cit : citizen2) {
            System.out.println(cit);
        }
    }
}
