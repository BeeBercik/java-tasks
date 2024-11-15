package oop.polimorfizm;

// polega na rzutowaniu obiektu klasy podrzednej na typ klasy nadrzednej
// (obiekt traci swoje wlasne unikalne metody, wlasciwosci)
// rzutujac spowrotem na swoj glowny typ (wlasnej klasy) dzyska dostep

public class Main {

    public static void main(String[] args) {
        Flat[] homes = new Flat[10];
        int index = 0;
        for(Flat home : homes) {
            int i = (int) Math.floor(Math.random() * 3);
            if(i == 0) homes[index] = new Flat("MiastoMieszkania", "UlicaMieszkania");
            else if(i == 1) homes[index] = new House("UlicaDomu", "MiasoDomu", 60.0f);
            else homes[index] = new Residence("UlicaRezydencji", "MiastoRezydencji", 100.0f, 40.0f);
            index++;
         }

         for(Flat home : homes) {
            if(home instanceof Residence) {
                Residence residence = (Residence) home;
                System.out.println("Metoda residence: " + residence.getGarageSize());
                System.out.println("Residence: " + residence.toString());
            } else if(home instanceof House) {
                House house = (House) home;
                System.out.println("Metoda house: " + house.getParcelSize());
                System.out.println("House : " + house.toString());
            } else {
                System.out.println("Flat: " + home.toString());
            }





             System.out.println("-----TESTY------");
             Residence residence = new Residence("UlicaRezydencji", "MiastoRezydencji", 100.0f, 40.0f);
             System.out.println(residence.getGarageSize());
             System.out.println(residence.garageSize);

             House hoRe = (House) residence; //rzutowanie obiektu residence na obiekt typu House
             hoRe.getParcelSize(); //getGarageSize nie ma bo utracil
//             System.out.println(hoRe.garageSize); // nie ma bo utracil
         }
    }
}
