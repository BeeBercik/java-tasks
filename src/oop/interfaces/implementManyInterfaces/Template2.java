package oop.interfaces.implementManyInterfaces;

public interface Template2 {
    public static final String name = "Template2 property";

    public default void template2DefaultMethod() {
        System.out.println("template2DefaultMethod");
    }

    public abstract void template2Method();
}
