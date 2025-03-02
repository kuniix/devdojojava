package devdojo.generics.test;

import devdojo.generics.domain.Barco;
import devdojo.generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
//        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Merry Going"));

    }

    private static <T extends Comparable> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
}
