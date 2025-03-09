package devdojo.streams.test;

//1. order light novel by title
//2. retrieve the first 4 light novels with price less than 4

import devdojo.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Slime", 1.99),
            new LightNovel("Fullmetal Alchemist", 2.99),
            new LightNovel("Bakemonogatari", 7.89),
            new LightNovel("Nisemonogatari", 3.89),
            new LightNovel("Rakudai Kishi no Chivalry", 9.99),
            new LightNovel("GetBackers", 3.99)
    ));

    public static void main(String[] args) {
        lightNovelList.sort(Comparator.comparing(LightNovel::getTitle));

        List<String> lightNovelTitles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovelList) {
            if (lightNovel.getPrice() <= 4){
                String lightNovelTitle = lightNovel.getTitle();
                lightNovelTitles.add(lightNovelTitle);
            }
            if (lightNovelTitles.size() >=3){
                break;
            }
        }

        System.out.println(lightNovelList);
        System.out.println(lightNovelTitles);
    }
}
