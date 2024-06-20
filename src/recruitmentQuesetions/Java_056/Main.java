package org.example.Java_056;

/**
 * Pytanie: Jaki jest cel metody gc() w Javie?
 * Odpowiedź: Metoda gc() służy do sugerowania maszynie wirtualnej Javy (JVM),
 * aby rozważyła uruchomienie procesu odśmiecania pamięci (garbage collection).
 * Proces ten ma na celu zwolnienie pamięci zajmowanej przez obiekty, które już
 * nie są używane (nieosiągalne). Wywołanie metody gc() nie gwarantuje natychmiastowego
 * działania garbage collector'a, ale jest to sposób na zasugerowanie JVM,
 * że jest to odpowiedni moment na próbę zwolnienia niepotrzebnie zajmowanej pamięci.
 */

class GarbageCollectionDemo {

    public void finalize() {
        System.out.println("Obiekt został usunięty przez garbage collector.");
    }

    public static void main(String[] args) {
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        // Przypisanie null do referencji obiektów
        obj1 = null;
        obj2 = null;

        // Sugerowanie uruchomienia garbage collection
        System.gc();

        System.out.println("Metoda gc() została wywołana.");
    }
}

/**
 * W tym kodzie tworzymy dwa obiekty klasy GarbageCollectionDemo, a następnie
 * ustawiamy ich referencje na null, czyniąc je nieosiągalnymi. Następnie wywołujemy
 * metodę System.gc(), sugerując maszynie wirtualnej, aby uruchomiła proces odśmiecania
 * pamięci. Jeśli garbage collector zdecyduje się uruchomić, wywołana zostanie
 * metoda finalize() każdego z obiektów przed ich usunięciem, co zostanie sygnalizowane
 * wiadomością w konsoli. Należy jednak pamiętać, że wywołanie System.gc() nie
 * gwarantuje natychmiastowego uruchomienia garbage collection.
 */
