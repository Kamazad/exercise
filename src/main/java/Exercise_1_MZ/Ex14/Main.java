package Exercise_1_MZ.Ex14;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * 14. Wyświetl bieżącą datę i godzinę w Tokyo.
 */
public class Main {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        LocalDateTime localDateTime = LocalDateTime.now(zoneId);

        System.out.println(localDateTime);
    }
}
