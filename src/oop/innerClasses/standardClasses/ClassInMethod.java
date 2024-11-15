package oop.innerClasses.standardClasses;

public class ClassInMethod {
    public void getInsideInner() {
        class Inner {
            public void printInner() {
                System.out.println("Print inner");
            }
        }

        Inner inner = new Inner();
        inner.printInner();
    }

    public static void main(String[] args) {
        ClassInMethod main = new ClassInMethod();
        main.getInsideInner();
    }
}
