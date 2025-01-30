package devdojo.associacao.desafio.test;

import devdojo.associacao.desafio.domain.Estudante;
import devdojo.associacao.desafio.domain.Local;
import devdojo.associacao.desafio.domain.Professor;
import devdojo.associacao.desafio.domain.Semiario;

public class DesafioTest {
    public static void main(String[] args) {
//        Objeto Local
        Local local1 = new Local("Minha casa");
        Local local2 = new Local("Online");

//         objeto do estudante
        Estudante estudante1 = new Estudante("Lucas", 26);
        Estudante estudante2 = new Estudante("Pedro", 25);

//         objeto do seminario
        Semiario seminario = new Semiario("Java devDojo", local1);
        Semiario seminario2 = new Semiario("C# devDojo", local2);

//        Objeto Professor
        Professor professor1 = new Professor("Silva", "C#");

//        inicialização do estudante
        Estudante[] estudantes = {estudante1, estudante2};

//        inicialização dos seminarios
        Semiario[] seminarios = {seminario, seminario2};

//        inicializalção professor
        professor1.setSemiarios(seminarios);


//        Seminario
        seminario.setEstudantes(estudantes);


//         Estudante
        estudante1.setSemiario(seminario);

//        Professor
      //  professor1.setSemiarios(seminarios);

        seminario.imprime();
      //  estudante1.imprime();
       // professor1.imprime();



    }
}
