package Exercise_1_MZ.Ex13;

import java.time.Duration;
import java.time.LocalTime;

/**
 * 13. Utwórz obiekt typu LocalTime przechowujący godzinę 14:11 oraz obiekt typu
 * LocalTime przechowujący godzinę 18:41. Wykorzystując klasę Duration oblicz ile
 * czasu upłynęło pomiędzy godzinami.
 */

public class Main {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(14, 11);
        LocalTime localTime2 = LocalTime.of(18, 41);

        Duration duration = Duration.between(localTime, localTime2);

        System.out.println(duration);

        long minutes = duration.toMinutes();
        System.out.println("Czas pomiędzy obiektami wynosi : " + minutes / 60 + " godzin oraz " + minutes % 60 + " minut");

    }
}
