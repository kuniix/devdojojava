package devdojo.introducao;

public class Arrays1 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 20;
        idades[1] = 12;
        idades[2] = 45;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

    }
}
