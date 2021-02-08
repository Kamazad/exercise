package Exercise_2_SDA.Ex3_to_Ex11;


import java.util.Objects;

public class Complex {

    //double x;
    double real;
    double imaginary;

    public static int howManyComplexNumbers = 0;


    // x = a +bi
    //i^2 = -1
//3a.
    public Complex(double a, double b) {
        this.real = a;
        this.imaginary = b;
        this.howManyComplexNumbers++;
    }
//3b.
    public Complex(double a) {
        this.real = a;
        this.imaginary = 0D;
        this.howManyComplexNumbers++;
    }

//3c.
    public void print() {
        if (this.imaginary > 0) {
            System.out.println("liczba zespolona = " + this.real + " + " + this.imaginary + "i");
        } else if (this.imaginary < 0) {
            System.out.println("liczba zespolona = " + this.real + " - " + (this.imaginary * (-1)) + "i");
        } else if (this.imaginary == 0) {
            System.out.println("liczba zespolona = " + this.real);

        }

    }

//4.
    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }
//5.
    public boolean isEqualTo(Complex complex) {
        if (this.real == complex.real) {
            if (this.imaginary == complex.imaginary) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
//6.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.real, real) == 0 && Double.compare(complex.imaginary, imaginary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }
//7 i 8
    public void addingComplexNumber(Complex complex) {
        this.real += complex.real;
        this.imaginary += complex.imaginary;
    }
//9.
    public void addingComplexNumber(Complex complex1, Complex complex2) {
        this.real += complex1.real + complex2.real;
        this.imaginary += complex1.imaginary + complex2.imaginary;
    }
//10.
    public void addingComplexNumber(Complex... complexes) {
        for (int i = 0; i < complexes.length; i++) {
            this.real += complexes[i].real;
            this.imaginary += complexes[i].imaginary;
        }
    }
//11.
    public static int countComplexNumbers(){
        return howManyComplexNumbers;
    }

}
