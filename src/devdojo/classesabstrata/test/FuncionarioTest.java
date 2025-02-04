package devdojo.classesabstrata.test;

import devdojo.classesabstrata.domain.Desenvolvedor;
import devdojo.classesabstrata.domain.Funcionario;
import devdojo.classesabstrata.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);
        gerente.imprime();

        Desenvolvedor desenvolvedor = new Desenvolvedor("Lucas", 5000);
        System.out.println(desenvolvedor);
        desenvolvedor.imprime();
    }
}
