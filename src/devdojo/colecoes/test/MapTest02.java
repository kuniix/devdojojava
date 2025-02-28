package devdojo.colecoes.test;

import devdojo.colecoes.domain.Consumidor;
import devdojo.colecoes.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Lucas Norato");
        Consumidor consumidor2 = new Consumidor("Naiara Cristina");

        Manga manga1 = new Manga(2L, "Shingeki no kyojin", 19.99);
        Manga manga2 = new Manga(1L, "BerserK", 29.99);
        Manga manga3 = new Manga(4L, "Katekyo Hitman Reborn", 15.99);
        Manga manga4 = new Manga(3L, "Hellsing Ultimate", 16.99);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);

        for(Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " = " + entry.getValue().getTitulo());
        }

    }
}
