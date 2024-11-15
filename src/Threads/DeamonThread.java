package Threads;

// Watki demoniczne koncza swoja prace, gdy zakancza sie glowny watek MAIN (jak w przykladzie - mimo niekonczacej si epteli while - po wypisaniu sout() w main watek MAIN sie zakancza a z nim nasz demon)
// Watkiem demonicznym jest np. Garbage Collector zwalniajacy miejsca

public class DeamonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread demon = new Thread(() -> {
            int i = 1;
            while(true) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                i++;
            }
        });

        demon.setDaemon(true); // trzeba ustawic ze jest demona
        demon.start();

        Thread.sleep(3000); // usypiamy glowny watek aby demon wykonal sie 3 razy (bo ma 1sec pauzy)
        System.out.println("FINISH MAIN");
    }
}
