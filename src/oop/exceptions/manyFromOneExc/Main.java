package oop.exceptions.manyFromOneExc;

// Jesli mamy wyjatki, ktore pochodza od innego wyhatku to mozemy je "lapac" odnoszac sie glownym wyjatkiem
// Mozemy rzucajac wyjatek pochodzacy od innego zaznaczyc w metodzie, ze rzucamy niby glowny - mozna tak, gdyz ten pochodzacy (mniejszy) od niego zawiera wszystko to co ten glowny.
// Trzeba wtedy w metodzie glownej lapac juz glowny wyjatek - w koncu zaznaczylismy ze metoda rzuca wlasnie glowny

class MainException extends Exception {
    public MainException(String message) {
        super(message);
    }
}

class SmallerException extends MainException {
    public SmallerException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch(MainException e) {
            System.out.println(e.getMessage());
        }
    }

    static void doSomething() throws MainException {
        throw new SmallerException("Rzucam smaller exception.");
    }
}
