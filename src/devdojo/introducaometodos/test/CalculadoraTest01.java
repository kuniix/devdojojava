package devdojo.introducaometodos.test;

import devdojo.introducaometodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("///////////");
        calculadora.subtraiDoisNumeros();
        System.out.println("///////////");
        calculadora.multiplicaDoisNumeros(10,1);

    }
}
