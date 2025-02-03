package devdojo.modificadorfinal.test;

import devdojo.modificadorfinal.domain.Carro;
import devdojo.modificadorfinal.domain.Comprador;
import devdojo.modificadorfinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Lobister");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Puro Sangre");
        ferrari.imprime();



    }
}
