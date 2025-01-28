package devdojo.sobrecargametodos.test;

import devdojo.sobrecargametodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Reborn", "TV", 256, "Ação");
        anime.imprime();
    }
}
