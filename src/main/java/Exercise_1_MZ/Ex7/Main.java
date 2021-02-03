package Exercise_1_MZ.Ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * Utwórz listę ArrayList przechowującą liczby całkowite.
 * a. Dodaj 5 liczb do listy.
 * b. Pobierz 6 element z listy.
 * c. Uruchom aplikację i sprawdź co pokaże IntelliJ w logach oraz w stacktrace.
 * d. Zabezpiecz kod za pomocą klauzuli try catch.
 * e. W przypadku wystąpienia błędu wyświetl stosowny komunikat.
* */

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //a.
        list.add(56733);
        list.add(254724);
        list.add(54564);
        list.add(32234);
        list.add(92113);

        //b.
        //IndexOutOfBoundException
        //list.get(6);

        //c.

        //d.
        try {
            list.get(6);
        } catch (IndexOutOfBoundsException ioobe){
            System.err.println("Pobrałeś wartość spoza zakresu tablicy " + ioobe.getMessage());
        }
    }
}
