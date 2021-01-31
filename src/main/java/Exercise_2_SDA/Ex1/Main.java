package Exercise_2_SDA.Ex1;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void f ( int...t) {
        if (t[1] > 5)
            System.out.println("x");
        else
            System.out.println("y");

        int s = 0;
        for (int j : t) {
            s += j;
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        f(a, b, a + b);
        System.out.println(a);
    }



        }


