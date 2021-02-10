package Exercise_3_SDA.Ex1_to_Ex10;

import java.util.LinkedList;
import java.util.List;

public class Main {
    /**
     * 1. Napisz klasę Cat, która w konstruktorze przyjmować będzie imię kota. Klasa powinna
     * posiadać metodę makeSound, która wypisywać będzie imię kota oraz wydawany przez niego
     * dźwięk.
     * 2. Utwórz tablicę kotów, dodaj do niej parę utworzonych obiektów i dla wszystkich wywołaj
     * metodę makeSound.
     * 3. Do klasy Cat dodaj metodę eatMouse, która będzie zliczała zjedzone przez kota myszy i
     * wypisywała komunikat: „Zjadłem X myszy”.
     * 4. Napisz klasę Dog, która w konstruktorze przyjmować będzie imię psa. Klasa powinna
     * posiadać metodę makeSound, która wypisywać będzie imię psa oraz wydawany przez niego
     * dźwięk.
     * 5. Utwórz tablicę zwierząt, dodaj do niej parę utworzonych obiektów typu Cat oraz Dog i dla
     * wszystkich wywołaj metodę makeSound.
     * 6. Napisz interfejs Movable, który będzie zawierał metodę move. Napisz klasę Car
     * implementującą interfejs Movable – w metodzie move ma wypisać komunikat „jadę”.
     * 7. Zmodyfikuj klasę Cat tak, żeby implementowała interfejs Movable – w metodzie move ma
     * wypisać komunikat „idę”.
     * 8. Utwórz klasę Vet, która będzie miała metodę sayHello przyjmującą jako parametr obiekt
     * klasy Cat i wypisującą powitanie dla tego kota, np. „Witaj Mruczek”.
     * 9. W klasie Vet napisz metodę sayHello przyjmującą jako parametr obiekt klasy Dog i
     * wypisującą powitanie dla tego psa, np. „Witaj Burek”.
     * 10. Zamiast dwóch wersji metody sayHello napisz jedną, która będzie potrafiła przyjąć w
     * parametrze obiekty klas Cat oraz Dog.
     */

    public static void main(String[] args) {
        Cat cat1 = new Cat("Mruczek");
        Cat cat2 = new Cat("Miałczek");
        Cat cat3 = new Cat("Filemon");
        Cat cat4 = new Cat("Bonifacy");

        cat1.makeSound();
        cat2.makeSound();
        cat3.makeSound();
        cat4.makeSound();

        List<Animals> animals = new LinkedList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(cat4);
        animals.add(new Dog("Burek"));
        animals.add(new Dog("Lub"));
        animals.add(new Dog("Inny"));
        animals.add(new Dog("Pies"));

        for (Animals a : animals){
            a.makeSound();
        }

    }
}
