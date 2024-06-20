package inheritance.cwicz;

public class Parent {
    public String eyeColor;
    public int age;

    public Parent() {
        this.eyeColor = "blue";
    }

    public Parent(boolean yes) {
        System.out.println("Bool " + yes);
    }
}
