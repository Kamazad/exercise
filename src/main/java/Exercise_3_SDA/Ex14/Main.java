package Exercise_3_SDA.Ex14;


/**
 * 14. Napisz klasę Calculator, która będzie miała metodę add, dodającą dwie liczby i zwracającą
 * ich wynik. Metoda ta powinna umieć dodawać liczby zespolone (klasa Complex) oraz liczby
 * naturalne (klasa MyNumber). Jeśli jest taka potrzeba - zmodyfikuj odpowiednio klasy
 * Complex i MyNumber.
 */

public class Main {
    public static void main(String[] args) {

        MyNumber myNumber1 = new MyNumber(123);
        MyNumber myNumber2 = new MyNumber(123);
        Complex complex1 = new Complex(222, 111);
        Complex complex2 = new Complex(222, 111);

        Calculator calculator1 = new Calculator();
        calculator1.add(myNumber1, myNumber2);
        calculator1.print();
        System.out.println("--------------------");
        Calculator calculator2 = new Calculator();
        calculator2.add(complex1, complex2);
        calculator2.print();

    }
}
