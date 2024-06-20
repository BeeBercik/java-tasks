package inheritance.shop_task;

public class Keyboard extends Product {
    public int numKeys;

    public Keyboard() {
        this.price = 399;
        this.name = "Razer KeyBoard";
        this.manufacturer = "RAZER";
        this.productionYear = 2022;
        this.numKeys = 104;
    }
}
