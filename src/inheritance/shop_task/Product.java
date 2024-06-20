package inheritance.shop_task;

public class Product {
    public int price;
    public String name;
    public String manufacturer;
    public int productionYear;

    public Product() {
        this.name = null;
        this.manufacturer = null;
    }

    public Product(int price,
                   String name,
                   String manufacturer,
                   int productionYear) {
        this.price = price;
        this.name = name;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
    }
}
