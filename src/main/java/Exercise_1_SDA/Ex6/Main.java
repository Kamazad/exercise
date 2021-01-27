package Exercise_1_SDA.Ex6;


public class Main {
    public static void main(String[] args) {
        int[] table = new int[]{4564, -152, -46, 464, -4613, -463217, 465793};
        int[] suma = new int[]{0};
        for (int i = 0; i < table.length; i++) {
            if (table[i] < 0) {
                suma[0] += 1;
            }
        }
        if (suma[0] == 0) {
            System.out.println("nie ma liczb ujemnych");

        } else {
            int[] negativeTable = new int[suma[0]];
            int y=0;
            for (int i = 0; i < table.length; i++) {
                if (table[i] < 0) {
                    negativeTable[y] += table[i];
                    y++;
                }
            }
            for (int x : negativeTable) {
                System.out.println(x);
            }

        }

    }
}
