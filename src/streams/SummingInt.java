package streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

// zbieramy dane ze strumienia a nastepnie odwolujac sie do metody statycznej summingInt() klasy Collectors ktora przyjmuje wyrazenei lambda (przekazujemy element jaokk argument i wskazujemy ktora wartosc bierzemy - w tym wypadku sam element - gdyby byl obiekt to np obiekt.name) sumujemy po kolei elementy

public class SummingInt {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(4);

        int sum = nums.stream().collect(Collectors.summingInt(el -> el));
        System.out.println("Suma liczb: " + sum);
    }
}
