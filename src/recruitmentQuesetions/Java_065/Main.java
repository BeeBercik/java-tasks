package org.example.Java_065;


/**
 * Pytanie: Co to jest obsługa wyjątków w Javie?
 * Odpowiedź: Obsługa wyjątków w Javie to mechanizm pozwalający na kontrolowane
 * radzenie sobie z błędami w czasie wykonywania programu. Umożliwia on przechwytywanie
 * wyjątków i reagowanie na nie w sposób zorganizowany, co pozwala na uniknięcie
 * awaryjnego zakończenia działania aplikacji i zapewnia jej stabilność.
 */

class ToyCar {
    private int speed;

    public ToyCar(int speed) {
        this.speed = speed;
    }

    // Metoda symulująca jazdę samochodu zabawki, która może rzucić wyjątek
    // w przypadku, gdy prędkość przekroczy bezpieczny limit
    public void drive() {
        try {
            if (speed > 100) {
                throw new Exception("Prędkość jest zbyt wysoka!");
            }
            System.out.println("Samochód jedzie z prędkością: " + speed + "km/h");
        } catch (Exception e) {
            System.err.println("Wyjątek: " + e.getMessage());
        } finally {
            System.out.println("Operacja jazdy została zakończona.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ToyCar toyCar = new ToyCar(150);

        toyCar.drive();
    }
}

/**
 * W tym przykładzie zdefiniowaliśmy klasę ToyCar, która posiada metodę drive(),
 * symulującą jazdę samochodu zabawki. Metoda ta używa mechanizmu obsługi wyjątków
 * do przechwycenia sytuacji, gdy prędkość samochodu przekroczy bezpieczny limit,
 * rzucając i obsługując wyjątek. Blok `try` zawiera kod, który może spowodować
 * wyjątek, `catch` obsługuje wyjątek, a `finally` wykonuje kod po blokach `try`
 * i `catch`, niezależnie od tego, czy wyjątek wystąpił, czy nie.
 */
