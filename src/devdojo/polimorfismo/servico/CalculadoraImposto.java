package devdojo.polimorfismo.servico;

import devdojo.polimorfismo.domain.Computador;
import devdojo.polimorfismo.domain.Produto;
import devdojo.polimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto do Produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto: " + imposto);

        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());

            ((Tomate) produto).getDataValidade();
        }
    }
}
