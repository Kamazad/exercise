package Exercise_1_MZ.Ex37;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * 37. *Zadanie na tworzenie odpowiedniego typu
 * a. Utwórz klasę abstrakcyjną Figure posiadającą metodę abstrakcyjną float
 * countArea()
 * b. Utwórz metodę abstrakcyjną void displayArea() w klasie Figure.
 * c. Utwórz klasę Rectangle dziedziczącą po klasie Figure
 * i. dodaj pole sideA będące długością boku prostokąta.
 * ii. dodaj pole sideB będące długością boku prostokąta.
 * iii. nadpisz metodę countArea() klasy Figure i zaimplementuj ją.
 * iv. Utwórz konstruktor przyjmujący wszystkie parametry potrzebne do
 * obliczenia pola.
 * v. nadpisz metodę displayArea() tak aby wyświetlała informację:
 * “Figura: Prostokąt, pole: <obilczone_pole>”
 * gdzie <obliczone_pole> to wynik wykonania metody countArea()
 * d. Utwórz klasę Square dziedziczącą po klasie Figure
 * i. dodaj pole side będące długością boku kwadratu
 * ii. nadpisz metodę countArea() klasy Figure i zaimplementuj ją.
 * iii. Utwórz konstruktor przyjmujący wszystkie parametry potrzebne do
 * obliczenia pola.
 * iv. nadpisz metodę displayArea() tak aby wyświetlała informację:
 * “Figura: Kwadrat, pole: <obilczone_pole>”
 * gdzie <obliczone_pole> to wynik wykonania metody countArea()
 * e. Utwórz klasę Circle dziedziczącą po klasie Figure
 * i. dodaj pole radius będące promieniem okręgu
 * ii. nadpisz metodę countArea() klasy Figure i zaimplementuj ją.
 * iii. Utwórz konstruktor przyjmujący wszystkie parametry potrzebne do
 * obliczenia pola.
 * iv. nadpisz metodę displayArea() tak aby wyświetlała informację:
 * “Figura: Koło, pole: <obilczone_pole>”
 * gdzie <obliczone_pole> to wynik wykonania metody countArea()
 * f. Pobierz od użytkownika ilość poszczególnych figur (prostokąt, kwadrat, koło)
 * jakie mają zostać wygenerowane.
 * g. Utwórz listę figur o type List<Figure> figures
 * h. Utwórz odpowiednią ilość poszczególnych figur podanych przez użytkownika i
 * dodaj każdą z nich do listy figures. Podczas tworzenia figur wylosuj wartości
 * boków/promienia korzystając z klasy Random
 * i. Wyświetl po kolei powierzchnię każdej figury znajdującej się w tablicy za
 * pomocą pętli for korzystając z metody displayArea().
 */

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.displayArea();

        Square square = new Square(4);
        square.displayArea();

        Circle circle = new Circle(4);
        circle.displayArea();

        //f.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile chcesz Prostokątów ?");
        int howManyRectangles = scanner.nextInt();
        System.out.println("Ile chcesz Kwadratów ?");
        int howManySquares = scanner.nextInt();
        System.out.println("Ile chcesz Kół ?");
        int howManyCircles = scanner.nextInt();

        //g.
        List<Figure> figure = new ArrayList<>();
        //h.
        Random generator = new Random(12345);

        for (int i = 0; i < howManyRectangles; i++) {
            figure.add(new Rectangle(generator.nextFloat() * 10, generator.nextFloat() * 10));
        }

        for (int i = 0; i < howManySquares; i++) {
            figure.add(new Square(generator.nextFloat() * 10));
        }

        for (int i = 0; i < howManyCircles; i++) {
            figure.add(new Circle(generator.nextFloat() * 10));
        }

        for (Figure f : figure){
            f.displayArea();
        }
    }
}
