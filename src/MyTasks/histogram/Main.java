package MyTasks.histogram;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 25;
        int[] nums = new int[10];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int num = random.nextInt(10);
            nums[num]++;
        }

        for (int i = 0; i < nums.length; i++) {
            String stars = i + " " + "*".repeat(nums[i]);
            System.out.println(stars);
        }
    }
}
