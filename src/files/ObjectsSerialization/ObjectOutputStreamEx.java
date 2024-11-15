package files.ObjectsSerialization;

import java.io.*;

// Serializacja - zapis i odczyt obiektow
// Klasy ObjectOutput/InputStream umozliwiaja zapis/odczyt obiektow ktore IMPLEMENTUJA interfejc Serializable do/z pliku
// Tak samo zagniezdzamy klasy np Buffered.. aby przyspieszyc zapis no i File...Stream

// Odczytujac obiekty musimy je rzutowac na odpowiedni typ, gdy pobierane sa jako ogolny typ Object. Nalezy to zrobic w nieskonczonej petli, gdyz metoda .readObject() wykonuje sie od momentu gdy nie rzuci wyjatkiem EOFException -  End Of File - nalezy go wiec obsluzyc np. wypisac KONIEC PLIKU

public class ObjectOutputStreamEx implements Serializable {
    String a;
    transient int b;

    public ObjectOutputStreamEx(String a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "ObjectOutputStreamEx{" +
                "a='" + a + '\'' +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        String path = "files\\objs.ser";

        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream(path)));
            ObjectOutputStreamEx o1 = new ObjectOutputStreamEx("o", 1);
            ObjectOutputStreamEx o2 = new ObjectOutputStreamEx("o", 2);
            out.writeObject(o1);
            out.writeObject(o2);
            out.flush();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
