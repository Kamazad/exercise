package Exercise_2_SDA.Ex12_AND_EX13;

/**
 * 12. Napisz klasę OrderItem (pozycja zamówienia):
 * a) będzie ona przechowywała następujące informacje:
 * 1. Nazwa produktu
 * 2. Ilość
 * 3. Cena jednostkowa
 * b) Napisz odpowiedni konstruktor.
 * c) Klasa powinna również zawierać metody:
 * 1. getValue – oblicza wartość danej pozycji zamówienia
 * 2. isCorrect – sprawdza, czy pozycja jest prawidłowa,
 * tzn. ilość i cena są większe od zera
 * 3. print – wyświetla daną pozycję zamówienia,
 * np. Cukier 4,00 zł 3 szt 12,00 zł
 * 13. Napisz klasę Order (zamówienie):
 * a) w tablicy będzie ona przechowywała pozycje zamówienia.
 * b) Napisz konstruktor, który utworzy zamówienie
 * o zadanej liczbie pozycji.
 * c) Klasa powinna również zawierać metody:
 * 1. addItem – dodaje pozycję zamówienia, ale tylko wtedy, gdy w
 * zamówieniu jest jeszcze miejsce i jeżeli pozycja zamówienia jest
 * prawidłowa
 * 2. getValue – oblicza łączną wartość zamówienia
 * 3. getItemsCount – oblicza łączną liczbę zamówionych produktów
 * 4. print – wyświetla dane zamówienia, np.
 * Chleb 3,50zł 1 szt 3,50zł
 * Cukier 4,00 zł 3 szt 12,00 zł
 * Wartość zamówienia: 15,50 zł
 */
public class Main {
    public static void main(String[] args) {
        OrderItem orderItem = new OrderItem("Cukier", 4, 3.00);
        orderItem.print();
    }
}
