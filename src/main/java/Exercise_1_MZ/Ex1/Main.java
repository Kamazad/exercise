package Exercise_1_MZ.Ex1;

/**
 * 1. Utwórz 10 elementową tablicę przechowującą liczby całkowite (int)
 * a. Dodaj 10 kolejnych liczb do tablicy rozpoczynając od liczby 1
 * b. Wyświetl długość tablicy
 * c. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
 * d. Wykorzystując pętlę for pomnóż przez 2 kolejno każdy element w tablicy i
 * zapisz go ponownie w tablicy.
 * e. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
 */

public class Main {
    public static void main(String[] args) {
        //1
        int[] table = new int[10];
        //a.
        for (int i = 0; i < 10; i++) {
            table[i] = i + 1;
        }


        //b.
        System.out.println("Table length is : " + table.length);

        //c
        for (int x : table) {
            System.out.print(x + " ");
        }

        //d
        for (int i = 0; i < table.length; i++) {
            table[i] = table[i] * 2;
        }
        //e
        System.out.println();
        for (int x : table) {
            System.out.print(+ x + " ");
        }
    }
}
