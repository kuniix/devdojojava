package devdojo.polimorfismo.test;

import devdojo.polimorfismo.domain.Computador;
import devdojo.polimorfismo.domain.Televisao;
import devdojo.polimorfismo.domain.Tomate;
import devdojo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("I5 4460", 500);
        Tomate tomate = new Tomate("Tomate Rasteiro", 10);
        Televisao televisao = new Televisao("Samsung 40\"", 3500);


        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(televisao);
    }
}
