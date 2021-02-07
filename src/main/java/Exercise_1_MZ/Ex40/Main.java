package Exercise_1_MZ.Ex40;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 40. Napisz program rozwiązujący równanie kwadratowe ax2 + bx + c. Użytkownik musi
 * podać wartości a, b oraz c. Program musi sprawdzić czy wprowadzone liczby są
 * cyframi. Jeśli nie użytkownik musi podać wartości do momentu aż będą poprawne.
 * Korzystając z pętli switch wyznacz pierwiastki równania kwadratowego w zależności
 * od ilości rozwiązań (Mogą być 2, 1 lub wcale). Postaraj się przygotować klasę i
 * metodę odpowiedzialną za obliczanie rozwiązania. Klasa powinna zawierać metodę
 * o następującej sygnaturze (sygnatura do definicja metody składająca się z
 * modyfikatora dostępu, zwracanego typu, nazwy, oraz przyjmowanych argumentów)
 * public Solution calculate(int a, int b, int c)
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Witam w programie do obliczeń równań kwadratowych ax^2+bx+c");
        Scanner scanner = new Scanner(System.in);
        boolean isNumber = false;

        float a = 0F;
        float b = 0F;
        float c = 0F;
        do {
            System.out.println("Podaj wartość parametru a");
            try {
                a = scanner.nextFloat();
                isNumber = true;
            } catch (InputMismatchException ime) {
                System.out.println("Podana wartość nie łapie się w floata");
                isNumber = false;
                scanner.next();
            }
        } while (!isNumber);

        do {
            System.out.println("Podaj wartość parametru b");
            try {
                b = scanner.nextFloat();
                isNumber = true;
            } catch (InputMismatchException ime) {
                System.out.println("Podana wartość nie łapie się w floata");
                isNumber = false;
                scanner.next();
            }
        } while (!isNumber);

        do {
            System.out.println("Podaj wartość parametru c");
            try {
                c = scanner.nextFloat();
                isNumber = true;
            } catch (InputMismatchException ime) {
                System.out.println("Podana wartość nie łapie się w floata");
                isNumber = false;
                scanner.next();
            }
        } while (!isNumber);

        System.out.println("Podane parametry to a = " + a);
        System.out.println("Podane parametry to b = " + b);
        System.out.println("Podane parametry to c = " + c);
    }


}

