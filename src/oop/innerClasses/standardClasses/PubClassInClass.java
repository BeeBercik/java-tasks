package oop.innerClasses.standardClasses;

public class PubClassInClass {
    public class Inner {
        public void print() {
            System.out.println("Inner");
        }
    }

    public static void main(String[] args) {
        PubClassInClass main = new PubClassInClass();
        PubClassInClass.Inner inner = main.new Inner();
        inner.print();
    }
}
