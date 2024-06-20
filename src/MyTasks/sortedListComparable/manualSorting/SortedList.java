package MyTasks.sortedListComparable.manualSorting;

import java.util.ArrayList;
import java.util.Collections;

// implementujac interf. comparable nalezy podac typ generyczny o jakim bedziemy porownywac elementy - w tym wypadky obkiety tej samj klasy ComparavleEmployee
// nalezy rowniez po implement. tego interf. zaimplementowac metode compareTo() wedlug ktorej obiekt tej klasy bedzie mogl byc sortowany np metoda Collections.sort()


class ComparableEmployee implements Comparable<ComparableEmployee> {
    int id;
    String name;

    public ComparableEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(ComparableEmployee other) {
//        to sie dzieje od spodem
//        mozna zastapiac this.id - other.id
//        gdy zwraca dodatnie to wedruje na miejsce po porownywanym obecnie elemencie, gdy ujemna to wedruje przed element a gdy 0 to nie ma znaczenia bo znaczy ze sa takie same
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
//        return this.x - other.x;

//        jesli chce bo obu wspolrzednych tj. napierw x a pozniej x
        if(this.x != other.x)
            return this.x - other.x;
        else // gdy x takie same to niech zdecyduje y
            return this.y - other.y;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}

public class SortedList {
    public static void main(String[] args) {
        ArrayList<ComparableEmployee> ce = new ArrayList<>();
        ce.add(new ComparableEmployee(2, "robert"));
        ce.add(new ComparableEmployee(3, "wera"));
        ce.add(new ComparableEmployee(1, "maks"));

//        metoda znajduje i uruchamia w kazdym elemencie (w tym wypadku obiekcie) listy metode compareTo i na jej podstawie sortuje elementy
        Collections.sort(ce);
//        korzystajac c interfejsu Comparator wyglada to tak, ze jako 2 argument podajemy instancje stworozengo przez nas comparatora wg ktorego sortuje

//        Collections.sort(cs, new EmployeeComparator());

        for(ComparableEmployee employee : ce) {
            System.out.println(employee);
        }

        ArrayList<ComparablePoint> cp = new ArrayList<>();
        cp.add(new ComparablePoint(2, 3));
        cp.add(new ComparablePoint(2, 2));
        cp.add(new ComparablePoint(1, 4));

        Collections.sort(cp);

        for(ComparablePoint point : cp) {
            System.out.println(point);
        }
    }
}
