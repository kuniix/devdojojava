package devdojo.strings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Lucas Norato";
        nome.concat("DevDojo");
        nome.substring(0,3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Lucas Norato");
        sb.append(" DevDojo").append(" Academy");
        String subString = sb.substring(1,2);
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
