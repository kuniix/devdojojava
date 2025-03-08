package devdojo.optional.domain;

public class Manga {
    private Integer id;
    private String titulo;
    private int chapter;

    public Manga(Integer id, String titulo, int chapter) {
        this.id = id;
        this.titulo = titulo;
        this.chapter = chapter;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", chapter=" + chapter +
                '}';
    }
}
