package devdojo.interfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando arquivos");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
    }
}
