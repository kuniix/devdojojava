package devdojo.introducao;

public class ArraysMultidimensionais2 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][];

        int[] array = {1,2,3};

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[5];
        arrayInt[2] = array;

        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5}};

        for (int[] arrayBase: arrayInt2) {
            System.out.println("\n----");
            for (int num: arrayBase) {
                System.out.print(num);
            }
        }
    }
}
