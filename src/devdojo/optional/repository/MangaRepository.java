package devdojo.optional.repository;


import devdojo.optional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(
            new Manga(1, "Horimiya", 12),
            new Manga(2, "Hunter x Hunter", 120),
            new Manga(3, "To aru Majutsu no Index", 50),
            new Manga(4, "GetBackers", 26));


    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

    public static Optional<Manga> findById(int id) {
        return findBy(m -> m.getId() == id);
    }

    public static Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTitulo().equals(title));
    }
}
