package Exercise_1_MZ.Ex18;

/**
 * 11. Wykorzystując obiekt typu LocalDateTime wyświetl aktualną datę i godzinę.
 * 12. Utwórz obiekt typu LocalDate przechowujący datę 01.01.2017 oraz obiekt typu
 * LocalDate przechowujący datę 05.05.2017. Wykorzystując obiekt typu Period
 * Wyświetl ile czasu minęło pomiędzy datami.
 * 13. Utwórz obiekt typu LocalTime przechowujący godzinę 14:11 oraz obiekt typu
 * LocalTime przechowujący godzinę 18:41. Wykorzystując klasę Duration oblicz ile
 * czasu upłynęło pomiędzy godzinami.
 * 14. Wyświetl bieżącą datę i godzinę w Tokyo.
 * 15. Wyświetla bieżącą godzinę w Bydgoszczy. Wykorzystaj DateTimeFormatter aby
 * wyświetlić datę w następującym formacie
 * 3 lutego 2018 roku, sobota 22:12:27
 * OOP
 * 16. Utwórz klasę Person posiadającą pola name, surname, age.
 * 17. Utwórz konstruktor bezparametrowy.
 * 18. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienia klasy
 * Person.
 * 19. Dodaj metodę introduce wyświetlającą na konsoli imię oraz nazwisko osoby.
 * 20. Utwórz klasę Address. Dodaj do klasy pola street, city, country, flatNo, homeNo.
 * 21. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienia klasy
 * Address (street, city, country, flatNo, homeNo)
 * 22. Rozbuduj klasę Person tak aby przechowywała klasę Address.
 * 23. Utwórz nowy konstruktor przyjmujący wszystkie możliwe parametry do ustawienia
 * klasy Person (name, surname, age oraz Address)
 * 24. Utwórz metody umożliwiające ustawienie każdego parametru/pola klasy Person
 * 25. Utwórz metody umożliwiające ustawienie każdego parametry/pola klasy Address
 * 26. Utwórz metody umożliwiające pobranie każdego parametru/pola klasy Person
 * 27. Utwórz metody umożliwiające pobranie każdego parametru/pola klasy Address
 * 28. Utwórz klasę Engine posiadającą pola capacity, horsePower, fuelConsumption..
 * 29. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienie klasy
 * Engine
 * 30. Utwórz metody umożliwiające ustawienie każdego parametru/pola klasy Engine
 * 31. Utwórz metody umożliwiające ustawienie każdego parametry/pola klasy Engine
 * 32. Utwórz klasę abstrakcyjną Car posiadającą pola producer, model, color,
 * seatsNumber oraz Engine.
 * 33. Utwórz klasę SportCar dziedziczącą po klasie Car
 * 34. Utwórz konstruktor bezparametrowy w klasie Car, który inicjalizuje pole seatsNumber
 * wartością 2.
 * 35. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienie klasy
 * SportCar.
 * 36. Zmodyfikuj utworzony konstruktor tak aby wywołał wieloparametrowy konstruktor
 * klasy Car.
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
 * Różne
 * 38. Napisz program obliczający pole powierzchni koła. Promień koła użytkownik
 * wprowadza z klawiatury. Program powinien zasygnalizować błędne dane (liczbę
 * ujemną lub zero) i ponownie zapytac o długośc promienia. Wykorzystaj metodę
 * Parse klasy float. Oczywiście nie zapomnij o przechwyceniu ewentualnych wyjątków.
 * 39. Napisz program, który pobiera od użytkownika serię liczb różnych od zera (Zero
 * kończy wprowadzanie danych). Po wprowadzeniu danych program oblicza sumę
 * liczb wprowadzonych przez użytkownika, najmniejszą oraz największą liczbę. Na
 * koniec działania wyświetla obliczone wartości. Oczywiście nie zapomnij o
 * przechwyceniu ewentualnych wyjątków.
 * 40. Napisz program rozwiązujący równanie kwadratowe ax2 + bx + c. Użytkownik musi
 * podać wartości a, b oraz c. Program musi sprawdzić czy wprowadzone liczby są
 * cyframi. Jeśli nie użytkownik musi podać wartości do momentu aż będą poprawne.
 * Korzystając z pętli switch wyznacz pierwiastki równania kwadratowego w zależności
 * od ilości rozwiązań (Mogą być 2, 1 lub wcale). Postaraj się przygotować klasę i
 * metodę odpowiedzialną za obliczanie rozwiązania. Klasa powinna zawierać metodę
 * o następującej sygnaturze (sygnatura do definicja metody składająca się z
 * modyfikatora dostępu, zwracanego typu, nazwy, oraz przyjmowanych argumentów)
 * public Solution calculate(int a, int b, int c)
 * */

public class Main {
}
