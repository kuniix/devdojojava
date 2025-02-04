package devdojo.enumm.test;

import devdojo.enumm.dominio.Cliente;
import devdojo.enumm.dominio.TipoCliente;
import devdojo.enumm.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA,TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Jureg", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDdesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDdesconto(100));


    }
}
