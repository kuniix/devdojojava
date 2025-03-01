package devdojo.generics.test;


import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatitos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatitos);

        List<Animal> animals = new ArrayList<>();
        printConsulta(animals);
        printConsulta(cachorros);
    }

    private static void printConsulta(List <? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animals){
//        for (Object o : animals) {
//            if (o instanceof Cachorro) {
//                Cachorro cachorro = (Cachorro) o;
//            }
//        }

        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
