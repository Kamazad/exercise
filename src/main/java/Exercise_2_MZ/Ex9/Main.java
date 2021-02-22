package Exercise_2_MZ.Ex9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 9. Przygotuj aplikację pobierającą od użytkownika dowolny tekst. Wprowadzony tekst
 * powinien zostać podzielony na słowa (korzystając z metody split klasy String), a
 * następnie program powinien wyświetlić statystyki wpisanego przez użytkownika
 * tekstu.
 * Ilość słów: <ilość_słów>
 * Ilość wprowadzonych znaków: <ilość_znaków>
 * Średnia długość wprowadzonego słowa: <ilość_znaków>
 * Najdłuższe słowo: <ilość_znaków>
 * Najkrótsze słowo: <ilość_znaków>
 * Do testów użyj podanego zdania:
 * “Drogi Marszałku, Wysoka Izbo. PKB rośnie. Z pełną odpowiedzialnością mogę
 * stwierdzić iż realizacja określonych zadań stanowionych przez organizację. Dalszy
 * rozwój jest ważne zadanie w większym stopniu tworzenie odpowiednich warunków
 * aktywizacji. Często niezauważanym szczegółem jest to, że zakres i rozwijanie
 * struktur pociąga za najważniejszy punkt naszych działań obierzemy praktykę, nie zaś
 * teorię, okazuje się jasne.”
 */

public class Main {
    public static void main(String[] args) {
        final String text = "Drogi Marszałku, Wysoka Izbo. PKB rośnie. Z pełną odpowiedzialnością mogę" +
                " * stwierdzić iż realizacja określonych zadań stanowionych przez organizację. Dalszy" +
                " * rozwój jest ważne zadanie w większym stopniu tworzenie odpowiednich warunków" +
                " * aktywizacji. Często niezauważanym szczegółem jest to, że zakres i rozwijanie" +
                " * struktur pociąga za najważniejszy punkt naszych działań obierzemy praktykę, nie zaś" +
                " * teorię, okazuje się jasne.";
//        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj tekst do sprawdzenie statystyk: ");
//        String word = scanner.nextLine();


        String[] tablicaSlow = text.split(" ");
        String[] tablicaWprowadzonychZnakow = text.split("");

        int iloscSlow = tablicaSlow.length;
        int iloscWprowadzonychZnakow = tablicaWprowadzonychZnakow.length;
        double sredniaDlugoscWprowadzonegoSlowa = iloscWprowadzonychZnakow / iloscSlow;

        String najdluzszeSlowo = tablicaSlow[0];
        String najkrotszeSlowo = tablicaSlow[0];

        for (int i = 0; i < tablicaSlow.length - 1; i++) {
            if (najkrotszeSlowo.length() > tablicaSlow[i].length()) {
                najkrotszeSlowo = tablicaSlow[i];
            }
            if (najdluzszeSlowo.length() < tablicaSlow[i].length()) {
                najdluzszeSlowo = tablicaSlow[i];
            }
        }

        int dlugoscNajdluzszegoSlowa = najdluzszeSlowo.length();
        int dlugoscNajkrotszegoSlowa = najkrotszeSlowo.length();

        System.out.println(String.format("Ilość słów: %d\n" +
                        "Ilość wprowadzonych znaków: %d\n" +
                        "Średnia długość wprowadzonego słowa: %5.2f\n" +
                        "Najdłuższe słowo: %d\n" +
                        "Najkrótsze słowo: %d",
                iloscSlow, iloscWprowadzonychZnakow, sredniaDlugoscWprowadzonegoSlowa,
                dlugoscNajdluzszegoSlowa, dlugoscNajkrotszegoSlowa));


    }
}


