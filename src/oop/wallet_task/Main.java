package oop.wallet_task;

class Wallet {
    float money = 0.0f;

    Wallet() {
        this.money = 3000.0f;
    }

    void addMoney(float amount) {
        this.money += amount;
    }

    void removeMoney(float amount) {
        this.money -= amount;
    }

    void printAmount() {
        System.out.println("Pieniadzie w portfelu: " + this.money);
    }
}

public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
    
        for(int i = 0; i < 6; i++) {
            wallet.addMoney(5000.0f);
            wallet.removeMoney(2000.0f);
            wallet.removeMoney(1000.0f);
        }

        wallet.printAmount();
    }
}
