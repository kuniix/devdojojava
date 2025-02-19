package devdojo.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativiseTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/lucas/");
        Path clazz = Paths.get("/home/lucas/devdojofoda/olamundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);


        Path absoluto1 = Paths.get("/home/lucas/");
        Path absoluto2 = Paths.get("/usr/local/");
        Path absoluto3 = Paths.get("/home/lucas/devdojofoda/olamundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.20250218");

        System.out.println(absoluto1.relativize(absoluto3));
        System.out.println(absoluto3.relativize(absoluto1));
        System.out.println(absoluto1.relativize(absoluto2));
        System.out.println(relativo1.relativize(relativo2));
    }
}
