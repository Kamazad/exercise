package Exercise_1_SDA.Ex9AND10;

public class Main {

    public static double modulo (double x, double y){
        int a = (int) (x/y) ;
        int b = a *(int)y;
        return (x-b);
    }

    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 3;


        int x = (int) modulo(var1,var2);

        if (x == (var1%var2)){
            System.out.println("funkcja działa");
        } else {
            System.out.println("Funkcja nie działa");
        }
    }
}
