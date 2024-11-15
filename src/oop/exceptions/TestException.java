package oop.exceptions;

public class TestException extends Exception {
    public TestException() {
        super("Wystapil TestEception!");
    }

    public TestException(String message) {
        super(message);
    }

//    @Override
//    public String toString() {
//        return "Nie dziala!";
//    }
}