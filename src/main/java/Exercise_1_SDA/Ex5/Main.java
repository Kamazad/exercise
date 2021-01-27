package Exercise_1_SDA.Ex5;

public class Main {
    public static void main(String[] args) {
        int[] table = new int[]{4564, 152, -46, 464, -4613, -463217, 465793};

        int[] min = new int[]{table[0]};
        int[] max = new int[]{table[0]};

        for (int i = 1; i < table.length; i++) {
            if (table[i] < min[0]) {
                min[0] = table[i];
            }
            if (table[i] > max[0]) {
                max[0] = table[i];
            }
        }
        System.out.println("Wartość minimalna w tablicy to :" + min[0]);
        System.out.println("Wartość maksymalna w tablicy to :" + max[0]);
    }
}
