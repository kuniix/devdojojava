package devdojo.polimorfismo.servico;

import devdojo.polimorfismo.repository.Repository;

public class RepositorioMemoria implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando na memoria");
    }
}
