package devdojo.exercicios.dominio;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public void imprime(){
        System.out.println("Numero Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo < 0){
            System.out.println("Saldo Negativado");
        }else {
            this.saldo = saldo;
        }
    }
}
