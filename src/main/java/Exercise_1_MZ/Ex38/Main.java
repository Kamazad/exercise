package Exercise_1_MZ.Ex38;

import java.util.Scanner;

/**
 * 38. Napisz program obliczający pole powierzchni koła. Promień koła użytkownik
 * wprowadza z klawiatury. Program powinien zasygnalizować błędne dane (liczbę
 * ujemną lub zero) i ponownie zapytac o długośc promienia. Wykorzystaj metodę
 * Parse klasy float. Oczywiście nie zapomnij o przechwyceniu ewentualnych wyjątków.

 * */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isReal = true;
        float radius;
        do {
            System.out.println("Podaj promień koła");
            radius = scanner.nextFloat();
            if (radius<=0){
                System.out.println("Podaj wartość większą o 0 !");
                isReal = false;
            } else{
                isReal = true;
            }
        } while (!isReal);

        Circle circle = new Circle(radius);

        circle.displayArea();

        //todo
        //Parse i wyjątki
    }
}
