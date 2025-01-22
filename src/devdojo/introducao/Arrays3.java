package devdojo.introducao;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {6,4,5,2,9,4};
        int[] numeros3 = new int[]{1,2,3,4,5};

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros2[i]);
        }
        System.out.println("///////////////");
        for (int num: numeros2) {
            System.out.println(num);
        }
    }
}
