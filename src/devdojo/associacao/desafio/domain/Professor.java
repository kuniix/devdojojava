package devdojo.associacao.desafio.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Semiario[] semiarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Semiario[] semiarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.semiarios = semiarios;
    }

    public void imprime(){
        System.out.println("Professor: " + this.nome + "\nEspecialidade: " + this.especialidade);
        if (semiarios != null) {
            for (int i = 0; i < semiarios.length; i++) {
                semiarios[i].imprime();
            }
        }else return;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Semiario[] getSemiarios() {
        return semiarios;
    }

    public void setSemiarios(Semiario[] semiarios) {
        this.semiarios = semiarios;
    }
}
