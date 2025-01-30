package devdojo.associacao.test;

import devdojo.associacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Faker");
        Jogador jogador2 = new Jogador("Keria");
        Jogador jogador3 = new Jogador("Gumayusi");
        Jogador [] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }
}
