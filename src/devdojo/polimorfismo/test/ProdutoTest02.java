package devdojo.polimorfismo.test;

import devdojo.polimorfismo.domain.Computador;
import devdojo.polimorfismo.domain.Produto;
import devdojo.polimorfismo.domain.Televisao;
import devdojo.polimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 5", 895);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("================");

        Produto produto2 = new Tomate("Rasteiro", 2.25);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("================");

        Produto produto3 = new Televisao("Samsung 40\"", 3500);
        System.out.println(produto3.getNome());
        System.out.println(produto3.getValor());
        System.out.println(produto3.calcularImposto());
        System.out.println("===============");
    }
}
