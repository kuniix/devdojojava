package devdojo.colecoes.test;

import devdojo.colecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(2L,"Shingeki no kyojin",19.99));
        mangas.add(new Manga(1L,"BerserK", 29.99));
        mangas.add(new Manga(4L,"Katekyo Hitman Reborn",15.99));
        mangas.add(new Manga(3L,"Hellsing Ultimate", 16.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(4L,"Katekyo Hitman Reborn",15.99);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
