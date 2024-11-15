package oop.Singleton;

public class Test {
    public static void main(String[] args) {
        Singleton db = Singleton.getInstance();
        Singleton db2 = Singleton.getInstance();

        Singleton singiel = new Singleton(true);
    }
}
