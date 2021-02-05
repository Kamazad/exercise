package Exercise_1_MZ.Ex28_Ex36;

/**
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
 */
public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar(
                "Toyota", "CX1", "Blue", 4,
                new Engine(3.5D, 5400D, 50D));
        System.out.println(sportCar.toString());
    }


}
