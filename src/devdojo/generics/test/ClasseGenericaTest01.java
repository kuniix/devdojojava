package devdojo.generics.test;

import devdojo.generics.domain.Barco;
import devdojo.generics.domain.Carro;
import devdojo.generics.service.BarcoRentavelService;
import devdojo.generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando barco por 1 mes...");
        barcoRentavelService.retornarBarcoAlugado(barco);
        System.out.println("retornando barco");
    }
}
