package devdojo.generics.service;

import devdojo.generics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(
            List.of(new Barco("Lancha"),
                    new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando Barcos disponiveis");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando Barco: " + barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco Barco){
        System.out.println("Devolvendo Barco " + Barco);
        barcosDisponiveis.add(Barco);
        System.out.println("Barcos disniveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
