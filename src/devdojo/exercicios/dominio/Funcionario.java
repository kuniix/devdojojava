package devdojo.exercicios.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if (salarios != null) {
            return;
        }
        for (double num : salarios) {
            System.out.println("Salario: " + num);
        }
    }

    public void imprimirMedia() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if (salarios != null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        System.out.println("Media: " + media / salarios.length);
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

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
