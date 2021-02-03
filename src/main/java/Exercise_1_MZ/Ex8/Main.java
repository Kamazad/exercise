package Exercise_1_MZ.Ex8;

/**
 * Utwórz zmienną typu String, a następnie przypisz do niej imię “Olgierd”.
 * a. Wyświetl imię tak aby imię było wyświetlone dużymi literami
 * b. Wyświetl imię tak aby imię było wyświetlone małymi literami
 * c. Wyświetl długość imienia wykorzystująć odpowiednią metodę klasy String.
 * d. Korzystając z odpowiedniej metody sprawdź czy imię rozpoczyna się od litery
 * “O”
 * e. Korzystając z odpowiedniej metody sprawdź czy imię zawiera literę “e”.
 * f. Korzystając z odpowiedniej metody usuń litery “i” oraz “e” z imienia, a
 * następnie wyświetl imię po zmianach.
 * g. Wykorzystując pętlę for wyświetl kolejno litery imienia wraz z ich indeksem.
 * Spodziewany rezultat wygląda następująco
 * [1] = O
 * [2] = l
 * [3] = g
 * [4] = i
 * [5] = e
 * [6] = r
 * [7] = d
 */

public class Main {
    public static void main(String[] args) {
        String name = "Olgierd";

        //a.
        System.out.println(name.toUpperCase());
        //b.
        System.out.println(name.toLowerCase());
        //c.
        System.out.println("Długość Stringa " + name + " wynosi : " + name.length() + " liter");
        //d.
        System.out.println(name.startsWith("O"));
        //e.
        System.out.println(name.contains("e"));
        //f.
        String name2;
        name2 = name.replace("e", "");
        name2 = name2.replace("i", "");
        System.out.println(name2);
        //g.
        for (int i = 0; i < name.length(); i++) {
            System.out.println("[" + (i + 1) + "] = " + name.charAt(i));
        }
    }

}
