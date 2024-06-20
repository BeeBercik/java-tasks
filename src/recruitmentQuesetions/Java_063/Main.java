package org.example.Java_063;


/**
 * Pytanie: Iloma sposobami możemy utworzyć obiekt klasy String w Javie?
 * Odpowiedź: W Javie obiekt klasy String można utworzyć na dwa GLOWNE sposoby:
 * 1. Przez bezpośrednie przypisanie ciągu znaków do zmiennej. (z uzyciem literalu tekstoweg)
 * 2. Używając operatora new. (z uzyciem konstruktora bezargum.)
 * 3. INNE: poprzez stworzenie tablicy znakow char i przekazanie jej do konstr, z uzyciem metody String.valueOf(NP_LICZBA)
 */

class Main {
    public static void main(String[] args) {
        // Tworzenie ciągu znaków przez bezpośrednie przypisanie
        String directString = "Java";
        System.out.println("Ciąg znaków utworzony przez bezpośrednie przypisanie: " + directString);

        // Tworzenie ciągu znaków za pomocą słowa kluczowego new
        String newString = new String("Java");
        System.out.println("Ciąg znaków utworzony za pomocą new: " + newString);

        // Porównanie referencji obu ciągów znaków
        boolean isSameReference = directString == newString;
        System.out.println("Czy oba ciągi znaków wskazują na ten sam obiekt? " + isSameReference);
    }
}

/**
 * Ten kod demonstruje różnice w tworzeniu ciągów znaków w Javie. Ciąg utworzony przez bezpośrednie
 * przypisanie jest sprawdzany w puli ciągów i może być ponownie użyty, co jest bardziej efektywne
 * pod względem pamięciowym. Użycie słowa kluczowego new zawsze tworzy nowy obiekt na stercie,
 * nawet jeśli taki sam ciąg już istnieje w puli ciągów.
 */
