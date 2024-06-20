package org.example.Java_030_main_method_no_static;

/**
 * Pytanie: Co się stanie, gdy w sygnaturze metody main nie zostanie
 * wspomniany modyfikator static?
 * Odpowiedź:
 * Jeśli modyfikator static nie zostanie użyty w sygnaturze metody main,
 * JVM nie będzie w stanie wywołać tej metody podczas uruchamiania programu,
 * co skutkuje błędem wykonania, ponieważ metoda main musi być metodą statyczną,
 * aby mogła być wywołana bez tworzenia instancji klasy.
 */

class NonStaticMainExample {
    // Próba zdefiniowania metody main bez modyfikatora static
    public void main(String[] args) {
        System.out.println("Ta metoda main nie jest statyczna.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Metoda main musi być statyczna.");
        // Próba utworzenia instancji klasy NonStaticMainExample i wywołania metody main
        // Poniższa linia nie zostanie wykonana bezpośrednio przez JVM
        NonStaticMainExample example = new NonStaticMainExample();
        example.main(new String[] {"Próba wywołania"});
    }
}

