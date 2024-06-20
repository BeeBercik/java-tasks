package oop.interfaces;

public interface Browser {
    String ENGINE = "WebKit"; // public final static

    default String getEngine() {
        return Browser.ENGINE;
    } // public
    void goToPage(String url); // public abstract
    void refreshPage(); // public abstract
    void bookmarkPage(); // public abstract
}