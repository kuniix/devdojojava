package devdojo.generics.test;

import devdojo.colecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Kurogane");
        lista.add(123L);
        lista.add(new Consumidor("Goku"));

        for (Object o : lista) {
            System.out.println(o);
        }
    }

    private static void add (List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
