package oop.interfaces.rozszerzanie_interfejsow;

public interface Template1 {
    public static final int NUM = 10;

    public default void template1DefaultMethod() {
        System.out.println("template1DefaultMethod");
    }

    public abstract void template1Method();
}
