package devdojo.streams.test;

import devdojo.streams.domain.Category;
import devdojo.streams.domain.LightNovel;
import devdojo.streams.domain.PROMOTION;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
        Map<PROMOTION, List<LightNovel>> collect = lightNovelList.stream()
                .collect(Collectors.groupingBy(p -> {
                    return p.getPrice() < 6 ? PROMOTION.UNDER_PROMOTION : PROMOTION.NORMAL_PRICE;
                }));
        System.out.println(collect);

        Map<Category, Map<PROMOTION, List<LightNovel>>> collect1 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(p -> {
            return p.getPrice() < 6 ? PROMOTION.UNDER_PROMOTION : PROMOTION.NORMAL_PRICE;
        })));
        System.out.println(collect1);
    }
}
