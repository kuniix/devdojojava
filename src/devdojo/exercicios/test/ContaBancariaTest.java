package devdojo.exercicios.test;

import devdojo.exercicios.dominio.ContaBancaria;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta("1234567");
        conta.setTitular("Lobister Norato");
        conta.setSaldo(-15);
        conta.imprime();
    }
}
