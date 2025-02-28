package devdojo.colecoes.test;

import devdojo.colecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(2L,"Shingeki no kyojin",19.99,0));
        mangas.add(new Manga(1L,"BerserK", 29.99,5));
        mangas.add(new Manga(4L,"Katekyo Hitman Reborn",15.99,6));
        mangas.add(new Manga(3L,"Hellsing Ultimate", 16.99,0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
