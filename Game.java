
import java.util.Random;
import java.util.Scanner;

public class Game {
   private static Scanner s = new Scanner(System.in);
   private static Random random = new Random();

   public static void main(String[] args) {
      System.out.print("Podaj wielkosc palnszy nXn, parametr n: ");
      int n = s.nextInt();
      int[][] board = new int[n][n];
      int fill = (int) Math.ceil((n * n) * 0.3);
      
      System.out.format("Ilosc zywych komorek na starcie: %d%n", fill);
      board = fillArray(board, fill);

      while(true) {
      String input = s.nextLine();
         if(input.equals("q")) {
            break;
         }
         board = nextTurn(board);
         printArray(board);
      }
   }

   private static void printArray(int[][] board) {
      for(int i = 0; i < board.length; i++) {
         for(int j = 0; j < board[i].length; j++) {
            System.out.printf(" %d ", board[i][j]);
         }
         System.out.println();      
      }
   }

   private static int[][] fillArray(int[][] board, int fill) {
      for(int i = 0; i < board.length; i++) {
         for(int j = 0; j < board[i].length; j++) {
            board[i][j] = 0;
         }      
      }
      
      int wylosowanyWiersz;
      int wylosowanaKolumna;
      do {
      wylosowanyWiersz = random.nextInt(0, board.length);
      wylosowanaKolumna = random.nextInt(0, board.length);
      if(board[wylosowanyWiersz][wylosowanaKolumna] == 0) {
         board[wylosowanyWiersz][wylosowanaKolumna] = 1;
         fill--;
      }
      } while(fill > 0);

      return board;
   }

   private static int[][] nextTurn(int[][] board) {
      int top, right, bottom, left, topRight, rightBottom, bottomLeft, leftTop, sum;
      
      for(int i = 0; i < board.length; i++) {
         for(int j = 0; j < board[i].length; j++) {
            top = i > 0 ? board[i-1][j] : 0;
            right = j < board[i].length-1 ? board[i][j+1] : 0;
            bottom = i < board.length-1 ? board[i+1][j] : 0;
            left = j > 0 ? board[i][j-1] : 0;

            topRight = i > 0 && j < board[i].length-1 ? board[i-1][j+1] : 0;
            rightBottom = j < board[i].length-1 && i < board.length-1 ? board[i+1][j+1] : 0;
            bottomLeft = i < board.length-1 && j > 0 ? board[i+1][j-1] : 0;
            leftTop = j > 0 && i > 0 ? board[i-1][j-1] : 0;

            sum = top + right + bottom + left + topRight + rightBottom + bottomLeft + leftTop;
            if(board[i][j] == 1 && (sum < 2 || sum > 3)) {
               board[i][j] = 0;
            } else if(board[i][j] == 0 && sum == 3) {
               board[i][j] = 1;
            }
         }
      }
      return board;
   }
}