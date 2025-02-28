package devdojo.colecoes.test;

import devdojo.colecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("11111", "Pixel");
        Smartphone s3 = new Smartphone("22222", "Samsung");


        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("22222", "Samsung");
        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4);
    }
}
