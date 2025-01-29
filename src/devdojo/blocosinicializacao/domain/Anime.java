package devdojo.blocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {
        for (int numero : episodios) {
            System.out.println("Episodio: " + numero);
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
