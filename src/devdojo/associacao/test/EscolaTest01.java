package devdojo.associacao.test;

import devdojo.associacao.dominio.Escola;
import devdojo.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Faker");
        Professor prof2 = new Professor("Guma");
        Professor[] professores = {prof1, prof2};

        Escola escola = new Escola("T1 academy", professores);

        escola.imprime();
    }
}
