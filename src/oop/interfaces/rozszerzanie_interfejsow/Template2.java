package oop.interfaces.rozszerzanie_interfejsow;

public interface Template2 extends Template1 {
    public static final String name = "Template2 property";

    public default void template2DefaultMethod() {
        System.out.println("template2DefaultMethod");
    }

    public abstract void template2Method();
}
