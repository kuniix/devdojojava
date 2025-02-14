package devdojo.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d Tudo oque for digito
        // \D Tudo oque for !digito
        // \s Espaços em branco
        // \S Todos caracteres excluindo os brancos
        // \w a-z A-Z
        // \W Tudo que não for incluso no \w
        // []
        // ? Zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // | o(v|c)o ovo | oco
        // $ fim da linha
        // ,

//        String regex = "[a-zA-C]";
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        //String texto = "abaaaaba";

        String texto2 = "luffy@gmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail";
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
