package devdojo.strings.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("L", "R"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        String numeros = "0123456789";
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2));
        System.out.println(numeros.substring(1));
        System.out.println(numeros.trim());

    }
}
