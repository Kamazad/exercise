package Exercise_1_MZ.Ex39;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 39. Napisz program, który pobiera od użytkownika serię liczb różnych od zera (Zero
 * kończy wprowadzanie danych). Po wprowadzeniu danych program oblicza sumę
 * liczb wprowadzonych przez użytkownika, najmniejszą oraz największą liczbę. Na
 * koniec działania wyświetla obliczone wartości. Oczywiście nie zapomnij o
 * przechwyceniu ewentualnych wyjątków.
 */

public class Main {
    public static void main(String[] args) {

        List<Double> listOfNumbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczby (liczba 0 kończy wprowadzanie danych)");
        Double temp;
        do {
            temp = scanner.nextDouble();
            if (temp == 0) {
                break;
            }
            listOfNumbers.add(temp);
        } while (temp != 0);

        System.out.println("Suma wszystkich elementów wynosi : " + Methods.sumator(listOfNumbers));
        System.out.println("Najniższa wartość wśród wczytanych liczby wynosi : " + Methods.min(listOfNumbers));
        System.out.println("Najwyższa wartość wśród wczytanych liczby wynosi : " + Methods.max(listOfNumbers));

        //todo*
        //wyjątki
    }
}
