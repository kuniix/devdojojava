package devdojo.enumm.dominio;

public enum TipoPagamento {
        DEBITO {
                @Override
                public double calcularDdesconto(double valor) {
                        return valor * 0.1;
                }
        }, CREDITO{
                @Override
                public double calcularDdesconto(double valor) {
                        return valor * 0.05;
                }
        };

        public abstract double calcularDdesconto(double valor);
}