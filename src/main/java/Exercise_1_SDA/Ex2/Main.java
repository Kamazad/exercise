package Exercise_1_SDA.Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Adding Scanner variable
        Scanner scanner = new Scanner(System.in);
        //Variable that we want to check
        long checking;

        boolean isPrime = true;
        //Reading number from console and checking if number is below 2
        do {
            System.out.println("Podaj jakąś liczbę całkowitą większą od 2");
            checking = scanner.nextLong();

            if (checking == 1) {
                isPrime = false;
            }
        } while (checking < 2);

        //Square root of number to limit search area
        double squareRoot = Math.sqrt(checking);
        squareRoot = Math.round(squareRoot);

        //Writing smallest diveder of number
        Integer[] diveder = new Integer[]{0};

        //Searching if number is Prime
        for (int i = 2; i <= squareRoot; i++) {
            if ((checking % i) == 0) {
                isPrime = false;
                diveder[0] = i;
                break;
            }
        }
        //Results
        if (isPrime || checking == 2) {
            System.out.println("Podana liczba : " + checking + " jest liczbą pierwszą");
        } else {
            System.out.println("Podana liczba : " + checking + " nie jest liczbą pierwszą");
            System.out.println("Jej najniższym dzielnikiem jest liczba " + diveder[0]);
        }
    }
}
