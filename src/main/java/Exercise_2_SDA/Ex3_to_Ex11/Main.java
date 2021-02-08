package Exercise_2_SDA.Ex3_to_Ex11

import static Exercise_2_SDA.Ex3_to_Ex11.Complex.howManyComplexNumbers;

/**
 * 3. Napisz klasę Complex do obsługi liczb zespolonych. Klasa powinna posiadać:
 * a) Konstruktor
 * b) Drugi konstruktor dla przypadku, gdy część urojona jest równa zero
 * c) Metodę print wypisującą liczbę w postaci a + b*i
 * (pamiętaj o przypadkach, gdy część
 * urojona jest równa zero lub mniejsza od zera)
 * 4. Zamiast metody print nadpisz metodę toString.
 * 5. Do klasy Complex dopisz metodę isEqualTo, która sprawdzi,
 * czy bieżący obiekt ma takie same części rzeczywistą i
 * urojoną jak liczba przekazana w parametrze tej funkcji.
 * Przykład:
 * z1 = 3 + 5i
 * z2 = 3 + 5i
 * z3 = 5 + 3i
 * z1.isEqualTo(z2) // true
 * z2.isEqualTo(z3) // false
 * 6. Zamiast metody isEqualTo nadpisz metodę equals.
 * 7. Napisz metodę, która dodaje dwie liczby zespolone.
 * 8. Napisz metodę, która do danej liczby zespolonej doda
 * drugą liczbę zespoloną.
 * 9. Napisz metodę, która dodaje trzy liczby zespolone.
 * 10. Napisz metodę, która dodaje dowolną ilość liczb zespolonych.
 * 11. Napisz metodę, która zwróci ile zostało już utworzonych
 * liczb zespolonych.
 */
public class Main {
    public static void main(String[] args) {
        Complex z1 = new Complex(4.0D, 123.0D);
        Complex z2 = new Complex(4.0D, 123.0D);
        Complex z3 = new Complex(5.0D, 123.0D);
        Complex z4 = new Complex(4.0D);

        z1.print();

        System.out.println(z1.toString());

        System.out.println(z1.isEqualTo(z2));
        System.out.println(z1.isEqualTo(z3));
        System.out.println(z1.isEqualTo(z4));

        //metoda equals
        System.out.println(z1.equals(z2));
        System.out.println(z1.equals(z3));
        System.out.println(z1.equals(z4));



        //z1.addingComplexNumber(z2);
        //z1.print();
        //z1.addingComplexNumber(z2, z3);
        //z1.print();
        z1.addingComplexNumber(z2,z3,z4);
        z1.print();
        System.out.println(howManyComplexNumbers);
    }
}
