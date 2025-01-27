package devdojo.introducaometodos.test;

import devdojo.introducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

//        pessoa.setNome("Tsuna");
//        pessoa.setIdade(16);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
