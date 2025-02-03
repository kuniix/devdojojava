package devdojo.heranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estico de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização Funcionario 1 ");
    }

    {
        System.out.println("Dentro do bloco de inicialização Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }


    public double getSalario() {
        return salario;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.getNome() + " recebi o salario de " + this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
