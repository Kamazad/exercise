package Exercise_2_MZ.Ex10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 10. Przygotuj aplikację, która pobierze od użytkownika numer pesel, a następnie
 * wykorzystując wyrażenia regularne (a w nich grupy) wyświetli informacje:
 * Data urodzenia:
 * dzień: <dzień>
 * miesiąc: <miesiąc> (zapisany słownie np. listopad)
 * rok: <rok>
 * Numer serii: <numer>
 * Płeć: M lub K0
 * Cyfra kontrolna: <cyfra>
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern wordFromScanner = Pattern.compile("[0-9]{2}[0-3][0-9][0-3][0-9]{6}");

        byte[] peselAsByteTable = new byte[11];
        boolean isOk = false;

        String yearString = new String();
        String monthString = new String();
        String dayString = new String();
        String serialString = new String();
        String controlSumString = new String();
        Gender gender = null;


        System.out.println("Podaj numer PESEL ");
        do {
            //String word = scanner.nextLine();
            String word = "86061416778";
            Matcher matcher = wordFromScanner.matcher(word);
            if (matcher.matches()) {
                System.out.println("Pierwszy etap weryfikacji");
                yearString = word.substring(0, 2);
                monthString = word.substring(2, 4);
                dayString = word.substring(4, 6);
                serialString = word.substring(6, 10);
                controlSumString = word.substring(10);

                //rok
                if (monthString.charAt(0) >= '2') {
                    //po roku 2000
                    yearString = "20".concat(yearString);

                } else {
                    yearString = "19".concat(yearString);
                }
                //miesiac
                if (monthString.charAt(0) == '1' && monthString.charAt(1) > '2') {
                    System.out.println("jest tylko 12 miesięcy w roku");
                    isOk = false;
                    break;
                } else if (monthString.charAt(0) == '3' && monthString.charAt(1) > '2') {
                    System.out.println("jest tylko 12 miesięcy w roku");
                    isOk = false;
                    break;
                }
                monthString = sprawdz_date(monthString);

                //płeć

                gender = Gender.gender(serialString);

                isOk = true;
            } else {
                System.out.println("Niepoprawnie został wprowadzano numer PESEL");
            }

        } while (!isOk);
        if (isOk) {
            System.out.println(String.format("Data urodzenia: \n" +
                    "dzień: %s\n" +
                    "miesiąc: %s\n" +
                    "rok: %s\n" +
                    "Numer serii: %s\n" +
                    "Płeć: %s\n" +
                    "Cyfra kontrolna: %s", dayString, monthString, yearString, serialString, gender, controlSumString));
        }

    }

    public static String sprawdz_date(String monthString) {
        switch (monthString) {
            case "01":
            case "21":
                monthString = "Styczeń";
                break;
            case "02":
            case "22":
                monthString = "Luty";
                break;
            case "03":
            case "23":
                monthString = "Marczec";
                break;
            case "04":
            case "24":
                monthString = "Kwiecień";
                break;
            case "05":
            case "25":
                monthString = "Maj";
                break;
            case "06":
            case "26":
                monthString = "Czerwiec";
                break;
            case "07":
            case "27":
                monthString = "Lipiec";
                break;
            case "08":
            case "28":
                monthString = "Sierpień";
                break;
            case "09":
            case "29":
                monthString = "Wrzesień";
                break;
            case "10":
            case "30":
                monthString = "Październik";
                break;
            case "11":
            case "31":
                monthString = "Listopad";
                break;
            case "12":
            case "32":
                monthString = "Grudzień";
                break;


        }
        return monthString;
    }
}


