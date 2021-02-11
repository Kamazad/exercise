package Exercise_3_SDA.Ex11_to_Ex13;



/**
 * 11. Napisz klasy: Rectangle, Circle i Triangle. Każda z tych klas powinna posiadać odpowiednie
 * pola i konstruktor oraz metodę getArea - obliczającą pole:
 * 1. Prostokąta – wysokość * szerokość
 * 2. Koła – Pi * promień * promień
 * 3. Trójkąta – ½ * wysokość * podstawa
 * 12. Napisz metodę, która policzy łączne pole powierzchni paru utworzonych figur.
 * 13. Mając podaną powierzchnię X, która może zostać pokryta przez farbę, napisz metodę, która
 * sprawdzi, czy daną ilością farby można zamalować wszystkie podane figury.
 *
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0D);

        circle.willItBeEnoughPaint(51D);
    }
}
