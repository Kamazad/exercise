package Exercise_2_MZ.Ex3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 3. Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
 * czy wprowadzona wartość jest poprawnym loginem użytkownika. Za poprawny login
 * uważamy tekst zawierający małe i duże litery oraz cyfry. Jego minimalna długość to 8
 * a maksymalna 16 znaków.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj login składający się z : ");
        System.out.println("ilość znaków pomiędzy 8 - 16 ");

        Pattern pattern = Pattern.compile(".{8,16}");

        boolean isOK = false;

        do {
            String loginFromConsoleLine = scanner.next();
            Matcher matcher = pattern.matcher(loginFromConsoleLine);
            if (matcher.matches()) {
                isOK = true;
                System.out.println("Dziękuję za poprawne wprowadzenie");
            } else {
                System.out.println("spróbuj jeszcze raz");
            }
        } while (!isOK);

    }
}
