package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

// Kolejka priorytetowa moze przechowywac nasze obiekty implementujace interf. Comparable przez co neit rzeba dostarczac osobnego Comparatora. Dodajac takie obiekty do kolejki same beda "sortowane" ze wzgledu na napisana przez nas metode compareTo() - to my ustalamy priorytet

class Task implements Comparable<Task> {
    int priority;
    String name;

    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

//    compareTo - gdy zwrocona zostaje wart. dot. np. 1 to obecny obiekt jest dawany dalej na liscie. Gdy -1 to obecny jlement jest dawany wczesniej od obecnie porownywanego elementu, a gdy funkcja zwroci 0 to beda obok siebie bo znaczy to ze sa sobie rowne, wiec nie ma znaczenia ktory z tych 2 elem bedzie pierwszy
    @Override
    public int compareTo(Task o) {
        int priorityA = this.priority;
        int priotityB = o.priority;

        if(priorityA == priotityB) return 0;
        if(priorityA < priotityB) return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", name='" + name + '\'' +
                '}';
    }
}

class ClearTask {
    int priority;
    String name;

    public ClearTask(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClearTask{" +
                "priority=" + priority +
                ", name='" + name + '\'' +
                '}';
    }
}

class PriorityComparator implements Comparator<ClearTask> {
    public int compare(ClearTask o1, ClearTask o2) {
        int priorityA = o1.priority;
        int priotityB = o2.priority;

        if(priorityA == priotityB) return 0;
        if(priorityA < priotityB) return 1;
        else return -1;
    }
}

public class PriorityQueueComparatorAble {
    public static void main(String[] args) {
        PriorityQueue<Task> q = new PriorityQueue<>();
        q.add(new Task(1, "Sprzatanie"));
        q.add(new Task(90, "Gotowanie"));
        q.add(new Task(5, "Szkola"));

        System.out.println("Obowiazki za dnia");
        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }

        PriorityQueue<ClearTask> q2 = new PriorityQueue<>(new PriorityComparator());
        q2.add(new ClearTask(2, "Mycie sie"));
        q2.add(new ClearTask(5, "Golenie"));
        q2.add(new ClearTask(10, "Perfumowanie"));
        q2.remove(new ClearTask(5, "Golenie"));

        System.out.println("\nObowiazki wieczorem");

        while(!q2.isEmpty()) {
            System.out.println(q2.poll());
        }
    }
}
