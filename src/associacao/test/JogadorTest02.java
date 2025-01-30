package associacao.test;

import associacao.dominio.Jogador;
import associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Faker");
        Time time = new Time("T1");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
