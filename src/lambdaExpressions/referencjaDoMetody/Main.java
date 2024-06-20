package lambdaExpressions.referencjaDoMetody;

// Mozna zapisac metode danego obiektu do zmiennej i pozniej jej uzyc

// Wbudowane interfejsy funkcyjne (zawieraja jedna abstr. metode - reszta (dostepna po wpisaniu . jest dziedziczona zogolnej klasy Object) - nie trzeba tworzyc wlasnych
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Object obj = new Object();
//        taki zapis tworzenia zmiennej o typie interfejsu w rzeczywitosci tworzy obiekt/instancje jakiejs klasy implementujacej tej interfejs, dlatego pozniej odwolujemy sie nazwaZmiennej.metoda() bo ma dostep do metod z interfejsu
        IntSupplier intSupplier = obj::hashCode;
        System.out.println(intSupplier.getAsInt());

//        inny przyjklad
        Person person = new Person();
        IntSupplier eyeSupplier = person::getEyeNum;
        int eyes = eyeSupplier.getAsInt();
        System.out.println(eyes);

//        uniwersalnnie - Supplier
        Supplier<Integer> integerSupplier = person::getEyeNum;
        int eyeNum = integerSupplier.get();
        System.out.println("Ilosc oczu: " + eyeNum);

//        wskazujemy ze nasz obiekt supplier bedzie posiadal metode zwracajaca typ String (w tym wypadku)
        Supplier<String> stringSupplier = person::getEyeColor;
        String color = stringSupplier.get();
        System.out.println("Kolor oczu: " + color);
    }
}

class Person {
    int eyes = 3;
    String eyeColor = "Blue";

    int getEyeNum() {
        return this.eyes;
    }

    String getEyeColor() {
        return this.eyeColor;
    }
}