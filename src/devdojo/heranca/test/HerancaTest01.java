package devdojo.heranca.test;

import devdojo.heranca.dominio.Endereco;
import devdojo.heranca.dominio.Funcionario;
import devdojo.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Projetada 2");
        endereco.setCep("87120000");

        Pessoa pessoa = new Pessoa("Faker");
//        pessoa.setNome("Faker");
        pessoa.setCpf("123456789");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario("Gumayusi");
//        funcionario.setNome("Gumayusi");
        funcionario.setCpf("987654321");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20200);
        funcionario.imprime();

    }
}
