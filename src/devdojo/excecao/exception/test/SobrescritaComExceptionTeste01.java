package devdojo.excecao.exception.test;

import devdojo.excecao.exception.domain.Funcionario;
import devdojo.excecao.exception.domain.LoginInvalidoException;
import devdojo.excecao.exception.domain.Pessoa;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) throws LoginInvalidoException {
        Pessoa p1 = new Pessoa();
        Funcionario f1 = new Funcionario();

        try {
            f1.salvar();
        }catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
