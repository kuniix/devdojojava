package devdojo.excecao.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

//        try {
//            talvezLanceUmaExcecao();
//        }catch (SQLException e) {
//            System.out.println("Dentro do SQLException");
//        }catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        try {
            talvezLanceUmaExcecao();
        }catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
        }

    }

    private static void talvezLanceUmaExcecao() throws SQLException, FileNotFoundException {

    }
}
