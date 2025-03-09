package devdojo.streams.test;

import devdojo.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(lightNovelList.stream().anyMatch(ln -> ln.getPrice() > 8));
        System.out.println(lightNovelList.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovelList.stream().noneMatch(ln -> ln.getPrice() > 0));
        lightNovelList.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findAny()
                .ifPresent(System.out::println);

        lightNovelList.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
