package Exercise_1_MZ.Ex10;

import java.time.LocalDate;

/**
 * 10. Wykorzystując obiekt typu LocalDate wyświetl aktualną datę.
 * */

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }
}
