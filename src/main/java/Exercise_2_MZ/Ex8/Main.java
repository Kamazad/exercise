package Exercise_2_MZ.Ex8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 8. Przygotuj wyrażenie regularne sprawdzające czy numer faktury VAT jest poprawny.
 * Przykładowy numer faktury to "FV/1024/02/2018", gdzie
 * FV - stały wpis
 * / - stały znak rozdzielający sekcje
 * 1024 - kolejny numer faktury w danym miesiącu. Numer rozpoczyna się od 1
 * / - stały znak rozdzielający sekcje
 * 02 - numer miesiąca w danym roku kalendarzowym
 * / - stały znak rozdzielający sekcje
 * 2018 - rok
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern wordFromScanner = Pattern.compile("FV/[0-9]+/[0-1][0-2]/[0-9]{4}");

        boolean isOk = false;

        System.out.println("Podaj numer faktury VAT w formie: ");
        System.out.println("FV/XXXX/MM/YYYY gdzie XXXX to liczba całkowita");
        do {
            String word = scanner.nextLine();
            Matcher matcher = wordFromScanner.matcher(word);

            if (matcher.matches()) {
                isOk = true;
                System.out.println("Dziękuje za wpisanie poprawnego numeru faktury VAT");
            } else {
                System.out.println("Niepoprawnie został wprowadzano numer faktury VAT" );
            }
        } while (!isOk);
    }
}
