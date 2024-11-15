package MyTasks.trojkatRownoboczny;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i > 0 && i < n - 1) {
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print(" ");
                }
            }

            if (i != 0 && i != n - 1)
                System.out.print("*");

            if(i == n - 1) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
