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
 * 14. Napisz klasę Calculator, która będzie miała metodę add, dodającą dwie liczby i zwracającą
 * ich wynik. Metoda ta powinna umieć dodawać liczby zespolone (klasa Complex) oraz liczby
 * naturalne (klasa MyNumber). Jeśli jest taka potrzeba - zmodyfikuj odpowiednio klasy
 * Complex i MyNumber.
 * 15. Utwórz klasę Employee dziedziczącą po klasie Person. Dlaczego klasa jest podkreślona na
 * czerwono?
 * 16. Zmodyfikuj klasę Employee w taki sposób, żeby przy podaniu roku urodzenia z zakresu
 * innego niż 1900-2020 ustawiało rok urodzenia na 0.
 * 17. Do klasy Employee dodaj pole salary oraz metodę getSalary. Zrób tak, aby metoda whoAmI
 * dla pracownika wyświetlała tekst „Nazywam się Jan Kowalski i zarabiam 1000zł”
 * 18. Utwórz klasę Manager dziedziczącą po klasie Employee. Dla managera do pensji dodawane
 * jest 10% jako dodatek funkcyjny. Zmodyfikuj odpowiednio metodę getSalary. Zrób tak, aby
 * metoda whoAmI dla pracownika wyświetlała tekst „Nazywam się manager Jan Kowalski i
 * zarabiam 1000zł”
 * 19. Utwórz klasy Mammal (ssak) i Canidae (psowate). Zmodyfkuj klasę Dog tak, aby
 * dziedziczyła po klasach Mammal i Canidae
 * 20. Czy któraś z tworzonych przez nas klas mogłaby być oznaczona jako abstrakcyjna?
 * 21. Zastanów się nad modyfikatorami dostępu do klas Person, Employee oraz Manager. Dodaj
 * potrzebne gettery i settery.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0D);

        circle.willItBeEnoughPaint(51D);
    }
}
