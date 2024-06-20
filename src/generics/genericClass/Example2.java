package generics.genericClass;

// Taki zapis oznacza ze typ generyczny, ktory podamy (de facto obiekt) musi rozszerzac obiekt Number - w przeciwnym wypadku blad. Jest to swego rodzaju OGRANICZENIE co do mozliwosci przekazanego typu;
class Square<T extends Number> {
    private T wall;

    public Square(T wall) {
        this.wall = wall;
    }

    public int sum(T a, T b) {
        return a.intValue() + b.intValue();
    }

    public double getSurfaceArea() {
        double wall2 = wall.doubleValue();
        return wall2 * wall2;
    }

    public T getWall() {
        return wall;
    }

    public void setWall(T wall) {
        this.wall = wall;
    }
}

public class Example2 {
    public static void main(String[] args) {
        Square<Integer> square = new Square<>(10);
        System.out.println(square.getSurfaceArea());
        System.out.println(square.sum(5, 10));

        Square<Float> squaref = new Square<>(5.7f);
        System.out.println(squaref.getSurfaceArea());
    }
}
