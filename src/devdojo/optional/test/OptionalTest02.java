package devdojo.optional.test;

import devdojo.optional.domain.Manga;
import devdojo.optional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Hunter x Hunter");
        mangaByTitle.ifPresent(m -> m.setTitulo(m.getTitulo() + " 2"));
        System.out.println(mangaByTitle);

        MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        Manga novoManga = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(6, "Drifters", 45));
        System.out.println(novoManga);
    }
}
