package oop.Singleton.EasierExplained;

public class Main {
    public static void main(String[] args) {
        Singleton singiel = Singleton.getInstance();
        singiel.setAge(23);
        System.out.println(singiel.getAge());

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getAge());
    }
}
