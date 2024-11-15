package oop.Singleton;

// pozwala na utworzenie tylko jednej instancji obiektu
// klasy czyli jedngo obiektu za pomoca metody statycznej
// (konstruktor ustawiamy na prywatny) oraz wlasciwosc
// statyczna metody instance ustawiamy w zaleznosci czy
// zostal juz utowrzony obiekt czy nie
class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Priv const");
    }

    public Singleton(boolean cos) {
        // wypisze priv const
        this();
        System.out.println("Pub const");
    }

    public static Singleton getInstance() {
        if(Singleton.instance == null)
            // wypisze priv const
            Singleton.instance = new Singleton();

        return Singleton.instance;
    }
}