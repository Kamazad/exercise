package Exercise_1_MZ.Ex11;

import java.time.LocalDateTime;

/**
 * 11. Wykorzystując obiekt typu LocalDateTime wyświetl aktualną datę i godzinę.
 * */

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
