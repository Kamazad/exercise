package Exercise_2_MZ.Ex2;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Przygotuj aplikację pobierającą od użytkownika ciąg znaków i sprawdzającą czy
 * podany tekst jest poprawnym polskim kodem pocztowym (np. 85-155, 00-122)
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean isOK = false;
        Pattern pattern = Pattern.compile("[0-9][0-9]-[0-9][0-9][0-9]");
        do {
            System.out.println("Podaj, kod pocztowy");

            String postalCode = scanner.next();
            Matcher matcher = pattern.matcher(postalCode);

            if (matcher.matches()) {
                isOK = true;
                System.out.println(String.format("Dziękuję za wprowadzenie prawidłowego kodu pocztowego %s", postalCode));
            } else {
                System.out.println(String.format("Kod %s, jest niepoprawny kod, podaj jeszcze raz",  postalCode));
            }
        } while (!isOK);
    }
}
