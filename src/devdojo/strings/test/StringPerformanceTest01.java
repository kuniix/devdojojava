package devdojo.strings.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para a String "+ (fim - inicio) + "ms1");

        inicio = System.currentTimeMillis();
        concatStringBuilder5(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder "+ (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer "+ (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho){
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder5(int tamanho){
        StringBuilder texto = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer texto = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }
}
