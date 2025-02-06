package devdojo.polimorfismo.servico;

import devdojo.polimorfismo.repository.Repository;

public class RepositorioArquivo implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando um arquivo");
    }
}
