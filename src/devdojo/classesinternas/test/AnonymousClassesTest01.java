package devdojo.classesinternas.test;

class Animal {
    public void walk(){
        System.out.println("Animal walking");
    }
}

class Dog extends Animal{
    @Override
    public void walk() {
        System.out.println("Dog walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Xureg walking");
            }
        };
    }
}
