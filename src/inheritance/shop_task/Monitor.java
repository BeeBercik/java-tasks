package inheritance.shop_task;

public class Monitor extends Product {
    public int resolution;

    public Monitor() {
        this.price = 599;
        this.name = "HighPower Monitor";
        this.manufacturer = "ASUS";
        this.productionYear = 2020;
        this.resolution = 1080;
    }
}
