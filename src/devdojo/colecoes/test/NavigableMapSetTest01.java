package devdojo.colecoes.test;

import devdojo.colecoes.domain.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapSetTest01 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Lucas Norato");
        Consumidor consumidor2 = new Consumidor("Naiara Cristina");
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("D", "Letra D");
        map.put("E", "Letra E");

//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

        System.out.println(map.headMap("C"));
    }
}
