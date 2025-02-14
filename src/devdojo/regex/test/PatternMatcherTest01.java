package devdojo.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abaaaaba";
        String texto2 = "abababababababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("regex:  0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posiçoes encontradas");

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group());
        }
    }
}
