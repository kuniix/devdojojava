package devdojo.poointro.test;

import devdojo.poointro.domain.Carro;

import java.sql.SQLOutput;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Skyline";
        carro1.modelo = "R34";
        carro1.ano = 1996;
        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);


        Carro carro2 = new Carro();
        carro2.nome = "Mazda";
        carro2.modelo = "RX7";
        carro2.ano = 1994;
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);

        Carro carro3 = new Carro();
        carro3 = carro1;
        carro3.ano = 2001;
        System.out.println(carro3.nome + " " + carro3.modelo + " " + carro3.ano);
    }
}
