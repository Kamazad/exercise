package Exercise_1_MZ.Ex39;


import java.util.List;

public class Methods {
    public static Double sumator(List<Double> list) {
        double suma = 0D;
        for (int i = 0; i < list.size(); i++) {
            suma = suma + list.get(i);
        }
        return suma;
    }

    public static Double min(List<Double> list) {
        Double min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static Double max(List<Double> list) {
        Double max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }
}
