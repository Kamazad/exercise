package Exercise_1_MZ.Ex16_to_Ex27;

/**
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
 * 27. Utwórz metody umożliwiające pobranie każdego parametru/pola klasy Addres
 */

public class Main {
    public static void main(String[] args) {
        Person person = new Person("adam", "jakis", 32);

        person.introduce();
    }
}
