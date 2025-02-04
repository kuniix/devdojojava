package devdojo.enumm.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);
/*
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){

    }*/

    public final int VALOR;

    TipoCliente(int valor) {
        this.VALOR = valor;
    }

}
