package devdojo.introducaometodos.test;

import devdojo.introducaometodos.domain.Estudante;
import devdojo.introducaometodos.domain.ImpressaoEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressaoEstudante impressora = new ImpressaoEstudante();

        estudante1.nome = "Jin";
        estudante1.idade = 17;
        estudante1.sexo = 'M';

        estudante2.nome = "Madoka";
        estudante2.idade = 18;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
