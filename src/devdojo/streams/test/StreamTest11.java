package devdojo.streams.test;

import devdojo.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Slime", 1.99),
            new LightNovel("Fullmetal Alchemist", 2.99),
            new LightNovel("Bakemonogatari", 7.89),
            new LightNovel("Nisemonogatari", 3.89),
            new LightNovel("Nisemonogatari", 3.89),
            new LightNovel("Rakudai Kishi no Chivalry", 9.99),
            new LightNovel("Rakudai Kishi no Chivalry", 9.99),
            new LightNovel("GetBackers", 3.99)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovelList.stream().count());
        System.out.println(lightNovelList.stream().collect(Collectors.counting()));

        lightNovelList.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovelList.stream().collect(Collectors.maxBy(
                Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(lightNovelList.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovelList.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));


        System.out.println(lightNovelList.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));
        lightNovelList.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);

        DoubleSummaryStatistics collect = lightNovelList.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String collect1 = lightNovelList.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(collect1);
    }
}
