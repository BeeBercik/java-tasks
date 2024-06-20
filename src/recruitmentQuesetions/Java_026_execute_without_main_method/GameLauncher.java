package org.example.Java_026_execute_without_main_method;

/**
 * Pytanie: Czy możliwe jest wykonanie programu bez definiowania metody main()?
 * Odpowiedź:
 * W wersjach Javy przed Java SE 7, można było użyć bloku statycznego do wykonania
 * kodu przed jakąkolwiek metodą, włącznie z metodą main(). Blok statyczny wykonuje się
 * w momencie ładowania klasy do JVM. Jednak od Javy SE 7, obecność metody main() jest
 * wymagana do uruchomienia programu jako aplikacji. Poniższy przykład demonstruje
 * wykorzystanie bloku statycznego w celu wykonania kodu przed metodą main().
 * Należy jednak pamiętać, że taka praktyka nie jest zalecana jako sposób na uruchamianie
 * typowych aplikacji Java.
 */

class GameSimulation {
    static {
        System.out.println("Przygotowanie symulacji gry...");
        // Tutaj mogą być wykonywane różne operacje inicjalizacyjne
        System.exit(0); // Zakończenie działania programu przed wywołaniem metody main()
    }
}

public class GameLauncher {
    public static void main(String[] args) {
        // W praktyce ten kod nigdy nie zostanie wykonany, ponieważ program zakończy działanie
        // w bloku statycznym klasy GameSimulation.
        System.out.println("Uruchomienie gry...");
    }
}

/**
 * W tym kodzie definiujemy klasę GameSimulation z blokiem statycznym, który symuluje
 * przygotowanie do uruchomienia gry. Blok ten wykonuje się automatycznie przy ładowaniu
 * klasy do JVM, co demonstruje możliwość wykonania kodu bez bezpośredniego wywoływania
 * metody main(). Należy jednak zauważyć, że wywołanie System.exit(0) w bloku statycznym
 * powoduje zakończenie działania JVM przed jakimkolwiek wywołaniem metody main(),
 * co ilustruje techniczną możliwość, ale jednocześnie podkreśla, że nie jest to
 * standardowa ani zalecana praktyka programowania w Javie.
 */
