package devdojo.regex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = " levi, Eren, Mikasa";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
