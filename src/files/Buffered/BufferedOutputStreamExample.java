package files.Buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// To samo co stand. FileOuputStream tylko w Buforze

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("Hello.txt"));
        String txt = "BufferedOutput testing ;)";
        char[] charsTxt = txt.toCharArray();
        for(char letter : charsTxt) {
            out.write(letter);
        }
//        lub
        byte[] bytesTxt = txt.getBytes();
        out.write(bytesTxt);

        out.close();
    }
}
