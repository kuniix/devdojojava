package devdojo.construtores.test;

import devdojo.construtores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Reborn", "Ação", "TV", 256);
        anime.imprime();

        Anime anime2 = new Anime();

    }
}
