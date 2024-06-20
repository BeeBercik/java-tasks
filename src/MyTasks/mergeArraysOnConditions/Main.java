package MyTasks.mergeArraysOnConditions;

import java.util.Arrays;

public class Main {
    static int[] removeDuplicates(int[] tab) {
        int size = 0;
        for (int i = 0; i < tab.length; i++) {
            boolean only = true;
            int count = 0;
            for (int j = 0; j < tab.length; j++) {
                if(i == j)
                    continue;
                if(tab[j] == tab[i]) {
                    only = false;
                    count++;
                }
            }
            if(only || (!only && count > 1))
                size++;
        }

        System.out.println("ROZMIAR: " + size);
        return tab;
    }

    static int[] merge(int[] x, int[] y) {
        int[] tab = new int[x.length + y.length];
        for (int i = 0; i < x.length; i++) {
            tab[i] = x[i];
        }

        int p = 0;
        for (int i = x.length; i < tab.length; i++) {
            tab[i] = y[p];
            p++;
        }

        Arrays.sort(tab);
        tab = removeDuplicates(tab);

        return tab;
    }


    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        int[] y = {0, 2, 4};

        int[] tab = Main.merge(x, y);
        for(int i : tab) {
            System.out.print(i + " ");
        }
    }
}