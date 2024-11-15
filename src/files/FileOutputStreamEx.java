package files;

import java.io.FileOutputStream;
import java.io.IOException;

// obiekt FileOutPutStream to nasz uchwyt do pliku, 'strumien'. Pozwala zapisac do pliku. Metody takie jak .close(), .write() rzucaja wyjatek IOException

// Metoda .write() przyjmuje bajty. Mozna wiec rzutowac np. stringa na bajty metoda .getBytes() lub stworzyc tablice pojedynczych znakow char[] ktorej elementy przekazywane np. w petli beda automatycznie konwertowane na bajty

// do .write() mozna przekazac chara, bo zostaje automatycznie rzutowany na jego reprezentacje w int, bytes[]

public class FileOutputStreamEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = null;
        char[] letters = {'H', 'e', 'l', 'l', 'o'};
        try {
            out = new FileOutputStream("files\\Hello.txt"); // pozwala wybrac katalog gdzie chcemy zapisac - sciezka od katalogu glownego projektu! (dwa \\ bo 1x \ uzywa sie np \n \t - tabulacja itd)
            for(char letter : letters) {
                out.write(letter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            Jesli wystapi wyjatek - blad podczas otwierania pliku to wartosc handlera dalej bedzie null
            if(out != null) out.close(); // zamyka strumien (uchwyt) do pliku jesli zostal otwarty
        }

        FileOutputStream fos = new FileOutputStream("files\\Siemka.txt");
        String fullTxt = "Siemka!";
        byte[] bitesTxt = fullTxt.getBytes();
        fos.write(bitesTxt);
    }
}
