package Threads;

import java.util.ArrayList;

// Tworzymy 2 watki - pierwszy z nich uruchamia proces czekania na otrzymanie pizzy, drugi (uruchomiony po 2s czekania na zrobienie picki, dostawe) oznacza uruchomienie procesu dostawy
// Naszym monitorem dostepu bedzie Lista pizzaTank.
// Potrzebujemy go bo mamy 2 rozne watki, ktore uruchamiaja dwie rozne metody, ktore maja dostep i do tej samej zmiennej. Dlatego ta wlasnie zmienna (lista) bedzie monitorem dostepu. Opakowujemy blokiem synchronized obie metody.
// Jesli ktorys z watkow  uruchomi metode i monitor bedzie wolny, to wykona kod. Np metoda waitForPizza() najpierw blokuje monitor pizzaTank, wiec metoda PizzaGuy nie moglaby sie wykonac, gdyz jest opakowana blokiem synchronized z przekazana wlasnie tym samym monitorem. Pozniej metoda waitPizza() stopuje watek, i nasz pGuy() moze sie wykonac

// Notify nie zwalnia monitora, jedynie wskazuje ze inny watek np. wywolujacy inna metode zmieniajaca ta sama zmiennna moze sprobowac to 'bezpiecznie' zrobic

class House {
    private ArrayList<String> pizzaTank = new ArrayList<>();

    public void waitForPizza() {
        synchronized (this.pizzaTank) { // Jesli status monitora zmiennej wolny, to wykonaj i zablokuj monitor
            while (this.pizzaTank.isEmpty()) {
                System.out.println("Waiting for pizza");
                try {
                    this.pizzaTank.wait(); // zatrzymaj watek customer, zwolnij monitor pizzaTank
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//            Po ponownym uruchomieniu w metodzie dostawczej, wyswietl ze dostales.
            System.out.println("Pizza " + this.pizzaTank.remove(0) + " recievied, thanks!");
        }
    }

    public void pizzaGuy() {
//        Wchodzi, jesli mointor pizzaTank jest wolny. Metoda wait() czeka na pizze i zwalnia monitor, wiec watek producer uruchamia ta metode pizzaGuy(), ktora dodaje pizze i uruchamia ponownie watek customer
        synchronized (this.pizzaTank) {
            System.out.println("Pizza arrived");
            this.pizzaTank.add("Pizza salami");
            this.pizzaTank.notify();
        }
    }
}

public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {
        House house = new House();

        Thread customer = new Thread(new Runnable() {
            @Override
            public void run() {
                house.waitForPizza();
            }
        });
        customer.start();

        Thread.sleep(2000); // bez tego tez by dzialalo tylko bez odtsepu czasu (bo i tak drugi watek wywola swoja metode dopiero gdy pierwszy ja zwolni wiec te 2sec to tak od picu)

        Thread producer = new Thread(() -> {
            house.pizzaGuy();
        });
        producer.start();
    }
}
