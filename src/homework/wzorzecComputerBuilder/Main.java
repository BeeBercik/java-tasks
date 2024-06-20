package homework.wzorzecComputerBuilder;

// Klasa reprezentująca niezmienniczy obiekt Computer
class Computer {
    private final String CPU;
    private final String RAM;
    private final String HDD;
    private final String graphicCard;
    private final String display;
    private final String operatingSystem;

    // Prywatny konstruktor, aby obiekt można było tworzyć tylko za pomocą wzorca builder
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.graphicCard = builder.graphicCard;
        this.display = builder.display;
        this.operatingSystem = builder.operatingSystem;
    }

    // Metody dostępowe do pól
    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getDisplay() {
        return display;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    // Wzorzec builder dla klasy Computer
    static class ComputerBuilder {
        private final String CPU;
        private final String RAM;
        private final String HDD;
        private String graphicCard;
        private String display;
        private String operatingSystem;

        // Konstruktor wymagający obowiązkowych parametrów
        public ComputerBuilder(String CPU, String RAM, String HDD) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.HDD = HDD;
        }

        // Metody ustawiające opcjonalne parametry
        public ComputerBuilder setGraphicCard(String graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }

        public ComputerBuilder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public ComputerBuilder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        // Metoda do zbudowania obiektu Computer
        public Computer build() {
            return new Computer(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Przykłady tworzenia obiektów Computer za pomocą wzorca builder
        Computer computer1 = new Computer.ComputerBuilder("Intel i5", "16GB", "1TB SSD")
                .setGraphicCard("NVIDIA GTX 1650")
                .setDisplay("27-inch IPS")
                .setOperatingSystem("Windows 10")
                .build();

        Computer computer2 = new Computer.ComputerBuilder("AMD Ryzen 7", "32GB", "2TB HDD")
                .setOperatingSystem("Ubuntu 20.04")
                .build();

        // Wypisanie informacji o komputerach
        printComputerInfo(computer1);
        printComputerInfo(computer2);
    }

    // Metoda do wypisania informacji o komputerze
    private static void printComputerInfo(Computer computer) {
        System.out.println("CPU: " + computer.getCPU());
        System.out.println("RAM: " + computer.getRAM());
        System.out.println("HDD: " + computer.getHDD());
        System.out.println("Graphic Card: " + computer.getGraphicCard());
        System.out.println("Display: " + computer.getDisplay());
        System.out.println("Operating System: " + computer.getOperatingSystem());
        System.out.println();
    }
}
