package files;

import java.io.*;

// Uzywajac DataOutput/InputStream mamy pelna kontrole nad zapisywaniemi i odczytywaniem danych. DataInputStream zapisuje dane w postaci BINARNEJ i tak samo odczytuje je DataOutputStream

// Dane w pliku .txt/.dat sa nie do odczytania bo informacje zapisanwe sa w postaci binarnej

// Dane zapisywane sa "po kolei" za pomoca odpowiednich metod np. writeInt(), writeChar() . WAZNE - aby je odczytac musimy znac KOLEJNOSC jak i TYP zapisanych informacji!! Moze to byc klopotliwe. Aby pominac jakas zapisana informacje i czytac dalej to nalezy uzyc metody .skip() i podac ilosc bajtow danego typu danych

// Reprezentacja bajtowa typow danych
//byte: 1 bajt - 8 bitow
//short: 2 bajty- 16 bitow it..
//int: 4 bajty
//long: 8 bajtów
//float: 4 bajty
//double: 8 bajtów
//char: 2 bajty

public class DataInputOutputStream {
    public static void main(String[] args) throws IOException {
//         -- ZAPIS --
        String fileName = "files\\data.dat";
        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(fileName)
                )
        );
        out.writeUTF("Testuje dos'a ą");
        out.writeChar('A');
        out.writeFloat(2.5f);
        out.writeInt(100);
        out.close();


//        -- ODCZYT --
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(fileName)
                )
        );
        String txt = in.readUTF();
        System.out.println(txt);

//        char letter = in.readChar();
//        System.out.println(letter);

        in.skipBytes(2); // pomijamy zapisanego chara - 2 bajty
        float floacik = in.readFloat();
        System.out.println(floacik);

        int incik = in.readInt();
        System.out.println(incik);

        in.close();
    }
}
