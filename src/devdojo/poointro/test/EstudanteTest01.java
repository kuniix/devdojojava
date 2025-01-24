package devdojo.poointro.test;

import devdojo.poointro.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();

        estudante1.nome = "Lucas";
        estudante1.idade = 26;
        estudante1.sexo = 'M';

        System.out.println(estudante1.nome + " " + estudante1.idade + " " + estudante1.sexo);

    }
}
