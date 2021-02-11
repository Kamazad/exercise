package Exercise_2_MZ.Ex1;

import Exercise_3_SDA.Ex15_to_Ex21.Mammal;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
 * czy wprowadzona wartość jest wartością liczbową. Jeśli użytkownik wprowadził
 * liczbę, sprawdź czy jest parzysta czy nieparzysta. Wyświetl komunikat informujący
 * użytkownika o wprowadzeniu poprawnej lub błędnej liczby oraz o jej parzystości lub
 * nieparzystości.
 * */

public class Main {
    public static void main(String[] args) {

        System.out.println("Proszę wpisać liczbę");
        //declaring scanner
        Scanner scanner = new Scanner(System.in);
        // scanning String (user input)
        String text = scanner.nextLine();

        //declaring regular expression in pattern to accept only numbers
        Pattern pattern = Pattern.compile("[0-9]+");
        //using method matcher on pattern to initializing new instance od Matcher.
        Matcher matcher = pattern.matcher(text);

        // finding if defined regular expression fits to user input
        if(matcher.matches()){
            System.out.println("Brawo wpisałeś liczbę");
            //parsing String to integer
            Integer x = Integer.parseInt(text);
            //if statement to find out if it is Even or Odd number
            if (x % 2 !=0){
                System.out.println("i jest to liczba nieparzysta !!");
            } else {
                System.out.println("i jest to liczba parzysta !!");
            }
        } else {
            System.out.println("Hej, czemu nie wpisałeś liczby?");
        }
    }
}
