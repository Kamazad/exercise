package Exercise_1_MZ.Ex2;

import java.util.ArrayList;

/**Utwórz listę ArrayList przechowującą liczby całkowite.
a. Dodaj 3 dowolne liczby, a następnie wyświetl długość tablicy.
b. Wyświetl pierwszy element zapisany w liście.
c. Wyświetl ostatni element zapisany w liście
 */
public class Main {
    public static void main(String[] args) {
        //implementuje ArrayListy
        ArrayList<Integer> ints= new ArrayList<>();

        //a.
        ints.add(5);
        ints.add(60);
        ints.add(707);
        //b.
        System.out.println(ints.get(0));
        //c.
        //sprawdzenie długości i wyrzucenie ostatniego
        System.out.println(ints.get(ints.size()-1));

        //sprawdzenie czy funkcja c dobrze działa
        ints.add(324);
        System.out.println(ints.get(ints.size()-1));

    }
}
