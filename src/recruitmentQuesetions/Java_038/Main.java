package org.example.Java_038;

/**
 * Pytanie: Jak różni się abstrakcja od enkapsulacji?
 * Odpowiedź:
 * Abstrakcja pozwala na ukrycie szczegółów implementacji, eksponując tylko funkcje
 * niezbędne dla użytkownika, podczas gdy enkapsulacja ukrywa stan wewnętrzny obiektu,
 * dostęp do którego jest możliwy tylko przez publiczne metody. Abstrakcja jest realizowana
 * poprzez klasy abstrakcyjne i interfejsy, a enkapsulacja przez modyfikatory dostępu takie jak
 * private, protected, i public.
 */

class Account {
    // Prywatne zmienne instancyjne klasy - przykład enkapsulacji
    private String accountNumber;
    private double balance;

    // Konstruktor klasy Account
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Publiczna metoda do wpłaty środków - przykład enkapsulacji
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Wpłacono: " + amount);
        }
    }

    // Publiczna metoda do sprawdzenia salda - przykład abstrakcji
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("12345", 1000.0);
        myAccount.deposit(500.0);
        System.out.println("Saldo konta: " + myAccount.getBalance());
    }
}
