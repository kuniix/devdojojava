package devdojo.lambdas.test;

import devdojo.comportamento.domain.Car;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> lista = List.of("Lucas", "Zoro", "Madara", "Pain");
        List<Integer> listaInteiro = List.of(1, 2, 3, 4, 5, 6);
        forEach(lista,(String s) -> System.out.println(s));
        forEach(listaInteiro, i -> System.out.println(i));
        List<Car> listaCar = List.of(
                new Car("preto",1998),
                new Car("White", 2001));

        forEach(listaCar, System.out::println);
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
