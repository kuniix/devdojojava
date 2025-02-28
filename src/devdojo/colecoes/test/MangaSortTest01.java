package devdojo.colecoes.test;

import devdojo.colecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(2L,"Shingeki no kyojin",19.99));
        mangas.add(new Manga(1L,"BerserK", 29.99));
        mangas.add(new Manga(4L,"Katekyo Hitman Reborn",15.99));
        mangas.add(new Manga(3L,"Hellsing Ultimate", 16.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas, new MangaByIdComparator());
        System.out.println("-----------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
