package Exercise_1_MZ.Ex15;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


/**
 * 15. Wyświetla bieżącą godzinę w Bydgoszczy. Wykorzystaj DateTimeFormatter aby
 * wyświetlić datę w następującym formacie
 * 3 lutego 2018 roku, sobota 22:12:27
 */

public class Main {
    public static void main(String[] args) {

        ZoneId zoneIdOfBydgoszcz = ZoneId.of("GMT+1");
        LocalDateTime localDateTime = LocalDateTime.now(zoneIdOfBydgoszcz);
        //przy M i E muszą być 4 znaki patrz documentation of DateTimeFormatter
        String pattern = "dd MMMM yyyy 'roku', EEEE HH:mm:ss ";
        DateTimeFormatter printDate = DateTimeFormatter.ofPattern(pattern);
        System.out.println(printDate.format(localDateTime));
    }
}
