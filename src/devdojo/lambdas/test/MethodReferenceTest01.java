package devdojo.lambdas.test;

import devdojo.lambdas.domain.Anime;
import devdojo.lambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 5), new Anime("Hitman Reborn", 200), new Anime("Akudama drive", 500)));
//        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        Collections.sort(animeList, AnimeComparator::compareByTitle);
//        Collections.sort(animeList, AnimeComparator::compareByEpisodes);

        animeList.sort(AnimeComparator::compareByTitle);
        System.out.println(animeList);
        System.out.println("--------");
        animeList.sort(AnimeComparator::compareByEpisodes);
        System.out.println(animeList);

    }
}
