package devdojo.introducaometodos.test;

import devdojo.introducaometodos.domain.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int numero1 =1;
        int numero2 =3;

        System.out.println("Dentro do método ---");
        calculadora.alteraDoisNumeros(numero1,numero2);
        System.out.println("Fora do método");
        System.out.println("Num1" + numero1);
        System.out.println("Num2" + numero2);
    }
}
