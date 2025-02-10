package devdojo.excecao.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1,0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado");
    }

    private static int divisao(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento incorreto, não pode ser 0");
        }
        return a / b;
//        try {
//            return a / b;
//        }catch (RuntimeException e){
//            e.printStackTrace();
//        }
//        return 0;
    }
}
