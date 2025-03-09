package devdojo.streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Naiara Cristina", "Jumentossauro rex", "Big O");
        List<String> developers = List.of("Lucas Norato", "Vagazoides", "Big Mike");
        List<String> students = List.of("Eliezer", "Gabriel", "Leo");

        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        for (List<String> people : devDojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("-------");

        devDojo.stream()
                .flatMap(Collection::stream).forEach(System.out::println);

        System.out.println("================");

        devDojo.stream().flatMap(Collection::stream)
                .filter(nome -> nome.startsWith("L"))
                .forEach(System.out::println);

        List<String> nomesComN = devDojo.stream()
                .flatMap(Collection::stream)
                .filter(nome -> nome.startsWith("N"))
                .collect(Collectors.toList());// ou usar somente o .tolist

        System.out.println(nomesComN);

        System.out.println("==================");

        devDojo.stream()
                .flatMap(Collection::stream)
                .filter(nome -> nome.startsWith("B"))
                .forEach(System.out::println);

    }
}
