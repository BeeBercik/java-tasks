package org.example.Java_067;


/**
 * Pytanie: Jaka jest różnica między throw a throws w Javie?
 * Odpowiedź:
 * 'throw' jest używane do rzucenia konkretnego wyjątku, natomiast 'throws'
 * używane jest w definicji metody, aby wskazać, że metoda może wyrzucić wyjątek.
 * Wyjątki wymienione w klauzuli 'throws' muszą być obsłużone w kodzie wywołującym
 * tę metodę lub muszą być dalej propagowane.
 */

class Bakery {
    // Metoda symulująca pieczenie ciasta, która może rzucić wyjątek
    void bakeCake(String cake) throws Exception {
        if (cake == null) {
            throw new Exception("Nazwa ciasta nie może być null.");
        }
        System.out.println("Pieczenie ciasta: " + cake);
    }
}

public class Main {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        try {
            bakery.bakeCake(null); // Próba upieczenia ciasta bez nazwy, co spowoduje wyjątek
        } catch (Exception e) {
            System.err.println("Wystąpił błąd: " + e.getMessage());
        }
    }
}

/**
 * W tym kodzie, metoda bakeCake() używa 'throws' w swojej deklaracji do
 * wskazania, że może wyrzucić wyjątek typu Exception. W ciele metody, używamy
 * 'throw' do rzucenia wyjątku, gdy nazwa ciasta jest null. W metodzie main(),
 * wywołujemy metodę bakeCake() w bloku try-catch, aby obsłużyć możliwy wyjątek.
 * Dzięki temu mechanizmowi, Java zapewnia kontrolę nad błędami i wyjątkami w
 * programie, umożliwiając ich efektywne obsłużenie.
 */
