package devdojo.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Shingeki no kyojin");
        mangas.add("Berser");
        mangas.add("Katekyo Hitman Reborn");
        mangas.add("Hellsing Ultimate");

        Collections.sort(mangas);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.0);
        dinheiros.add(25.0);
        dinheiros.add(2952.0);
        dinheiros.add(2.0);

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);

    }
}
