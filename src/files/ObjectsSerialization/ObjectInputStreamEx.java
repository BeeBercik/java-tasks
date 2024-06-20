package files.ObjectsSerialization;

import java.io.*;

// Serializacja - zapis i odczyt obiektow
// Klasy ObjectOutput/InputStream umozliwiaja zapis/odczyt obiektow ktore IMPLEMENTUJA interfejc Serializable do/z pliku
// Tak samo zagniezdzamy klasy np Buffered.. aby przyspieszyc zapis no i File...Stream

// Odczytujac obiekty musimy je rzutowac na odpowiedni typ, gdy pobierane sa jako ogolny typ Object. Nalezy to zrobic w nieskonczonej petli, gdyz metoda .readObject() wykonuje sie od momentu gdy nie rzuci wyjatkiem EOFException -  End Of File - nalezy go wiec obsluzyc np. wypisac KONIEC PLIKU

public class ObjectInputStreamEx {
    public static void main(String[] args) throws IOException {
        String path = "files\\objs.ser";
        ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(path)));

        try {
            while (true) {
                ObjectOutputStreamEx obj = (ObjectOutputStreamEx) in.readObject();
                System.out.println(obj);
            }
        } catch (EOFException e) {
            System.out.println("Koniec pliku!");
        } catch (ClassNotFoundException e) {

        } finally {
            in.close();
        }
    }
}
