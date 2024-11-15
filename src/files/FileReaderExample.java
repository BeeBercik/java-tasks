package files;

import java.io.FileReader;
import java.io.IOException;

// Czytamy znak (nie bajt - 'dwubajt' wartosc dwubajtowa) po znaku
// Podobnie jak read()  FileInputSTream koniec wartosci w pliku to zwrocona -1
// .read() zwraca int reprezentujacy char - kod Unicode w dwu-bajcie

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        String fileName = "files\\fileWriterTest.txt";
        FileReader fr = new FileReader(fileName);

        int charek;
        while((charek = fr.read()) != -1) { // podobnie -1 oznacza brak wartosci do czytania
            System.out.print((char) charek);
        }

        fr.close();
    }
}
