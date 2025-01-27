package devdojo.introducaometodos.test;

import devdojo.introducaometodos.domain.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);

        System.out.println("/////////////////");

        calculadora.somaVarArgs(1,2,3,4,5);
    }
}
