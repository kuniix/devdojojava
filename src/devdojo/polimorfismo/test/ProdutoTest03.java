package devdojo.polimorfismo.test;

import devdojo.polimorfismo.domain.Computador;
import devdojo.polimorfismo.domain.Produto;
import devdojo.polimorfismo.domain.Tomate;
import devdojo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Tomate rasteiro", 1.50);
        tomate.setDataValidade("17/07");

        Produto produto = new Computador("Ryzen 5", 860);

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
