package MyTasks.minMaxSilnia;

import java.util.Scanner;

public class Main {
    static int silnia(int n) {
        int silnia = 1;
        while(n > 0) {
            silnia *= n;
            n--;
        }

        return silnia;
    }

    static int silniaRekurencyjna(int n) {
        if(n == 0 || n == 1)
            return 1;
        else
            return n * silniaRekurencyjna(n - 1);
    }

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = new int[3];
        System.out.println("Podaj 3 liczby");
        System.out.print("Pierwsza: ");
        nums[0] = s.nextInt();
        System.out.print("Druga: ");
        nums[1] = s.nextInt();
        System.out.print("Trzecia: ");
        nums[2] = s.nextInt();
        s.close();

        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max)
                max = nums[i];
            if(nums[i] < min)
                min = nums[i];
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        int x = 10;
        int silnia = silnia(x);
        System.out.println("Silnia z " + x + ": " + silnia);
        int silniaRekurencyjna = silniaRekurencyjna(x);
        System.out.println("Silnia z " + x + ": " + silniaRekurencyjna);
    }
}
