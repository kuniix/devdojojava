package devdojo.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        ArrayList<String> nomesList = new ArrayList<>(List.of("Luffy", "Zoro", "Sanji", "Jinbe"));
        nomesList.sort(String::compareTo);
        System.out.println(nomesList);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("123"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(nomesList, "Sanji"));
    }
}
