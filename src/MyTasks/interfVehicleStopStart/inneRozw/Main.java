package MyTasks.interfVehicleStopStart.inneRozw;

public class Main {
    public static void main(String[] args) {
//        za pomoca metod statycznych klasy
        System.out.println(Fabric.start("Audi", "A5", 2020));
        Fabric.stop();

//        za pomoca metod statycznych interfejsu (bezposrednie dowolanie do interfejsu, gdyz metody statyczne interf. nie sa dziedzieczone przez klasy)
        System.out.println(FabricOperations.start("BMW", "gowno540", 1999));
        FabricOperations.stop();
    }
}
