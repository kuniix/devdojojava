package devdojo.colecoes.test;

import devdojo.colecoes.domain.Manga;
import devdojo.colecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(2L,"Shingeki no kyojin",19.99));
        mangas.add(new Manga(1L,"BerserK", 29.99));
        mangas.add(new Manga(4L,"Katekyo Hitman Reborn",15.99));
        mangas.add(new Manga(3L,"Hellsing Ultimate", 16.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(14L, "Yu Yu Hakusho", 17.99);

        System.out.println(mangas.lower(yuyu));

    }
}
