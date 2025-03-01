package devdojo.generics.test;

import devdojo.generics.domain.Barco;
import devdojo.generics.domain.Carro;
import devdojo.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Audi")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Jetsky")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);

        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês");
        System.out.println("Retornando o carro");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);

        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("usando o barco por 1 mes");
        System.out.println("Retornando o barco");
        rentalServiceBarco.retornarObjetoAlugado(barco);



    }
}
