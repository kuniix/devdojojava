package devdojo.introducaometodos.test;

import devdojo.introducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.divideDoisNumeros(2,51);
        // System.out.println(calculadora.divideDoisNumeros(20,4));
        // System.out.println(calculadora.divideDoisNumeros(15,0));
        calculadora.divideDoisNumeros(15,0);
    }
}
