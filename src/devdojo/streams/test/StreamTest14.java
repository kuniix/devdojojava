package devdojo.streams.test;

import devdojo.streams.domain.Category;
import devdojo.streams.domain.LightNovel;
import devdojo.streams.domain.PROMOTION;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Slime", 1.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 2.99,Category.FANTASY),
            new LightNovel("Bakemonogatari", 7.89, Category.ROMANCE),
            new LightNovel("Nisemonogatari", 3.89, Category.ROMANCE),
            new LightNovel("Nisemonogatari", 3.89, Category.ROMANCE),
            new LightNovel("Rakudai Kishi no Chivalry", 9.99, Category.DRAMA),
            new LightNovel("Rakudai Kishi no Chivalry", 9.99, Category.DRAMA),
            new LightNovel("GetBackers", 3.99, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovelList.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect2);
    }
}
