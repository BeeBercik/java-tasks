package oop.statics;

class Item {
    static int numItems = 0;
    final int ID;

    Item(int id) {
        this.ID = id;
    }

    static int getNextId() {
        return Item.numItems++;
    }

    static Item getItem() {
        int id = Item.getNextId();
        Item item = new Item(id);
        return item;
    }

    static void printNumItems() {
        System.out.println("Number of items: " + Item.numItems);
    }

    void printId() {
        System.out.println(this.ID);
    }
}

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while(i < 3) {
            Item item = Item.getItem();
            item.printId();
            i++;
        }
        Item.printNumItems();
    }
}
