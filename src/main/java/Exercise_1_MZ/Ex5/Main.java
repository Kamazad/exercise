package Exercise_1_MZ.Ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Utwórz tablicę ArrayList przechowującą imiona
 * a. Korzystając z klasy Scanner pobierz od użytkownika 5 imion i zapisz je w
 * liście.
 * b. Wykorzystując pętlę while wyświetl wszystkie elementy znajdujące się w
 * liście.
 */

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        //a.
        int startOfScanning = 0;
        int howManyNames = 5;

        while (howManyNames > startOfScanning) {
            System.out.println("Podaj imię o indeksie : " + startOfScanning);
            names.add(scanner.nextLine());
            startOfScanning++;
        }
        //b.
        startOfScanning = 0;
        while (howManyNames > startOfScanning) {
            System.out.println("Pod indeksem : " + startOfScanning + " znajduję się :" + names.get(startOfScanning));
            startOfScanning++;
        }

    }
}
