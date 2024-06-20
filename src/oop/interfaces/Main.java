package oop.interfaces;

public class Main {
    public static void main(String[] args) {
        Browser chrome = new Chrome();
        Browser firefox = new Firefox();
        chrome.goToPage("www.chrome.com");
        firefox.goToPage("www.firefox.com");

        System.out.println(chrome.getEngine());
        System.out.println(firefox.getEngine());
    }
}
