package devdojo.polimorfismo.servico;

import devdojo.polimorfismo.repository.Repository;

public class RepositorioBancoDeDados implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
