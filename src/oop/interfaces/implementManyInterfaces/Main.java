package oop.interfaces.implementManyInterfaces;

public class Main implements Template1, Template2 {

    public void template1Method() {

    }

    public void template2Method() {

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.template1DefaultMethod();
        main.template2DefaultMethod();
    }
}
