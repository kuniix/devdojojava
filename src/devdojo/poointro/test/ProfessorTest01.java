package devdojo.poointro.test;

import devdojo.poointro.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Bala";
        prof.idade = 26;
        prof.sexo = 'M';

        System.out.println(prof.idade + " " + prof.nome + " " + prof.sexo);
    }
}
