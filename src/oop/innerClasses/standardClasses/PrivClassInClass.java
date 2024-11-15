package oop.innerClasses.standardClasses;

public class PrivClassInClass {
    private class Inner {
        public void printInner() {
            System.out.println("Get from inner");
        }
    }

    public void getInner() {
        Inner inner = new Inner();
        inner.printInner();
    }

    public static void main(String[] args) {
        PrivClassInClass main = new PrivClassInClass();
        main.getInner();
    }
}
