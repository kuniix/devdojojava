package devdojo.streams.test;

import devdojo.streams.domain.Category;
import devdojo.streams.domain.LightNovel;
import devdojo.streams.domain.PROMOTION;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamTest15 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Slime", 1.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 2.99, Category.FANTASY),
            new LightNovel("Bakemonogatari", 7.89, Category.ROMANCE),
            new LightNovel("Nisemonogatari", 3.89, Category.ROMANCE),
            new LightNovel("Nisemonogatari", 3.89, Category.ROMANCE),
            new LightNovel("Rakudai Kishi no Chivalry", 9.99, Category.DRAMA),
            new LightNovel("Rakudai Kishi no Chivalry", 9.99, Category.DRAMA),
            new LightNovel("GetBackers", 3.99, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect1 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect1);

        Map<Category, Set<PROMOTION>> collect2 = lightNovelList.stream()
                .collect(Collectors.groupingBy
                        (LightNovel::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect2);

        Map<Category, LinkedHashSet<PROMOTION>> collect3 = lightNovelList.stream()
                .collect(groupingBy
                        (LightNovel::getCategory, mapping(StreamTest15::getPromotion, toCollection(LinkedHashSet::new))));
        System.out.println(collect3);

    }

    private static PROMOTION getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? PROMOTION.UNDER_PROMOTION : PROMOTION.NORMAL_PRICE;
    }
}
