package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Skaner moze odczytywac to co sie mu poda w konstruktorze np z terminala lub z pliku

public class ScannerExample {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);

        System.out.println("-DODAWANIE LICZB-");
        System.out.print("Podaj ile chcesz dodac liczb: ");
        int count = s.nextInt();

        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.println("Podaj liczbe do dodania");
            sum += s.nextInt();
        }
        System.out.println("Suma: " + sum + "\n");
        s.close();

//        ODCZYT SKANEREM Z PLIKU
        try {
            String url = "files\\Elo.txt";
            File file = new File(url);
            Scanner sp = new Scanner(file); // trzeb oblsuzy wyjatek braku pliku
//            Najlepiej uzyc nextLine() bo przy next() np. spacje w pliku wysweitla w nowej linii
            while (sp.hasNextLine()) {
                System.out.print(sp.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            s.close();
        }
    }
}
