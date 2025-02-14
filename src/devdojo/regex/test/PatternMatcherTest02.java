package devdojo.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d Tudo oque for digito
        // \D Tudo oque for !digito
        // \s Espaços em branco
        // \S Todos caracteres excluindo os brancos
        // \w a-z A-Z
        // \W Tudo que não for incluso no \w
        String regex = "\\w";
        String texto = "abaaaaba";
        String texto2 = "12gy21gy _2g1h1a";
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
