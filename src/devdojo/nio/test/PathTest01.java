package devdojo.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\lobis\\Desktop\\Curso java\\Javex\\DojoAcademyJava\\pasta2\\arquivo.txt");
        Path p2 = Paths.get("C:","\\Users\\lobis\\Desktop\\Curso java\\Javex\\DojoAcademyJava\\pasta2\\","arquivo.txt");
        System.out.println(p1.getFileName());

    }
}
