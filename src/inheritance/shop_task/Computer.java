package inheritance.shop_task;

public class Computer extends Product {
    public Mouse mouse;
    public Monitor monitor;
    public Keyboard keyboard;

    public Computer() {
        this.mouse = new Mouse();
        this.monitor = new Monitor();
        this.keyboard = new Keyboard();
    }
}
