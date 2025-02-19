package devdojo.nio.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/lucas/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Paths.get("home/./lucas/./dev");
        System.out.println(path2);
        System.out.println(path2.normalize());

        System.out.println(" com if  ");
        if (Files.exists(path1)) {
            System.out.println(path1.normalize());
        }
    }
}
