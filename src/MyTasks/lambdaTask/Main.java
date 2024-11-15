package MyTasks.lambdaTask;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;

// Callable reprezentuje zadanie do wykonania. To nie jest watek, jak Thread. Jest to interf. funkjcyjny z 1 abstr. metoda call() zwracajaca Object.

public class Main {
    public static void main(String[] args) throws Exception {
        Path path = Path.of("files\\input.dat"); // obiekt sciezki do pliku
        String txt = Files.readString(path); // zwraca caly tekst jako String
        String[] words = txt.split("\\s+"); // \s oznacza kazdy bialy znak w regex
        for(String word: words) {
            Callable callable = () -> word.length(); // przekazanie lambdy jako metody (nie do konstr!)
//            Callable callable1 = new Callable() {
//                @Override
//                public Object call() throws Exception {
//                    return "A";
//                }
//            };

            System.out.println("The lenght of string '" + word + "': " + callable.call());
        }
    }
}
