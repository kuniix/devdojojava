package devdojo.associacao.desafio.domain;

public class Estudante {
    private String nome;
    private int idade;
    private Semiario semiario;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Estudante(String nome, int idade, Semiario semiario) {
        this.nome = nome;
        this.idade = idade;
        this.semiario = semiario;
    }

    public void imprime(){
        System.out.println("Nome: " + this.getNome() + " Idade: " + this.getIdade());
        getSemiario().imprime();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Semiario getSemiario() {
        return semiario;
    }

    public void setSemiario(Semiario semiario) {
        this.semiario = semiario;
    }
}
