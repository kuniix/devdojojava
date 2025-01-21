package devdojo.introducao;

public class EstRepeticao4 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição: valor da parcela tem que ser >= 1000
        double valorCarro = 50000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000){
                System.out.println("Parcela " + parcela+ " R$ "+ valorParcela);
            }else {
                break;
            }
        }

    }
}
