package Exercise_2_MZ.Ex7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 7. Numer seryjny oprogramowania ma postać "CFG&Y-TYH67-GH56T-UIO99-RY4RT",
 * gdzie każdy blok może składać się z dużych liter lub cyfr. Bloki oddzielone są
 * myślnikami "-". W numerze występuje dokładnie 5 bloków z wartościami. Przygotuj
 * wyrażenie regularne sprawdzające numer seryjny.
 * */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern wordFromScanner = Pattern.compile("[a-zA-Z0-9]{5}-[a-zA-Z0-9]{5}" +
                "-[a-zA-Z0-9]{5}-[a-zA-Z0-9]{5}-[a-zA-Z0-9]{5}");

        boolean isOk = false;

        System.out.println("Podaj numer seryjny w formie: ");
        System.out.println("XXXXX-XXXXX-XXXXX-XXXXX-XXXXX");
        do {
            String word = scanner.nextLine();
            Matcher matcher = wordFromScanner.matcher(word);

            if (matcher.matches()) {
                isOk = true;
                System.out.println("Dziękuje za wpisanie poprawnego numeru seryjnego");
            } else {
                System.out.println("Niepoprawnie został wprowadzano numer seryjny");
            }
        } while (!isOk);
    }
}
