package devdojo.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Natsu", "Alucard", "Kurogane");

        List<Integer> integers = (List<Integer>) map(strings, (String s) -> s.length());
        List<String> toUpper = map(strings, (String s1) -> s1.toUpperCase());

        System.out.println(integers);
        System.out.println(toUpper);

    }

    private static <T, R>List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
