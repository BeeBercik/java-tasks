package MyTasks.liczbyAutomorficzne;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    static boolean endsWith(int num, int suffix) {
        String cnum = Integer.toString(num);
        String csuffix = Integer.toString(suffix);
        if(cnum.charAt(cnum.length() - 1) == csuffix.charAt(0))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int count = 3;
        int found = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        int num = 0;
        while(found < count) {
            int pow = (int) Math.pow(num, 2);
            if (endsWith(pow, num)) {
                found += 1;
                nums.add(num);
            }
            num++;
        }

        Iterator<Integer> i = nums.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}


