package oop.Singleton.EasierExplained;

public final class Singleton {
    private int age;
    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if(Singleton.instance == null) {
            Singleton obj = new Singleton();
            Singleton.instance = obj;
        }
        return Singleton.instance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
