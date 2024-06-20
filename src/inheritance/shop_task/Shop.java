package inheritance.shop_task;

public class Shop {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println("Nazwa monitora z komputera: " + computer.monitor.name);
        System.out.println("Computer name (niepodana): " + computer.name);

        VerticalMouse mouse = new VerticalMouse();
        System.out.println("Nazwa myszy vertical" + mouse.name);
        System.out.println("Rok myszy vertical jak zwyklej: " + mouse.productionYear);

        Keyboard keyboard = new Keyboard();
        System.out.println("Nazwa klawki: " + keyboard.name);
        System.out.println("Ilosc klawiszy: " + keyboard.numKeys);
    }
}
