package recruitmentQuesetions;

/**
 *
 *
 * Pytanie: Co to jest i jak działa ClassLoader w Javie?
 * Odpowiedź:
 * ClassLoader w Javie to część JRE (Java Runtime Environment) odpowiedzialna
 * za dynamiczne ładowanie klas do pamięci podczas wykonywania programu. Java
 * używa mechanizmu ClassLoader do oddzielenia przestrzeni nazw klas w różnych
 * częściach aplikacji, co umożliwia ładowanie klas z różnych źródeł (takich jak
 * lokalne systemy plików, sieci itp.) bez konfliktów nazw. Działa hierarchicznie,
 * używając trzech głównych class loaderów: Bootstrap, Extension, i System (oraz
 * Application) ClassLoader.
 */

public class Java_006_how_classloader_works {
    public static void main(String[] args) {
        // Wyświetlenie ClassLoadera klasy aktualnie wykonywanej
        ClassLoader classLoader = Java_006_how_classloader_works.class.getClassLoader();
        System.out.println("ClassLoader dla Java_005_how_classloader_works: " + classLoader);

        // Próba uzyskania ClassLoadera dla podstawowych typów Java (np. String),
        // które są ładowane przez Bootstrap ClassLoader (może zwrócić null)
        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println("ClassLoader dla klasy String: " + stringClassLoader);
    }
}

