package MyTasks.sortedListComparable.usingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// uzywaja comparatora tworze klasy reprezentujaca dane obiekty (pracownikow i punkty) a nastepnie odpowiadajace im comparatory, ktorych instancje przekaze do metody Collections.sort(lista, komparator)

// korzystajac z interfejsu comparable tworzylem klasy implementujace ten interfejs i korzystajace z jego metody, ktora byla wykrywana i uruchamiana przez mechanicm funkcji sort(). Wtedy tez podawalismy tylko jeden parametr - zbrio elementow posiadajacych w sobie wlasnie metode z interfejsu odpowiadajaca za sortowanie

class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id - o2.id;
    }
}

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", name: " + this.name;
    }
}

class PointComparator implements Comparator<Point> {
    public int compare(Point o1, Point o2) {
        if(o1.x != o2.x)
            return o1.x - o2.x;
        else
            return o1.y - o2.y;
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}

public class SortedList {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(2, "robert"));
        employees.add(new Employee(3, "wera"));
        employees.add(new Employee(1, "maks"));

        Collections.sort(employees, new EmployeeComparator());
        for(Employee employee : employees) {
            System.out.println(employee);
        }

        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(2, 3));
        points.add(new Point(2, 2));
        points.add(new Point(1, 4));

        Collections.sort(points, new PointComparator());
        for(Point point : points) {
            System.out.println(point);
        }
    }
}
