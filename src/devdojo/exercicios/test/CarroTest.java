package devdojo.exercicios.test;

import devdojo.exercicios.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.setMarca("Wolksvagen");
        carro1.setModelo("Gol");
        carro1.setAno(1991);
        carro1.imprimeCarro();
    }
}
