package devdojo.exercicios.dominio;

public class Pessoa {
    private String cpf;

    public void imprime(){
        System.out.println(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() < 11){
            System.out.println("CPF invalido");
        }else {
            this.cpf = cpf;
        }
    }
}
