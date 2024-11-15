package MyTasks.interfVehicleStopStart.inneRozw;

public class Fabric implements FabricOperations {
    static Car start(String mark, String model, int year) {
        System.out.println("Poczatek produkcji");
        return new Car(mark, model, year);
    }

    static void stop() {
        System.out.println("Koniec produkcji.");
    }
}
