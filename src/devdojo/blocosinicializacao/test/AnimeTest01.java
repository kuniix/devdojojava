package devdojo.blocosinicializacao.test;

import devdojo.blocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Rakudai Kishi");

        for (int episodio : anime1.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
