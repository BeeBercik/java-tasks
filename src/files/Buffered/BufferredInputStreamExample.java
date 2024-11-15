package files.Buffered;

// Przy wiekszych plikach, zawirajacych wiecej danych buforowanie pozwala na szybszy  zapis i odczyt danych. Nie sa brane po kolei bajty do zapisu/odczytu, lecz kompilator wezmie do bufora odpowiednia ilosc elementow i za jednym zamachem  zapisze caly bufor na dysk

// Polega na zagniezdzeniu boiektow klas tj obiekt np. FileInpuStream wkladamy do konstruktora Buforu, reszta tj odpis/zapis tak samo jak wszedzie

// To samo co stand. FileInputStream tylko w Buforze

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferredInputStreamExample {
    public static void main(String[] args) throws IOException {
        String fileName = "files\\Hello.txt";
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(fileName));

        int letter;
        while((letter = input.read()) != -1) {
            System.out.print((char) letter);
        }
        input.close();
    }
}
