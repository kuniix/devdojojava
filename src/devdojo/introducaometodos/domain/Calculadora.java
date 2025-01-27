package devdojo.introducaometodos.domain;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }


    public void divideDoisNumeros(double num1, double num2){
        if (num1==0 || num2==0) {
            System.out.println("Divisão por 0 é 0");
        return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 98;
        System.out.println("Dentro do metodo alteraDoisNumeros");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
