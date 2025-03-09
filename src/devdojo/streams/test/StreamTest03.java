package devdojo.streams.test;

import devdojo.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
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
        Stream<LightNovel> stream = lightNovelList.stream();
        lightNovelList.forEach(System.out::println);
        long count1 = stream.filter(ln -> ln.getPrice() <= 4).count();
        long count2 = lightNovelList.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();


        System.out.println(count1);
        System.out.println(count2);
    }
}
