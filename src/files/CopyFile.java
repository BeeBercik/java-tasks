package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Strumienie bajtowe (FileInput/OutputStream) bazuja na bajtach - wartosciach 8bitowych - WIEC BEZ POLSKICH OGONKOW
// Przy nazwie pliku mozna podac sceizke skad ma byc odczytany/zapisany np "files\\cos.txt"

public class CopyFile {
    public static void main(String[] args) {
        String fileName = "files\\Hello.txt";
        FileInputStream in = null; // trzeba zadeklarowac poza blokiem try-catch (nie zainicjalizowac), aby pozniej w finally widzialo zmienna i zamklo strumien
        FileOutputStream out = null;

        try {
            in = new FileInputStream(fileName); // stworzenie nowego obiektu tutaj
            String copyFileName = "files\\copy.txt";
            out = new FileOutputStream(copyFileName);

            int letter;
            while((letter = in.read()) != -1) {
                out.write(letter);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally { // kolejny catch dla metody close rzuca wyj. IOExcp - mozna by bylo dac THROWS po metodzie
            try {
                if(in != null) in.close(); // jesli nie bylo bledu i jest otwarty strumien do pliku to zamknij
                if(out != null) out.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
