package devdojo.colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();

        fila.add("A");
        fila.add("B");
        fila.add("C");
        fila.add("D");

        for (String s : fila) {
            System.out.println(s);
        }

        while(!fila.isEmpty()) {
            System.out.println(fila.peek());
        }
    }
}
