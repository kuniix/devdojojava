package devdojo.lambdas.test;

import devdojo.lambdas.domain.Anime;
import devdojo.lambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparator> newAnimeComparator = AnimeComparator::new;
        AnimeComparator animeComparator = newAnimeComparator.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 5), new Anime("Hitman Reborn", 200), new Anime("Akudama drive", 500)));

        animeList.sort(animeComparator::compareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction1 = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction1.apply("Inazuma Eleven", 35));
    }
}
