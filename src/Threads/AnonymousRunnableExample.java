package Threads;

// Wczesniej tworzylismy osobna klase Runable, aby moc ja np. kilka razy wykorzystac
// Jesli nie ma takiej potrzeby, chcemy raz jej uzyc to mozna uzyc klasy anonimowej
// Mozna tak samo ze srodka korzystac z wyjatku (wlasciwosci, wlasne metody start())

public class AnonymousRunnableExample {
    public static void main(String[] args) {
        Runnable obj = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        };

        Thread thread1 = new Thread(obj);
        thread1.start();

//        MOZNA TEZ OD RAZU W WATKU
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        });
        thread2.start();

    }
}
