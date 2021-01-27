package Exercise_1_SDA.Ex4;

public class Main {
    public static void main(String[] args) {
        int[] tablica = new int[]{12, 7, 19};
        int tmp = tablica[0];
        tablica[0] = tablica[2];
        tablica[2] = tmp;
        for (int printTable : tablica) {
            System.out.print(printTable + " ");
        }
    }
}
