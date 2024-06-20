package MyTasks.mathExceptions;

abstract class MathException extends ArithmeticException {
    public MathException(String s) {
        super(s);
    }
//    dane od picu, wystarczyloby pozniej System.out.println(e.getMessage());
    public abstract void printError();
}

class IntegerOverflowException extends MathException {
    public IntegerOverflowException(String operator, int op1, int op2) {
        super("Wartosc Integer'a wykracza poza wartosc, " + op1 + " " + operator + " " + op2);
    }

    @Override
    public void printError() {
        System.out.println(this.getMessage());
    }
}

class DivideByZeroException extends MathException {
    public DivideByZeroException(int op1) {
        super("Dzielenie przez 0 liczby " + op1);
    }

    @Override
    public void printError() {
        // getMessage() dostepna bo dziedziczymy z naszego wyjatku MathException -> ArithmException -> ... -> Throwable
        System.out.println(this.getMessage());
    }
}


public class Main {
    public static void main(String[] args) {
        try {
            int addResult = Main.add(Integer.MAX_VALUE, 1);
            int addResult2 = Main.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
            System.out.println(addResult);

            double divResult = Main.divide(5, 0);
            System.out.println(divResult);
        } catch (MathException e) {
            e.printError();
//            to samo
//            System.out.println(e.getMessage());
        }
    }

    static int add(int a, int b) throws MathException {
        long result = 0;
        result  =  (long) a + b;
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            throw new IntegerOverflowException("+", a, b);
        return (int) result;
    }

    static double divide(int a, int b) throws MathException {
        if (b == 0) throw new DivideByZeroException(a);
        double result = a / b;
        return result;
    }
}
