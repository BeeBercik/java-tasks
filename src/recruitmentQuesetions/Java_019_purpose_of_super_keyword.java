package org.example.questions1;

/**
 * Pytanie: Jaki jest cel słowa kluczowego 'super' w Javie?
 * Odpowiedź:
 * Słowo kluczowe 'super' w Javie jest używane w klasach pochodnych do odwoływania się
 * do członków klasy bazowej (nadklasy), zwłaszcza gdy mają te same nazwy.
 * Umożliwia to wywołanie konstruktora klasy bazowej, metod lub dostęp do zmiennych
 * instancyjnych. Jest to szczególnie przydatne w dziedziczeniu, gdy chcemy
 * rozszerzyć funkcjonalność metody z klasy bazowej, nie tracąc jej pierwotnego
 * zachowania.
 */

class Vehicle2 {
    int maxSpeed;

    public Vehicle2(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void display() {
        System.out.println("Maksymalna prędkość pojazdu: " + maxSpeed + " km/h");
    }
}

// Klasa Car jest pochodną klasy Vehicle
class Car extends Vehicle2 {
    String carModel;

    public Car(String carModel, int maxSpeed) {
        super(maxSpeed); // Wywołanie konstruktora klasy bazowej Vehicle
        this.carModel = carModel;
    }

    @Override
    public void display() {
        super.display(); // Wywołanie metody display() z klasy bazowej Vehicle
        System.out.println("Model samochodu: " + carModel);
    }
}

public class Java_019_purpose_of_super_keyword {
    public static void main(String[] args) {
        Car myCar = new Car("Fiat 126p", 120);
        myCar.display();
    }
}

/**
 * W tym kodzie definiujemy klasę Vehicle jako klasę bazową z polem maxSpeed i metodą
 * display(), a następnie klasę Car, która dziedziczy z Vehicle i rozszerza jej
 * funkcjonalność o pole carModel i modyfikuje metodę display(). Użycie 'super' w
 * konstruktorze klasy Car oraz w jej metodzie display() demonstruje, jak można
 * odwołać się do elementów klasy bazowej, co jest kluczowym aspektem dziedziczenia
 * i reużywania kodu w Javie.
 */
