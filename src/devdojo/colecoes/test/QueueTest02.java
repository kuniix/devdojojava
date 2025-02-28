package devdojo.colecoes.test;

import devdojo.colecoes.domain.Consumidor;
import devdojo.colecoes.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(2L,"Shingeki no kyojin",19.99));
        mangas.add(new Manga(1L,"BerserK", 29.99));
        mangas.add(new Manga(4L,"Katekyo Hitman Reborn",15.99));
        mangas.add(new Manga(3L,"Hellsing Ultimate", 16.99));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
