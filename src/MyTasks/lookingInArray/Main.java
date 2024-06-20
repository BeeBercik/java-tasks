package MyTasks.lookingInArray;

import java.lang.reflect.Array;
import java.util.Random;

public class Main {
    public static Random random = new Random();

    public static int countMin(int[] t) {
        int min = t[0];
        for (int i = 0; i < t.length; i++) {
            if(t[i] < min) {
                min = t[i];
            }
        }

        int count = 0;
        for(int num : t) {
            if(num == min)
                count++;
        }

        return count;
    }

    public static int[] threeMax(int[] t) {
        int first = 0; // losuje i tak od 0 do 10 wiec moge sobie pozwolic na wstepne wpisanie 0
        int second = 0;
        int third = 0;
        for(int num : t) {
            if(num > first)
                first = num;
        }
        for(int num : t) {
            if(num > second && num != first)
                second = num;
        }
        for(int num : t) {
            if(num > third && num != first && num != second)
                third = num;
        }


        int[] result = {first, second, third};
        return result;
    }

    public static int maxPair(int[] t) {
        int maxValue = 0;
        for (int i = 0; i < t.length - 1; i++) {
            if(t[i] + t[i+1] > maxValue)
                maxValue = t[i] + t[i+1];
        }

        return maxValue;
    }


    static boolean allElementsDifferent(int[] t) {
        boolean flag = true;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if(j == i) // zeby nie porownywac samego ze soba
                    continue;
                if(t[i] == t[j])
                    flag = false;
            }
        }

        return flag;
    }

    static boolean isGeometric(int[] t) {
        boolean all0 = true;
        for (int i = 0; i < t.length; i++) {
            if(t[i] != 0)
                all0 = false;
        }

        if(all0)
            return true;
        else {
            if(t[0] == 0 || t[1] == 0)
                return false;

            double q = (double) t[1] / t[0];

            for (int i = 1; i < t.length - 1; i++) {
                if(t[i] == 0 || t[i + 1] == 0)
                    return false;

                double lq = (double) t[i + 1] / t[i];
                if (lq != q)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int[] t = new int[3];
//        for (int i = 0; i < t.length; i++) {
//            t[i] = random.nextInt(10);
//        }

        int[]t = {8, 4, 2};
        for(int num : t) {
            System.out.print(num + " ");
        }
        System.out.println();

        int countMin = countMin(t);
        System.out.println("Ile razy najmniejsza liczba: " + countMin);

        int[] threeMax = Main.threeMax(t);
        int nr = 1;
        for(int num : threeMax) {
            System.out.println(nr++ + " najwieksza liczba: " + num + " ");
        }

        int maxPairValue = Main.maxPair(t);
        System.out.println("Najwieksza suma pary liczb obok siebie: " + maxPairValue);

        boolean allDifferent = Main.allElementsDifferent(t);
        System.out.println("Czy wszystkie elementy w tablicy sa rozne -> " + allDifferent);

        boolean isGeometric = Main.isGeometric(t);
        System.out.println("Czy jest ciagiem geometrycznym: " + isGeometric);

    }
}
