package files;

import java.io.FileInputStream;
import java.io.IOException;

// Metoda read() czyta bajt po bajcie i zwraca wartosc int reprezentujaca bajt - pozniej rzutujemy  na char aby dostac litere. Aby odczytac znak nalezy liczby skonwertowac na znaki (char). Odczytujac w petli bajt po bajcie TRZEBA dac warunek zakonczenia czytania - metoda .read() zwroci wartosc int -1 gdy nie bedzie co odczytac
// read() nalezy w petli uzyc raz, gdyz kazde uzycie odczytuje kolejny znak (np. uzycie w ciele spowoduje ze zostanie odczytane zly znak bo wskaznik przeskoczy 2x a nie raz i pominie litere)
// Rzuca wyjatkiem IOException

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
        String fileName = "files\\Siemka.txt";
        FileInputStream input = new FileInputStream(fileName);

        int letter = 0;
        while((letter = input.read()) != -1) { // warunek zakonczenia -1 zwrocone przez .read()
            System.out.print((char) letter);
        }

        input.close();
    }
}
