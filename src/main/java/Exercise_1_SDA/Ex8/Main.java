package Exercise_1_SDA.Ex8;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ile liczb chcesz sprawdzić (min 3) ?");
        int lenght = scanner.nextInt();

        System.out.println("Podaj te liczby");
        int[] table = new int[lenght];

        for (int i=0; i< table.length; i++) {
            table[i] = scanner.nextInt();
        }

        int diff = table[0] - table[1];

        boolean isArithmetic = true;
        int diff2;
        for (int i = 2; i < table.length; i++) {

            diff2 = table[i-1] - table[i];
            if ((diff2 != diff)) {
                isArithmetic = false;
                break;
            }
        }

        if (isArithmetic) {
            System.out.println("Ciąg jest Arytmetyczny");
        } else if (!isArithmetic) {
            System.out.println("Ciąg Nie jest Arytmetyczny");
        }
    }
}
