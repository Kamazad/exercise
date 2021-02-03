package Exercise_1_MZ.Ex9;


import java.time.LocalTime;

/**
 * 9. Wykorzystując obiekt typu LocalTime wyświetl aktualny czas.
 * */

public class Main {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
