package lambdaExpressions.lambdaBasics;

// Aby moc skorzystac z wyrazenia lambda musi istniec interface posiadajacy w sobie jedna abstrakcyjna metode.
// Wtedy tworzymy zmienna o jego typie (tego interejsu) i przypisujemy do niej wyrazenie lambda - tak jakby cialo to funkcji
// W rzeczywistosci "pod spodem" tworzony jest obiekt implementujacy ten interfejs

// interfejs funkcyjny
@FunctionalInterface // adnotacja powiadamia kompilator ze ma to byc interf. funkcujny, wiec jesli nie bedzie (np. bedzie zawierac dwie metody) to zwroci blad
interface Addition {
    public abstract int add(int a, int b);
}

@FunctionalInterface
interface MathOperation<T> {
    public abstract T operation(T a, T b);
}

// z 2 typami generycznymi
@FunctionalInterface
interface Multi<T, U> {
    U add(T a, U b);
}

public class Main {
    public void printAdd(Addition addition) {
        System.out.println(addition.add(6, 6));
    }

    public static void main(String[] args) {
        Addition addition = (int a, int b) -> a + b;
        int result = addition.add(2, 3);
        System.out.println(result);
        new Main().printAdd(addition); // od razu mozna obiekt stworzyc bez przypisywania
        Main main = new Main();
        main.printAdd((int a, int b) -> a * 2 + b); // przekazuje inna implementacje metody add interfejsu addition

        MathOperation<Integer> odejmowanie = (Integer a, Integer b) -> a - b;
//        MathOperation<Integer> odejmowanie = (a, b) -> a - b;  // nie trzeba podawac typu, kompilator sam rozpozna jaki typ potrzebny w metodzie
        System.out.println(odejmowanie.operation(10, 4));

        Multi<Integer, Float> multi = (a, b) -> a + b;
        System.out.println(multi.add(8, 7.0f));
    }
}
