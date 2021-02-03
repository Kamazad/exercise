package Exercise_1_MZ.Ex4;

import java.util.ArrayList;
import java.util.List;

/**
 * Utwórz listę ArrayList przechowującą imiona.
 * a. Dodaj 5 imion do listy,
 * b. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy.
 * c. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy
 * zaczynając od ostatniego, a kończąc na pierwszym.
 * */

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //a.
        names.add("Krzyś");
        names.add("Joanna");
        names.add("Tadeusz");
        names.add("Staś");
        names.add("Helenka");

        //b.
        for (int i = 0; i< names.size(); i++){
            System.out.println(names.get(i));
        }

        //c.
        for (int i = names.size()-1; i>= 0; i--){
            System.out.println(names.get(i));
        }

    }
}
