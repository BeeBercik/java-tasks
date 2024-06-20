package oop.exceptions;

// Wszystkie wyjatki, ktore stworzymy pochodza od np. Exception, LogharitException te zas od RutimeException az po Throwable. To z Throwable mamy metody getMessage() doetepne w naszym wyjatku gdyz dziedziczymy je.
// W konstruktorze wlasnych wyjatkow - de facto klas - mozemy nic nie rpzekazywac, wiadomosc, przyczyne, lub wiadomosc i przyczyne. Mamy metody do wypisywania getMessage(), getCause() itd.


// METODA() throws JakisException - zapis powinien byc stosowany, gdy metoda bedzie wywolywana w innej, ktora wtedy musi obsluzyc ruzcony wyjatek przez ta wywolywana emtode
// Nie trzeba pisac METODA() throws JakisException gyd rzucany wyjatek obluzymy w tej samej metodzie

public class Main {
    static public int divide(int a, int b) throws ArithmeticException {
        if (b == 0)
            //nie musialbym rzuca, samo rzuci
            throw new ArithmeticException("Rzucilo wyjatkiem");
        return a / b;
    }

    public static void main(String[] args) {
//        try {
//            int result = txtFunctions.date.printf_string.Main.divide(2, 0);
//            System.out.println(result);
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Rzucilo generalnym wyjatkiem!");
//        } finally {
//            System.out.println("-Koniec-");
//        }

            // -------NEXT EXAMPLE------

//        try {
//            int result = 4 / 0;
//        } catch(ArithmeticException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally..");
//         }
//
//        try {
//            if(true) throw new TestException();
//        } catch (TestException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally..");
//        }

        // -------NEXT EXAMPLE--------

        try {
            checkIfMyException();
        } catch(AppException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    static public void throwMyEx() throws TestException {
        throw new TestException("Rzucilo wyjatkiem");
    }

    static void checkIfMyException() throws AppException {
        try {
            throwMyEx();
        } catch(TestException e) {
            throw new AppException(e.getMessage(), e);
        }
    }
}
