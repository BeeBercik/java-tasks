package files;

// Strumien tekstowy - operuje na znakach Unicode - wartosciach dwubajtowych wiec Z POLSKIMI OGONKAMI
// FileWriter tak samo zuca IOException podczas tworzenia obiektu uchwytu do pliku

// UWAGA - metoda .write() fileWriter moze przyjac String w calosci, pojedynczy char lub tablice charow!!

// TRZEBA uzyc flush() lub close() aby bufor zostal oprozniony a tresc zapisaa do pliku!!!
// FileWriter samo w sobie nie ma buforu (tak jak BufferedReader czy Writer) tylko dziala na buforze wewn. strumenia

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String txt = "Testing FileWriter";
        char[] charsTxt = txt.toCharArray();

        String fileName = "files\\fileWriterTest.txt";
        FileWriter fw = new FileWriter(fileName);
        fw.write(charsTxt); // mozna przekazac chara, String lub tablicze chars
        byte[] letters = {'h', 'e', 'j', 'k', 'a'};
        for (int i = 0; i < letters.length; i++) {
            fw.write(letters[i]);
        }
        fw.close();
    }
}
