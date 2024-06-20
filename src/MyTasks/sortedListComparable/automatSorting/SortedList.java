package MyTasks.sortedListComparable.automatSorting;

import java.util.ArrayList;
import java.util.Collections;

// w tym rozwoazaniu sortedlist to nei tylko klasa glowna a funkcj amain, a klasa ktorej bedziemy tworzyc egzemplarze, dlatego mamy typ generyczny T - mozna tworzyc obiekt tej klasy o roznych typach elementow do sortowania (wlasnie dlateo\go nalezy zaznaczyc przy klasie SortedList ze typ gen. T to beda elementy impl. interf. Comparable - inaczej Collections.sort() nie wie czy bedzie w stanie je sortowac.
// Dla porownania tworzac np. w funkcji main ArrayList juz przy tworzeniu zaznaczamy jaki typ danych bedzie rzechowywany - aby wywolusac Collections.sort() wiedziano ze elementy sa sortowalne. Dlatego przy klasie SortdeList, ktora w tym wypadku jest odpowiedikiem ArrayList trzeba nadminiec ze typ danych jakie ebdzie zaweirac sa sortowalne

class ComparableEmployee implements Comparable<ComparableEmployee> {
    int id;
    String name;

    public ComparableEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(ComparableEmployee other) {
        if(this.id > other.id) return 1;
        else if(this.id < other.id) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", name: " + this.name;
    }
}

class ComparablePoint implements Comparable<ComparablePoint> {
    int x;
    int y;

    public ComparablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(ComparablePoint other) {
        if(this.x != other.x)
            return this.x - other.x;
        else
            return this.y - other.y;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}

// dzieki typowi generycznemu T moge tworzyc rozne obiekty tej klasy o roznych typachelementow w liscie. Dzieki temu jedna ogolna klasa list pozwala stworzyc dwie listy przechowujace dwa rozne typy elementow (dodatkowe wskazanie ze nasz typ T rozszerza Comparable, aby metoda Collections.sort() wiedziala jakiego typu elementy bedzie sortowac)
public class SortedList<T extends Comparable<T>> {
    ArrayList<T> list = new ArrayList<>();

    void add(T element) {
        list.add(element);
        Collections.sort(this.list);
    }

    void printList() {
        for(T element : this.list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        SortedList<ComparableEmployee> ce = new SortedList<>();
        ce.add(new ComparableEmployee(2, "robert"));
        ce.add(new ComparableEmployee(3, "wera"));
        ce.add(new ComparableEmployee(1, "maks"));

        ce.printList();

        SortedList<ComparablePoint> cp = new SortedList<>();
        cp.add(new ComparablePoint(2, 3));
        cp.add(new ComparablePoint(2, 2));
        cp.add(new ComparablePoint(1, 4));

        cp.printList();
    }
}
