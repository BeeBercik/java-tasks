package org.example.questions1;
/**
 * Pytanie: Dlaczego konstruktory nie mogą być finalne, statyczne lub abstrakcyjne w Javie?
 * Odpowiedź:
 * Konstruktory w Javie służą do inicjalizacji nowych obiektów i nie są dziedziczone,
 * więc nie ma sensu oznaczanie ich jako finalnych, ponieważ nie można ich nadpisać.
 * Konstruktory nie mogą być statyczne, ponieważ statyczność oznaczałaby przynależność
 * do klasy jako całości, a nie do konkretnego egzemplarza instancji; konstruktory są wywoływane
 * na rzecz konkretnej instancji. Nie mogą być również abstrakcyjne, ponieważ konstruktor
 * abstrakcyjny wymagałby implementacji w klasie pochodnej, co jest sprzeczne z ideą
 * konstrukcji obiektu - nie można utworzyć instancji klasy abstrakcyjnej, więc nie
 * można wywołać konstruktora abstrakcyjnego.
 */

class ExampleClass2 {
    // Ten fragment kodu ilustruje, że konstruktory są zawsze konkretnymi mechanizmami
    // inicjalizacji instancji i nie mogą być oznaczone modyfikatorami, które
    // sugerowałyby inną semantykę niż tworzenie i inicjalizacja nowego obiektu.
}

public class Java_013_why_constructors_cannot_be_final_static_or_abstract {
    public static void main(String[] args) {
        System.out.println("Konstruktory w Javie nie mogą być finalne, statyczne ani abstrakcyjne z powodów semantycznych i logicznych związanych z procesem tworzenia nowych obiektów.");
    }
}
