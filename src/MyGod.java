import java.util.*;


public class MyGod {
    static boolean isInt(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    static boolean isLong(String num) {
        try {
            Long.parseLong(num);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));
        String num = s.nextLine();

        System.out.println("Can be int: " + isInt(num));
        System.out.println("Can be long: " + isLong(num));
    }
}
