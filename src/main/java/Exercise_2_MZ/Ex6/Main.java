package Exercise_2_MZ.Ex6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 6. Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
 * czy wprowadzony numer seryjny jest poprawny. Numer seryjny składa się z 3 dużych
 * liter, 5 cyfr, 1 małej litery i 1 dużej litery np. VSD43281fA.
 * */

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Pattern wordAlaPattern = Pattern.compile("[A-Z]{3}[0-9]{5}[a-z][A-Z]");

        boolean isOk = false;

        System.out.println("Podaj numer seryjny w formie: ");
        System.out.println("3 duże litery, 5 cyfr, 1 małej litery i 1 dużej litery np. VSD43281fA.");
        do {
            String word = scanner.nextLine();
            Matcher matcher = wordAlaPattern.matcher(word);

            if (matcher.matches()) {
                isOk = true;
                System.out.println("Dziękuje za wpisanie poprawnej numer seryjny");
            } else {
                System.out.println("Niepoprawnie został wprowadzano numer seryjny");
            }
        } while (!isOk);
    }
}