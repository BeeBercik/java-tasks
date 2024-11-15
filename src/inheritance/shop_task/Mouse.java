package inheritance.shop_task;

public class Mouse extends Product {
    public int numBattons;

    public Mouse() {
        this.price = 80;
        this.name = "Mouse Stinger";
        this.manufacturer = "MSI";
        this.productionYear = 2019;
        this.numBattons = 3;
    }
}
