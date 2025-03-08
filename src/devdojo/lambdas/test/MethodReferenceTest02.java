package devdojo.lambdas.test;

import devdojo.lambdas.domain.Anime;
import devdojo.lambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 5), new Anime("Hitman Reborn", 200), new Anime("Akudama drive", 500)));
        animeList.sort(animeComparator::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
