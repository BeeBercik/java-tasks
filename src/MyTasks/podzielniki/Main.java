package MyTasks.podzielniki;

public class Main {
    static void podzielniki(int num) {
        int i = 1;
        while(i <= num) {
            if(num % i == 0)
                System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        int num = 10;
        podzielniki(num);
    }
}
