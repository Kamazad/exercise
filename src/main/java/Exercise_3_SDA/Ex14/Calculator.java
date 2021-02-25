package Exercise_3_SDA.Ex14;

public class Calculator implements Printer {

    private double wynik;
    private double wynikComplex;
    final static private String i = "i";


    public void add(MyNumber o1, MyNumber o2) {
        this.wynik = o1.getX() + o2.getX();
    }

    public void add(Complex o1, Complex o2) {
        this.wynik = o1.getReal() + o2.getReal();
        this.wynikComplex = o1.getImaginary() + o2.getImaginary();
    }


    @Override
    public void print() {
        if (this.wynikComplex == 0) {
            System.out.println(String.format("Wynik to liczba rzeczywista %.2f", this.wynik));
        } else  {
            System.out.println(String.format("Wynik to liczba zespolona %.2f + %.2f%s", this.wynik, this.wynikComplex, i));

        }
    }
}
