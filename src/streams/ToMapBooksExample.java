package streams;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Record - jak nazwa wskazuje - sluzy do pzechowywania danych. POD SPODEM dodaje metodye equals(), hashcode(), konstruktor przypisujacy dane podane po nazwie record Book(..[DANE]..) oraz gettery. Pola domyslnie sa prywatne
record Book(String name, int releaseYear, String isbn) {
    public Book getMe() { // sam sb dodalem ta klase zeby pozniej referencja dostac obiekt
        return this;
    }
}

public class ToMapBooksExample {
    public static void main(String[] args) {
//        List.of() tworzy podstawowa liste,NIEMODYFIKOWALNA! Nie dzialaja add(), remove()..
        List<Book> books = List.of(
                new Book("The Fellowship of the Ring", 1954, "0395489318"),
                new Book("The Two Towers", 1954, "0345339711"),
                new Book("The Return of the King", 1955, "0618129111")
        );
//        books.add(new Book("All i want is you", 1960, "0618129120")); blad

        Map<String, String> bookMap = books.stream().collect(Collectors.toMap(key -> key.isbn(), value -> value.name()));

        System.out.println("\n-Wypisane .forEach([lambda')-");
//        proste wypisanie funkcja lamda. Przez to ze wykonujemy foreach na obiekcie przechowujacym mape, czyli wartosci klucz - wartosc, kompilator wykrywa jakiego typu sa to zmienne i bez problemu je np wypisuje.
        bookMap.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("\n-Wypisane itaretorem-");

//        Gdy tworzymy iterator musimy zaznaczyc typy elementow, bo kompilator wie tylko ze zwracamy iterator, nie ma info o elementach w srodku
        Iterator<Map.Entry<String, String>> iter = bookMap.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<String, String> curr = iter.next();
            String key = curr.getKey();
            String value = curr.getValue();
            System.out.println(key + ", " + value);
        }

        System.out.println("\n-Z metoda mergujaca powtarzany klucz-");
//        3 argument metody toMap() to funkcja mergujaca elementy, gdy wystapi konflikt np. kluczy. Chcemy doda celement u kluczu ktory juz istnieje. Stosujemy lambde o 2 argumentach - 1 to element, ktory juz sie znajduje w mapie, 2 to ten, ktory probujemy dodac. Wymagane jest, aby ta lambda zwrocila elemet, ktory ma zostac wstawiony. MY wskazujemy, aby stary element zostal na swoim miejscu.
        Map<Integer, Book> bookMapV2 = books.stream().collect(Collectors.toMap(Book::releaseYear, Book::getMe, (curr, newVal) -> newVal));
        for(Map.Entry<Integer, Book> book : bookMapV2.entrySet()) {
            Integer key = book.getKey();
            Book value = book.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
