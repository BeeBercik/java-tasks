package Optionals;

import java.util.Optional;

// filter(warunek lambda) - sprawdza czy element w optionalu sprawdza warunek, jesli tak to "przepuszcza"/przekazuje go dalej, jesli nie to zwraca pustego optionala

public class OptionalFilter {
    public static void main(String[] args) {
        Optional<String> txt = Optional.ofNullable("aha");
//        sprawdza warunek, jesli zostal spelniony to wartosc dalej jest w optionalu i metoda ifPresent sprawdzamy wlasnei czy jest, jesli jest to np wypisujemy, inaczej sie nei wykona
        txt.filter(el -> el.length() > 2).ifPresent(el -> System.out.println(el));

        Optional<String> txt2 = Optional.ofNullable(null);
        Optional<String> result = txt2.filter(el -> el.length() > 2);
        System.out.println(result); // nie spelnilo warunku filter wiec Optional.empty

    }
}
