package homework.czytanieZpliku;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        try {
            String content = Files.readString(Paths.get("input.dat"));
            String[] words = content.split("\\s+");

            ExecutorService executorService = Executors.newFixedThreadPool(words.length);

            List<Future<String>> futures = new ArrayList<>();

            for (String word : words) {
                Callable<String> wordLengthCallable = () -> "Dlugosc slowa '" + word + "': " + word.length();
                Future<String> future = executorService.submit(wordLengthCallable);
                futures.add(future);
            }

            for (Future<String> future : futures) {
                try {
                    System.out.println(future.get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }

            executorService.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
