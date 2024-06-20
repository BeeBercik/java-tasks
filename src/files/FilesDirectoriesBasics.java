package files;

import java.io.File;
import java.io.IOException;
import java.util.Date;

// Klasa File umozliwia nam utworzenie ogolnego obiektu reprezentujacego plik. Moze to byc plik czy tez katalog. Posiada wiele metod.

// .list() gdy obiekt File wskazuje na katalog zwraca tablice stringow nazw wszystkich plikow wewnatrz, mkdir() tworzy katalog w miejscu na ktore wskazuje

public class FilesDirectoriesBasics {
    public static void main(String[] args) throws IOException {
//        Na pliku
        String url = "files\\hi.txt";
        File file = new File(url);

        if(!file.exists()) {
            boolean newFileResult = file.createNewFile();
            System.out.println("New file created!");
        } else {
            System.out.println("Katalog nadrzedny/rodzic: " + file.getParent());
            System.out.println("Do odczytania:" + file.canRead());
            System.out.println("Do zapisu:" + file.canWrite());
            System.out.println("Sciezka do pliku: " + file.getPath()); // sciezka od korzenia projektu TASKS
            System.out.println("Sciezka bezwzgledna do pliku: " + file.getAbsolutePath());
            System.out.println("Nazwa pliku: " + file.getName());
            System.out.println("Czy plik ukryty: " + file.isHidden());
            System.out.println("Czy plik: " + file.isFile());
            System.out.println("Czy katalog: " + file.isDirectory());
            long lastModified = file.lastModified();
            System.out.println("Ostatnio edytowany: " + new Date(lastModified));
            System.out.println("Wielkosc pliku: " + file.length()); // ilosc znakow - nowa linia jako 2
        }

        System.out.println("\n");

//        Operacje na katalogu
        File dir = new File("files");
        if(dir.exists() && dir.isDirectory()) {
            String[] dirInside = dir.list(); // lista stringow z nazwa plikow w srodku
            for(String dirName : dirInside) {
                System.out.println(dirName);
            }
        }

        File newDir = new File("files\\Test");
        if(!newDir.exists()) {
            newDir.mkdir();
        }
        for (int i = 0; i < 2; i++) {
            File filek = new File(newDir.getPath() + "\\test" + i + ".txt");
            if(!filek.exists()) filek.createNewFile();
        }
    }
}
