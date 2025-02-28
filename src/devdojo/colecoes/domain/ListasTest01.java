package devdojo.colecoes.domain;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListasTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        nomes.add("Lucas");
        nomes.add("DevDojo Academy");
        nomes.add("Lobster");
//        nomes.remove("Lucas");
//        nomes.remove(0);

        for (String nome : nomes){
            System.out.println(nome);
        }

        nomes.add("Lagostones");

        int size = nomes.size();

        System.out.println("-----------");

        for (int index = 0;  index < nomes.size(); index++){
            System.out.println(nomes.get(index));
        }

        System.out.println(nomes);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);

        nomes.addAll(nomes2);
        System.out.println(nomes2);
    }
}
