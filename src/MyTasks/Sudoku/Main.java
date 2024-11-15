package MyTasks.Sudoku;

import java.util.Random;

public class Main {
    public static void printSudoku(int[][] tab) {
        for(int[] row : tab) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static boolean correctRowsAndCols(int[][] tab) {
        boolean allOk = true;

        for (int i = 0; i < tab.length; i++) {
//            sprawdzanie wierszy
            for (int j = 0; j < tab[i].length; j++) {
                int currentNum = tab[i][j];          // {{1, 2, 3}, {4, 5, 6}}
                for (int k = 0; k < tab[i].length; k++) {
                    if (j == k)
                        continue;

                    int testedNum = tab[i][k];
                    if (currentNum == testedNum) {
                        return false;
                    }
                }
            }
//                {{1, 2, 3}, {4, 5, 6}}
//              sprawdzanie kolumn
            for (int j = 0; j < tab.length; j++) {
                int currColNum = tab[j][i];

                for (int k = 0; k < tab.length; k++) {
                    if(j == k) {
                        continue;
                    }
                    int testedColNum = tab[k][i];
                    if(currColNum == testedColNum)
                        return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = 2;
        int[][] sudoku = new int[n][n];

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                sudoku[i][j] = random.nextInt(10);
            }
        }

        printSudoku(sudoku);

        boolean correctRowsAndCols = Main.correctRowsAndCols(sudoku);
        System.out.println("Czy wiersze i kolumny sa ok: " + correctRowsAndCols);
    }
}
