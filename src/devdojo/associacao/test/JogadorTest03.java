package devdojo.associacao.test;

import devdojo.associacao.dominio.Jogador;
import devdojo.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafú");
        Jogador jogador2 = new Jogador("Ronaldinho");
        Time time = new Time("Brasil");
        Jogador[] jogadores = { jogador1, jogador2 };

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprime();

        System.out.println("--- TIME ---");
        time.imprime();
    }
}
