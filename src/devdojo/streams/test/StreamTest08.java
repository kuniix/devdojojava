package devdojo.streams.test;

import devdojo.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
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
        lightNovelList.stream()
                .map(LightNovel::getPrice)
                .filter(lnprice -> lnprice > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovelList.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(lnprice -> lnprice > 3)
                .sum();
        System.out.println(sum);

    }
}
