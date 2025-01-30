package devdojo.associacao.desafio.domain;

public class Semiario {
    private String titulo;
    private Estudante[] estudantes;
    private Local local;
    private Professor professor;

    public Semiario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }


    public Semiario(String nome, Estudante[] estudantes, Local local) {
        this.titulo = nome;
        this.estudantes = estudantes;
        this.local = local;
    }

    public Semiario(String titulo, Estudante[] estudantes, Local local, Professor professor) {
        this.titulo = titulo;
        this.estudantes = estudantes;
        this.local = local;
        this.professor = professor;
    }


    public void imprime(){
        System.out.println(this.titulo +" Local: " + local.getEndereco());
        System.out.println("Professor: " + professor.getNome());
        if (this.local == null) return;
        if (estudantes == null) return;
        for (Estudante estudante : this.estudantes) {
            System.out.println(estudante.getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
