package oop.interfaces;

public class Firefox extends Chrome implements Browser {
    @Override
    public void goToPage(String url) {
        this.url = url;
        System.out.println("Firefox url: " + this.url);
    }
}
