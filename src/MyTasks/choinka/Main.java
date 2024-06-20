package MyTasks.choinka;

public class Main {
    public static void main(String[] args) {
        int n = 5; // wyoskosc - ilosc wierszy

        for (int i = 0; i < n; i++) {
//            ROBIE TO WIERSZAMI po kolei
//            najpierw robie przerwy
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
//            pozniej wypelniam gwiazdki
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
