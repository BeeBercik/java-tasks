package oop.interfaces;

public class Chrome implements Browser {
    protected String url;
    @Override
    public void goToPage(String url) {
        this.url = url;
        System.out.println("Chrome url: " + this.url);
    }

    @Override
    public void refreshPage() {}

    @Override
    public void bookmarkPage() {}
}
