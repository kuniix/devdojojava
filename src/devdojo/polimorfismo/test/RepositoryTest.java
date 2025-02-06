package devdojo.polimorfismo.test;

import devdojo.polimorfismo.repository.Repository;
import devdojo.polimorfismo.servico.RepositorioArquivo;
import devdojo.polimorfismo.servico.RepositorioBancoDeDados;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repositorio = new RepositorioArquivo();

        repositorio.salvar();

    }
}
