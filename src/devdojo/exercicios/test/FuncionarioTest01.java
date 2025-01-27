package devdojo.exercicios.test;

import devdojo.exercicios.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Lobister");
        funcionario1.setIdade(26);
        funcionario1.setSalarios(new double[]{1200,1400,1600});

        funcionario1.imprimirMedia();
        funcionario1.imprimirDados();
    }
}
