package devdojo.regex.test;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d Tudo oque for digito
        // \D Tudo oque for !digito
        // \s Espaços em branco
        // \S Todos caracteres excluindo os brancos
        // \w a-z A-Z
        // \W Tudo que não for incluso no \w
        // []
//        String regex = "[a-zA-C]";
        String regex = "0[Xx][0-9a-fA-F]";
        //String texto = "abaaaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("regex:  0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posiçoes encontradas");

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group()+"\n");
        }

        int numeroHex = 0x59F86A;
        System.out.println(numeroHex);
    }
}
