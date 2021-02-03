package Exercise_1_MZ.Ex6;

import java.util.*;

/**
 * Utwórz kolejkę Queue korzystając z implementacji PriorityQueue.
 * a. Pobierz od użytkownika ilość liczb jakie mają zostać wylosowane
 * b. Wylosuj wskazaną przez użytkownika ilość liczb korzystając z klasy Random
 * z zakresu <1,100> i dodaj je do kolejki.
 * c. Wyświetl kolejno liczby występujące w kolejce.
 */

public class Main {
    public static void main(String[] args) {
        //implementation on Queue
        Queue<Integer> queue = new PriorityQueue<>();

        //a.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb chcech wylosować ? ");

        int howMany = scanner.nextInt();

        //b.
        Random generator = new Random(50000);
        for (int i = 0; i < howMany; i++) {
            queue.offer(generator.nextInt(100));
        }


        //c.

        //przepisanie do tablicy i wyrzucenie w kolejności
        List<Integer> temp = new ArrayList<>();
        int sizeQueue = queue.size();

//        for (int i = 0; i < sizeQueue; i++) {
//            temp.add(queue.poll());
//        }
//        for (Integer x : temp){
//            System.out.println(x.intValue());
//        }
        for (int i = 0; i < sizeQueue; i++) {
            System.out.println((queue.poll()));
        }

    }
}
