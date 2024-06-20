package MyTasks.zapisBinarny;

import java.util.ArrayList;

public class Main {
    static String convert(int liczba) {
        if(liczba == 0 ) return "0";
        ArrayList<Integer> bin = new ArrayList<>();
        while (liczba > 0) {
            bin.add(liczba % 2);
            liczba /= 2;
        }
        return bin.reversed().toString();
    }


    public static void main(String[] args) {
        int liczba = 2;
        String result = Main.convert(liczba);
        System.out.println(result);
    }
}
