package Exercise_1_SDA.Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        Scanner scannner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        x = scannner.nextInt();
        System.out.println("Podaj drugą liczbę");

        y = scannner.nextInt();
        Integer[] suma = new Integer[]{0};
        if (x - y < 0) {

            for (int i = x; i <= y; i++) {
                suma[0] += i;
            }
            System.out.println("Suma liczb od : " + x + " do : " + y + " wynosi : " + suma[0]);
        } else if (x - y > 0) {

            for (int i = y; i <= x; i++) {
                suma[0] += i;
            }
            System.out.println("Suma liczb od : " + x + " do : " + y + " wynosi : " + suma[0]);
        } else {
            System.out.println("podane liczby są takie same");
        }



    }
}
