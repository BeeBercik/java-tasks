package MyTasks.lookingInDoubleArray;

import java.util.Random;


public class Main {
    public static boolean evenRow(int[][] tab) {
        boolean even = true;
        for (int i = 0; i < tab.length; i++) {
            even = true;
            for (int j = 0; j < tab.length; j++) {
                if(tab[i][j] % 2 != 0) {
                    even = false;
                    break;
                }
            }
            if(even)
                break;
        }
        return even;
    }

    public static boolean sameRowAndColumn(int[][] tab) {
        boolean theSame = false;
        for (int i = 0; i < tab.length; i++) {
            int rowValue = 0;
            for (int j = 0; j < tab.length; j++) {
                rowValue += tab[i][j];
            }

            int colValue = 0;
            for (int j = 0; j < tab.length; j++) {
                colValue += tab[j][i];
            }
            System.out.println("Suma wiersza: " + rowValue);
            System.out.println("Suma kolumny: " + colValue);

            if(rowValue == colValue)
                theSame = true;
        }

        return theSame;
    }

    public static void main(String[] args) {
        int size = 3;
        int[][] tab = new int[size][size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tab[i][j] = random.nextInt(10);
            }
        }

        for (int[] row : tab) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Czy istnieje \"parzysty\" rzad: " + Main.evenRow(tab));
        System.out.println("Czy jakas kolumna i wiersz maja taka sama sume: " + Main.sameRowAndColumn(tab));
    }
}
