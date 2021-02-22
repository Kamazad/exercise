package Exercise_2_MZ.Ex4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 4. Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
 * czy wprowadzona wartość zawiera słowo "ala".
 * */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern wordAlaPattern = Pattern.compile(".*" + "ala"+ ".*");

        boolean isOk = false;

        System.out.println("Podaj ciąg znaków by sprawdzić czy znajduję się tam słowo ala");
        do {
            String word = scanner.nextLine();
            Matcher matcher = wordAlaPattern.matcher(word);

            if (matcher.matches()){
                isOk =true;
                System.out.println("tak w można znaleźć słowo ala w podanym inpucie");
                System.out.println(String.format("na pozycji %s", word.indexOf("ala")+1));
            } else {
                System.out.println("nie znaleziono");
            }
        } while (!isOk);

    }
}
