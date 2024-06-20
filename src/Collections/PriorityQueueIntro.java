package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

// jes to klasa wiec mozemy tworzyc jej instancje tj PriorityQueue<String> pq = new PriorityQueue<>();
// domyslnie, bez przekazanego comparatora do konstr. porzadek ustala naturalnie tj. strigni w kolejnosci alfabetycznej a integery od najmn. do najw
// przekazujac wlsany comp. sami decydujemy jak ustalac priorytet

// ssmo Queue to interfejs ktory implementuj anp LinkedList

public class PriorityQueueIntro {
    public static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer x, Integer y) {
            if (x == y) return 0;
            if (x < y) return 1;
            else return -1;
        }

//        TO SAMO CO WYZEJ TYLKO WBUDOWANA FUNKCJA
//        @Override
//        public int compare(Integer x, Integer y) {
//            return Integer.compare(x, y);
//        }
//    }
    }

    public static class LengthComparator implements Comparator<String> {
        public int compare(String x, String y) {
//            ROSNACO (DEFAULT)
//            return x.length() - y.length();
//              MALEJACO
                if(x.length() == y.length()) return 0;
                if(x.length() < y.length()) return 1;
                else return -1;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(5);
        q.add(3);
        q.add(10);
        q.add(50);
        q.add(30);
        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }
        System.out.println(q);

        PriorityQueue<String> qs = new PriorityQueue<>();
        qs.add("b");
        qs.add("a");
        qs.add("c");
        System.out.println(qs.peek());
        System.out.println(qs);


        PriorityQueue<Integer> nums = new PriorityQueue<>(new PriorityQueueIntro.DescComparator());
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(5);
        while(!nums.isEmpty()) {
            System.out.println(nums.poll());
        }

        PriorityQueue<String> names = new PriorityQueue<>(new PriorityQueueIntro.LengthComparator());
        names.add("aaa");
        names.add("a");
        names.add("aa");
        while(!names.isEmpty()) {
            System.out.println(names.poll());
        }

    }
}
