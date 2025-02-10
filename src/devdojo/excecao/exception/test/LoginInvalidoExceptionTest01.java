package devdojo.excecao.exception.test;

import devdojo.excecao.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try{
            logar();
        }catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Luffy";
        String passwordDB = "jureg";

        System.out.println("Usuário: ");
        String usernameDigitado = sc.nextLine();
        System.out.println("Password: ");
        String passwordDigitado = sc.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)){
            throw new LoginInvalidoException("Usuario ou senha inválido!");
        }

        System.out.println("Usuario logado com sucesso!");
    }
}
