package Exercise_2_MZ.Ex5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 5. Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzjącą
 * czy wprowadzona data jest poprawna. Za poprawną datę uważamy zapis w postaci
 * "10.02.2018r.". Na potrzeby zadania nie weryfikujemy wartości dnia miesiąca. 45 to
 * też poprawna wartość.
 * */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern wordAlaPattern = Pattern.compile("[0-3][0-9]\\.[0-1][0-9].[0-9][0-9][0-9][0-9]r\\.");

        boolean isOk = false;

        System.out.println("Podaj ciąg date w systemie DD.MM.YYYYr.");
        do {
            String word = scanner.nextLine();
            Matcher matcher = wordAlaPattern.matcher(word);

            if (matcher.matches()){
                isOk =true;
                System.out.println("Dziękuje za wpisanie poprawnej daty");
            } else {
                System.out.println("Niepoprawnie została wprowadzona data");
            }
        } while (!isOk);
    }
}
