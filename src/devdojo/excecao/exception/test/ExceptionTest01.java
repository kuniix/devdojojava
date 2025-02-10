package devdojo.excecao.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
        deletarArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("Arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    private static void deletarArquivo(){
        File file = new File("Arquivo\\teste.txt");
        boolean isDeletado = file.delete();
        System.out.println("Arquivo deletado " + isDeletado);
    }
}
