package devdojo.excecao.exception.test;

import devdojo.excecao.exception.domain.Leitor1;
import devdojo.excecao.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo3();

    }

//    public static void lerArquivo() {
//        Reader reader = null;
//        try {
//            reader = new BufferedReader(new FileReader("teste.txt)");
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }

    public static void lerArquivo2() {
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        }catch (IOException e){

        }
    }

    public static void lerArquivo3() {
        try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){

        }
    }
}
