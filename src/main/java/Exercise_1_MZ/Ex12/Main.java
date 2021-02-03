package Exercise_1_MZ.Ex12;

import java.time.LocalDate;
import java.time.Period;

/**
 * 12. Utwórz obiekt typu LocalDate przechowujący datę 01.01.2017 oraz obiekt typu
 * LocalDate przechowujący datę 05.05.2017. Wykorzystując obiekt typu Period
 * Wyświetl ile czasu minęło pomiędzy datami.
*/

public class Main {
    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.of(2017,1,1);
        LocalDate secondDate = LocalDate.of(2017,5,5);

        Period period = Period.between(firstDate,secondDate);

        System.out.println(period);
    }
}
