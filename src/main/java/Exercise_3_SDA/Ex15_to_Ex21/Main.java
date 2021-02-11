package Exercise_3_SDA.Ex15_to_Ex21;

import java.time.LocalDate;

/**
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
        LocalDate localDate = LocalDate.parse("2021-01-01");
        Employee employee = new Employee("Kamil", localDate, 12345D);

        Employee employee1 = new Manager("Krzyś", localDate, 1234D);
        System.out.println(employee.getDateOfBirth());

        employee1.whoAmI();
    }
}
