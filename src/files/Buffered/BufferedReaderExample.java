package files.Buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// To samo mozna zrobic z FileReader/Witer - przekazujemty do konstruktora i dziala szybciej z buforem danych
// ROZNICA !! Moze czytac linia po linii (w stanard. FileReader nie dalo sie) az do NULL (litery - chary/inty czyta az do -1 a linie do null)

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        String fileName = "files\\Elo.txt";
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        int letter;
        while((letter = in.read()) != -1) {
            System.out.print((char) letter);
        }
        in.close();

        System.out.println("\n-- LINIJKAMI--");

//        lub (aby czytalo nie "pod rzad" lecz LINIJKAMI - jesli damy zwykle PRINT i czytamy litera po literze to ok, gorzej jak println bo przerwy po kazdej literze)
        BufferedReader bf = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = bf.readLine()) != null) { // niech czyta dopoki nie null - koniec zawartosci
            System.out.println(line);
        }
    }
}
