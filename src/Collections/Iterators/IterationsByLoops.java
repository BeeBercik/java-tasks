package Collections.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

class Product {
    protected String name;

    public Product(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name;
    }
}

public class IterationsByLoops {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            products.add(new Product("Product" + i));
        }

        System.out.println("Wyswietlenie kolekcji metoda for i");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }

        System.out.println("Wyswietlenie kolekcji metoda forEach");
        for(Product product : products) {
            System.out.println(product);
        }

        System.out.println("Wyswietlenie kolekcji iteratorem");
        Iterator<Product> iterator = products.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
