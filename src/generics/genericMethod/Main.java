package generics.genericMethod;

class Animal {
    public static <T> void isItLion(T name) {
        if(name == "lion")
            System.out.println("Masz racje, jestem" + name);
        else
            System.out.println(name + " to nie lew!");
    }
}

public class Main {
    public static void main(String[] args) {
         Animal animal = new Animal();
         Animal.isItLion("dog");
    }
}
