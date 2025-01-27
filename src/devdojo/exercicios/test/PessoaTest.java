package devdojo.exercicios.test;

import devdojo.exercicios.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoinha = new Pessoa();

        pessoinha.setCpf("12345678911");

        pessoinha.imprime();
    }
}
