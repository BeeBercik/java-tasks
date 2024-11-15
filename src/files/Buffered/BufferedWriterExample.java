package files.Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Tutaj tak samo jak w stand. FileWriter - .wrtie() wpisuje char[] lub String

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        String fileName = "files\\Hello.txt";
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        String txt = "Ala ma kota";
        char[] charsTxt = txt.toCharArray();
        for(char letter : charsTxt) {
            out.write(letter);
        }
//        lub
        out.write(charsTxt); // szybciej
        out.close();

        String fileName2 = "files\\Elo.txt";
        BufferedWriter out2 = new BufferedWriter(new FileWriter(fileName2));
        for (int i = 0; i < 3; i++) {
            out2.write("Elo " + i + "\n");
        }
        out2.close();
    }
}
