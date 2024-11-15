package MyTasks.anonimowyComparator;

import java.util.Arrays;
import java.util.Comparator;

public class SortedArray {
    private Integer[] array;

    public SortedArray(int n) {
        this.array = new Integer[n];

        for (int i = 0; i < n; i++) {
            this.array[i] = (int) (Math.random() * 50) + 10;
        }
    }

    public SortedArray() {
        this.array = new Integer[10];

        for (int i = 0; i < 10; i++) {
            this.array[i] = (int) (Math.random() * 50) + 10;
        }
    }

    public void sort(Comparator<Integer> comparator) {
        Arrays.sort(this.array, comparator);
    }

    @Override
    public String toString() {
        return "SortedArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public static void main(String[] args) {
        SortedArray sortedArray = new SortedArray();

//        tworzy obiekt anonimowej klasy (bez nazwy) implementujacej interfejs Comparator
        sortedArray.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; // elementy to liczby wiec gdy 1 wieksz od 2 to zwroci dodatn. wartosc
            }
        });

        sortedArray.sort(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

//        rosnąco ze względu na ostatnią cyfrę; w przypadku takiej samej ostatniej cyfry bierzemy pod uwagę wartość całej liczby
        sortedArray.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 % 10 > o2 % 10) return 1;
                else if( o1 % 10 < o2 % 10) return -1;
                else if(o1 % 10 == o2 % 10) return o1 - o2;
                else return 0;
            }
        });

        System.out.println(sortedArray);
    }
}
