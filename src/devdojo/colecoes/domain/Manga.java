package devdojo.colecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String titulo;
    private double preco;
    private int quantidade;

    public Manga(Long id, String titulo, Double preco) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(titulo);
        Objects.requireNonNull(preco);
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
    }

    public Manga(Long id, String titulo, double preco, int quantidade) {
        this(id, titulo, preco);
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(titulo, manga.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo);
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga outroManga) {
        //negativo se o this < outroManga
        //se this for == outroManga, return 0
        //positivo se this > outroManga

//        if (this.id < outroManga.getId()
//        ) {
//            return -1;
//        }
//        if (this.id.equals(outroManga.getId())) {
//            return 0;
//        }else {
//            return 1;
//        }

//        return  this.titulo.compareTo(outroManga.getTitulo());
        return Double.compare(preco, outroManga.getPreco());
//        return this.id.compareTo(outroManga.getId());
    }
}
