package devdojo.streams.test;

import devdojo.streams.domain.Category;
import devdojo.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        for (LightNovel lightNovel : lightNovelList) {
            switch (lightNovel.getCategory()){
                case FANTASY: drama.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
                case DRAMA: fantasy.add(lightNovel); break;
            }
        }

        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        categoryLightNovelMap.put(Category.ROMANCE, romance);
        categoryLightNovelMap.put(Category.DRAMA, drama);
        System.out.println(categoryLightNovelMap);

        Map<Category, List<LightNovel>> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }
}
