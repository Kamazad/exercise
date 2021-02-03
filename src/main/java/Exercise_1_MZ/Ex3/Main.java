package Exercise_1_MZ.Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Utwórz listę ArrayList przechowującą liczby zmiennoprzecinkowe. Dodaj ręcznie 10
 * liczb do listy.
 * a. Wyświetl sumę pierwszego i ostatniego elementu zapisanego w liście..
 * b. Wyświetl iloczyn pierwszego i ostatniego elementu zapisanego w liście.
 * c. Wyświetl iloraz drugiego i przedostatniego elementu zapisanego w liście.
 */

public class Main {
    public static void main(String[] args) {

        List<Double> doubles = new ArrayList<>();

        //modyfikacja zadania dodano 10 elementów wykorzystując klasę Random

        Random generator = new Random(50000);

        for (int i = 0; i < 10; i++) {
            double x = generator.nextDouble();
            doubles.add(x*10000); //trochę powiększymy liczbę
        }
        //a.
        doubles.add(59D);
        doubles.add(9321D);
        doubles.add(45646D);
        doubles.add(29D);
        doubles.add(19D);
        doubles.add(6549D);
        doubles.add(54659D);
        doubles.add(6469D);
        doubles.add(65465469D);
        doubles.add(55469D);

        System.out.println("First element :" + doubles.get(0));
        System.out.println("Last element :" + doubles.get(doubles.size() - 1));
        System.out.println("Sum of first and last element :" + (doubles.get(doubles.size() - 1) + doubles.get(0)));

        //b.
        System.out.println("Multiplying first and last element we will get :"+ (doubles.get(doubles.size() - 1) * doubles.get(0)));

        //c.
        System.out.println("Second element :" + doubles.get(1));
        System.out.println("Second from tail (from end) element :" + doubles.get(doubles.size()-2));
        System.out.println("Multiplying second and second from end element we will get :"+ (doubles.get(doubles.size() - 2) * doubles.get(1)));

    }
}
