package org.example.Java_054;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Pytanie: Jak uzyskać dostęp do prywatnej metody klasy z zewnątrz klasy?
 * Odpowiedź: Można to osiągnąć za pomocą refleksji w Javie. Refleksja pozwala na
 * inspekcję klas, interfejsów, pól i metod w czasie wykonywania, a także na ich
 * modyfikację. Dzięki temu można uzyskać dostęp do prywatnych metod klasy z
 * zewnątrz tej klasy.
 */

class SecretCalculator {
    private int secretFactor = 5;

    private int multiplyBySecretFactor(int number) {
        return number * secretFactor;
    }
}

public class Main {
    public static void main(String[] args) {
        SecretCalculator calculator = new SecretCalculator();

        try {
            // Pobranie obiektu reprezentującego prywatną metodę
            Method method = SecretCalculator.class.getDeclaredMethod("multiplyBySecretFactor", int.class);

            // Ustawienie dostępu do prywatnej metody na true
            method.setAccessible(true);

            // Wywołanie prywatnej metody
            int result = (Integer) method.invoke(calculator, 10);

            // Wyświetlenie wyniku
            System.out.println("Wynik mnożenia przez sekretny współczynnik: " + result);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

/**
 * W tym przykładzie definiujemy klasę SecretCalculator z prywatną metodą
 * multiplyBySecretFactor, która mnoży podaną liczbę przez sekretny współczynnik.
 * W klasie AccessPrivateMethod używamy refleksji do uzyskania dostępu do tej
 * prywatnej metody i wywołujemy ją, mimo że nie jest ona dostępna bezpośrednio
 * z zewnątrz klasy SecretCalculator.
 */

