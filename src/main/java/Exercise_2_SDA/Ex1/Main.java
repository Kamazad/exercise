package Exercise_2_SDA.Ex1;

import java.util.Scanner;

/**
 * 1. Dla podanej liczby oznaczającej numer dnia tygodnia,
 * wypisz nazwę tego dnia.
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dzień, a program powie ci co to za dzień tygodnia");

        int temp = scanner.nextInt();


        switch (temp&7) {
            case 2:
                System.out.println("Poniedziałek");
                break;
            case 3:
                System.out.println("Wtorek");
                break;
            case 4:
                System.out.println("Środa");
                break;
            case 5:
                System.out.println("Czwartek");
                break;
            case 6:
                System.out.println("Piątek");
                break;
            case 7:
                System.out.println("Sobota");
                break;
            case 1:
                System.out.println("Niedziela");
                break;
            default:
        }
    }
}






