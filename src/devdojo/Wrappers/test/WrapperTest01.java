package devdojo.Wrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 2;
        int intP = 3;
        long longP = 4;
        float floatP = 5f;
        double doubleP = 6d;
        char charP = 'A';
        boolean booleanP = false;

        Byte bytew = 1;
        Short shortw = 2;
        int intw = 3;
        Long longw = 4l;
        Float floatw = 5f;
        Double doublew = 6d;//Boxing
        Character charw = 'A';
        Boolean booleanw = false;

        int i = intw;  //UNBOXING

        Integer intW2 = Integer.parseInt("1");
        Boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));


        System.out.println(doublew.doubleValue());
    }
}
